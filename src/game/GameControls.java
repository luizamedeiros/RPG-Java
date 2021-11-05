package game;

import java.util.Scanner;

import door.Door;
import door.DoorOne;
import door.DoorThree;
import door.DoorTwo;

import java.util.Random;

import fighter.Motivation;
import fighter.Sex;
import fighter.Weapon;
import player.Player;
import fighter.BruiserFunction;
import fighter.EnemyFunction;
import fighter.FighterFunction;
import fighter.MageFunction;
import fighter.MarksmanFunction;


public class GameControls {
	int gameLevel;
	Sex fighterSex;
	String fighterName;
	Motivation fighterMotivation;
	String fighterFunctionRole;
	FighterFunction fighterFunctionChoice;
	Weapon playerWeapon;
	Player player;
	EnemyFunction enemies;
	Player currentEnemy;
	Door currentDoor;
	
	Scanner input = new Scanner(System.in);
	
	public int diceRoll() {
		int min = 1;
		int max = 20;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}
	
	public void start() {
		System.out.println("Bem vindo ao Desafio Final!");
	}
	
	public void invalidOptionMessage() {
		System.out.println("Opa! Essa opção ainda não existe...");
	}
	
	public void difficultyChooser() {
		boolean validChoice = false;
		while(validChoice != true) {
			System.out.println("Qual o nível de dificuldade que você deseja enfrentar?\n"
					+ "1 - Fácil\n" + "2 - Regular\n" + "3 - Difícil\n");
			int gameLevelChecker = input.nextInt();
			if (gameLevelChecker == 1 || gameLevelChecker == 2 || gameLevelChecker == 3) {
				gameLevel = gameLevelChecker;
				validChoice = true;
			}
			else {
				invalidOptionMessage();
			}
		}
	}
	
	public void namer() {
		System.out.println("Qual o nome do seu personagem?");
		String name = input.next();
		boolean validName = false;
		while (validName != true) {
			if (name.length() > 0) {
				System.out.println("\nIncrível! " + name + " é um nome muito forte!");
				validName = true;
				fighterName = name;
			}
			else {
				System.out.println("Esse nome é muito curto! ");
			}
		}
	}
		
	public void genderChooser() {
			System.out.println("Qual o sexo do seu personagem?\n"
					+ "1 - Feminino\n" + "2 - Masculino\n" + "3 - Não binário\n");
			String sexChecker = input.next();
			switch (sexChecker) {
			case "1":
				fighterSex = Sex.WOMAN;
				break;
			case "2":
				fighterSex = Sex.MAN;
				break;
			default: 
				invalidOptionMessage();
				genderChooser();
			}
		}
	
	public void intro() {
		String paragraphOne = "\nA noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\n"
				+ "você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e\n"
				+ "sabe que a partir desse ponto, sua vida mudará para sempre.\n";
		String paragraphTwo = "Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de\n"
				+ "todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu\n"
				+ "equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um\n"
				+ "passo de encerrar para sempre esse mal.";
		System.out.println(paragraphOne + paragraphTwo);
	}
	
	public void motivation() {
		boolean validMotivation = false;
		while (validMotivation != true) {
			System.out.println("\nBuscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n");
			System.out.println("1 - Vingança \n2 - Glória");
			int motivationChoice = input.nextInt();
			if (motivationChoice == 1) {
				fighterMotivation = Motivation.VINGANCA;
				System.out.println("\nImagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\r\n"
						+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\r\n"
						+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\r\n"
						+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\r\n"
						+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\r\n"
						+ "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).\r\n");
				validMotivation = true;
			}else if(motivationChoice == 2) {
				fighterMotivation = Motivation.GLORIA;
				System.out.println("\nVocê já consegue visualizar na sua mente o povo da cidade te recebendo de braços\r\n"
						+ "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\r\n"
						+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\r\n"
						+ "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\r\n"
						+ "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\r\n"
						+ "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
				validMotivation = true;
			}else {
				invalidOptionMessage();
			}
		}
	}
	
	public void fightOrFlight() {
		System.out.println("\nInspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\r\n"
				+ "mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. \r\n"
				+ "Você avança pelo portal.");
		System.out.println("\nA escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\r\n"
				+ "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\r\n"
				+ "frente, ou desistir");
		System.out.println("1 - Ir a frente\n2 - Desistir");
		int decision = input.nextInt();
		switch(decision){
		case 1:
			fight();
		case 2:
			flight();
		default:
			invalidOptionMessage();
			fightOrFlight();
	}
	}
	
	public void flight() {
		System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\r\n"
				+ "Você se volta para a noite lá fora e corre em direção à segurança.\r\n");
	}
	
	public void fight() {
		System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\r\n"
				+ "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
				+ "aberta.\r\n");
			System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
					+ "sobre como passar pela porta.\n"
					+ "\n1 - Andando cuidadosamente \n2 - Correndo \n3 - Saltando");
			int decision = input.nextInt();
			switch(decision) {
			case 1:
				System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\r\n"
						+ "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\r\n"
						+ "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\r\n"
						+ "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\r\n"
						+ "para dentro da sala, porém uma delas te acerta na perna");
				player.setLife(player.getLife()-10);
				System.out.println("Sua vida está em " + player.getLife() + ".");
				break;
			case 2:
				System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\r\n"
						+ "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\r\n"
						+ "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\r\n"
						+ "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,\r\n"
						+ "você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
						+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
				break;
			case 3:
				System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\r\n"
						+ "da sala.\r\n");
				break;
			default: 
				invalidOptionMessage();
				fight();
			}
			System.out.println("\nVocê se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\r\n"
					+ "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\r\n"
					+ "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\r\n"
					+ "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\r\n"
					+ "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\r\n"
					+ "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\r\n"
					+ "enfrentar o líder.\r\n"
					+ "\nVocê se dirige para a porta à direita.\r\n"
					+ "");
		}
	
	public FighterFunction functionChooser() {
		System.out.println("Qual a sua função especialidade?\n1 - Mago\n2 - Lutador\n3 - Atirador");
		int functionChoice = input.nextInt();
		switch(functionChoice){
			case 1:
				fighterFunctionChoice = new MageFunction();
				System.out.println("Você assume o que sempre temeu - que a magia que carrega dentro de si, escondido,"
						+ " é a chave para conquistar a " + fighterMotivation + ".");
				return fighterFunctionChoice;
			case 2:
				fighterFunctionChoice = new BruiserFunction();
				System.out.println("Você ergue a cabeça, e fecha as mãos em punhos. Conquistará a " + fighterMotivation
						+ " na base de sua força.");
				return fighterFunctionChoice;
			case 3:
				fighterFunctionChoice = new MarksmanFunction();
				System.out.println("Anos de treino de mira se resumem a este dia. Conquistará a " + fighterMotivation + 
						" através da precisão e agilidade de sua pontaria.");
				return fighterFunctionChoice;
			default:
				System.out.println("A escuridão e o medo te confundem a ponto de você esquecer como conquistará a "
						+ fighterMotivation + ".\n");
				functionChooser();
		}
		return fighterFunctionChoice;
	}
	
	public void weaponChooser(FighterFunction chosenRole) {
		System.out.println("Se preparando para enfrentar as batalhas que te aguardam, você tira sua arma da bolsa.. \n"
				+ "Qual a sua arma de maestria?" + "\n"
				+ "1 - " + chosenRole.getWeaponOne().getWeaponName() + "\n"
				+ "2 - " + chosenRole.getWeaponTwo().getWeaponName() + "\n"
				+ "3 - " + chosenRole.getWeaponThree().getWeaponName());
		int playerChoice = input.nextInt();
		switch(playerChoice) {
		case 1:
			playerWeapon = chosenRole.getWeaponOne();
			break;
		case 2:
			playerWeapon = chosenRole.getWeaponTwo();
			break;
		case 3:
			playerWeapon = chosenRole.getWeaponThree();
			break;
		default:
			invalidOptionMessage();
			weaponChooser(chosenRole);
		}
	}
	public void createUser() {
		player = new Player(fighterName, fighterSex, fighterMotivation, playerWeapon, fighterFunctionChoice);
	}
	public void createGameEnemies() {
		enemies = new EnemyFunction();
	}
	
	public int doorScene(int door) {
		int decision;
		switch(door) {
		case 1:
			currentDoor = new DoorOne();
			currentEnemy = currentDoor.getDoorEnemy();
			break;
		case 2:
			currentDoor = new DoorTwo();
			currentEnemy = currentDoor.getDoorEnemy();
			break;
		case 3:
			Door currentDoor = new DoorThree();
			currentEnemy = currentDoor.getDoorEnemy();
			break;
		}	
		System.out.println("\n1 - Atacar!\n2 - Recuar!\n3 - Fugir!");
		decision = input.nextInt();
		return decision;
	}
	
	public boolean combatStart(int decision) {
		boolean dead = false;
		switch(decision) {
		case 1:
			combatSequence(player, currentEnemy);
			break;
		case 2:
			combatSequence(currentEnemy, player);
			break;
		case 3: 
			flight();
			break;
		}
		if(decision!=3) {
			dead =checkDeath();
			return dead;
		}
		return dead;
	}
	
	public boolean checkDeath() {
		if (player.getLife()<=0) {
			System.out.println("Você não estava preparado para a força do inimigo");
			if(player.getMotivation() == Motivation.VINGANCA) {
				System.out.println("“Não foi possível concluir sua vingança, e\r\n"
						+ "agora resta saber se alguém se vingará por você");
			}
			else {
				deathScene();
			}
			return false;
		}
		else {
			System.out.println("O inimigo não é páreo para o seu\r\n"
					+ "heroísmo, e jaz imóvel aos seus pés.");
			return true;}
	}
	
	public void combatSequence(Player attacker, Player defender) {
		//variable for switching attacker and defender throughout combat sequence 
		Player placeholderVariable;
		while (attacker.getLife()>0 && defender.getLife() > 0) {
			combatRound(attacker, defender);
			placeholderVariable = attacker;
			attacker = defender;
			defender = placeholderVariable;
		}
		System.out.println(attacker.getName() + " morreu!");
	}
	
	public void combatRound(Player attacker, Player defender) {
			int dice = diceRoll();
			double damage = attacker.getDamage() + dice;
			if (dice==1) {
				damage = 0;
				System.out.println(attacker.getName() + " errou o golpe! ");
			}
			else if(dice == 20){
				defender.setLife(defender.getLife()-damage);
				System.out.println(attacker.getWeapon().getWeaponCatchphrase() + " Acerto crítico!");	
			}
			else {
				damage -= defender.getArmor();
				defender.setLife(defender.getLife()-damage);
				System.out.println(attacker.getName() + " atacou! ");
			}
			System.out.println(defender.getName() + " tem " + defender.getLife() + " de vida!\n");
	}
	
	public void postCombatSequence() {
		System.out.println(currentDoor.getPostCombatStory());
		System.out.println("\n1 - Sim\n2 - Não");
		int decision = input.nextInt();
		if(decision==1 && currentDoor.getDoorNumber()==1) {
			System.out.println("Você resolve usar os equipamentos do\r\n"
					+ "inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de\r\n"
					+ "armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios\r\n"
					+ "à sua frente.");
			player.setArmor(player.getArmor()+5);
		}
		else if(decision==2 && currentDoor.getDoorNumber()==1) {
			System.out.println("Você decide que não precisa utilizar\r\n"
					+ "nada que venha das mãos do inimigo.");
		}
		else if(decision==1 && currentDoor.getDoorNumber()==2){
			System.out.println("“Você se sente revigorado para seguir adiante!");
			player.setLife(100.00);
		}
		else if(decision==2 && currentDoor.getDoorNumber()==2) {
			System.out.println("Você fica receoso de beber algo produzido pelo inimigo");
		}
	}
		
	public void postCombatTransition() {
		currentDoor.getPostCombatTransition();
	}
	
	public void victoryScene() {
		System.out.println("Você conseguiu!");
		if (player.getMotivation() == Motivation.VINGANCA) {
			System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\r\n"
					+ "pode seguir sua vida.\r\n");
		}
		else {
			System.out.println("A êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\r\n"
					+ "alegria. A glória o aguarda, você a conquistou.\r\n");
		}
		System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em\r\n"
				+ "direção à noite, retornando à cidade. Seu dever está cumprido.\r\n");
	}

	private void deathScene() {
		if(player.getGender() == Sex.WOMAN) {
			System.out.println("A glória que buscavas não será sua,\r\n"
					+ "e a cidade aguarda por sua próxima heroína.");
		}
		else {
			System.out.println("A glória que buscavas não será sua,\r\n"
					+ "e a cidade aguarda por seu próximo herói.");					
		}
	}

}
