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
		System.out.println("Opa! Essa op��o ainda n�o existe...");
	}
	
	public void difficultyChooser() {
		boolean validChoice = false;
		while(validChoice != true) {
			System.out.println("Qual o n�vel de dificuldade que voc� deseja enfrentar?\n"
					+ "1 - F�cil\n" + "2 - Regular\n" + "3 - Dif�cil\n");
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
				System.out.println("\nIncr�vel! " + name + " � um nome muito forte!");
				validName = true;
				fighterName = name;
			}
			else {
				System.out.println("Esse nome � muito curto! ");
			}
		}
	}
		
	public void genderChooser() {
			System.out.println("Qual o sexo do seu personagem?\n"
					+ "1 - Feminino\n" + "2 - Masculino\n" + "3 - N�o bin�rio\n");
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
		String paragraphOne = "\nA noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo\n"
				+ "voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e\n"
				+ "sabe que a partir desse ponto, sua vida mudar� para sempre.\n";
		String paragraphTwo = "Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de\n"
				+ "todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu\n"
				+ "equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um\n"
				+ "passo de encerrar para sempre esse mal.";
		System.out.println(paragraphOne + paragraphTwo);
	}
	
	public void motivation() {
		boolean validMotivation = false;
		while (validMotivation != true) {
			System.out.println("\nBuscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.\n");
			System.out.println("1 - Vingan�a \n2 - Gl�ria");
			int motivationChoice = input.nextInt();
			if (motivationChoice == 1) {
				fighterMotivation = Motivation.VINGANCA;
				System.out.println("\nImagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar\r\n"
						+ "para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo,\r\n"
						+ "quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel\r\n"
						+ "que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles\r\n"
						+ "que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der\r\n"
						+ "finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).\r\n");
				validMotivation = true;
			}else if(motivationChoice == 2) {
				fighterMotivation = Motivation.GLORIA;
				System.out.println("\nVoc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os\r\n"
						+ "abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e\r\n"
						+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde\r\n"
						+ "j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir\r\n"
						+ "o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa\r\n"
						+ "hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");
				validMotivation = true;
			}else {
				invalidOptionMessage();
			}
		}
	}
	
	public void fightOrFlight() {
		System.out.println("\nInspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas\r\n"
				+ "m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. \r\n"
				+ "Voc� avan�a pelo portal.");
		System.out.println("\nA escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua\r\n"
				+ "frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir �\r\n"
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
		System.out.println("O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\r\n"
				+ "Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.\r\n");
	}
	
	public void fight() {
		System.out.println("Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente\r\n"
				+ "uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta\r\n"
				+ "aberta.\r\n");
			System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\r\n"
					+ "sobre como passar pela porta.\n"
					+ "\n1 - Andando cuidadosamente \n2 - Correndo \n3 - Saltando");
			int decision = input.nextInt();
			switch(decision) {
			case 1:
				System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc�\r\n"
						+ "pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado\r\n"
						+ "em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se\r\n"
						+ "abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta\r\n"
						+ "para dentro da sala, por�m uma delas te acerta na perna");
				player.setLife(player.getLife()-10);
				System.out.println("Sua vida est� em " + player.getLife() + ".");
				break;
			case 2:
				System.out.println("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta,\r\n"
						+ "sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala,\r\n"
						+ "olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas\r\n"
						+ "batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta,\r\n"
						+ "voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\r\n"
						+ "mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");
				break;
			case 3:
				System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior\r\n"
						+ "da sala.\r\n");
				break;
			default: 
				invalidOptionMessage();
				fight();
			}
			System.out.println("\nVoc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\r\n"
					+ "delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A\r\n"
					+ "porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc�\r\n"
					+ "n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima\r\n"
					+ "da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que\r\n"
					+ "precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\r\n"
					+ "enfrentar o l�der.\r\n"
					+ "\nVoc� se dirige para a porta � direita.\r\n"
					+ "");
		}
	
	public FighterFunction functionChooser() {
		System.out.println("Qual a sua fun��o especialidade?\n1 - Mago\n2 - Lutador\n3 - Atirador");
		int functionChoice = input.nextInt();
		switch(functionChoice){
			case 1:
				fighterFunctionChoice = new MageFunction();
				System.out.println("Voc� assume o que sempre temeu - que a magia que carrega dentro de si, escondido,"
						+ " � a chave para conquistar a " + fighterMotivation + ".");
				return fighterFunctionChoice;
			case 2:
				fighterFunctionChoice = new BruiserFunction();
				System.out.println("Voc� ergue a cabe�a, e fecha as m�os em punhos. Conquistar� a " + fighterMotivation
						+ " na base de sua for�a.");
				return fighterFunctionChoice;
			case 3:
				fighterFunctionChoice = new MarksmanFunction();
				System.out.println("Anos de treino de mira se resumem a este dia. Conquistar� a " + fighterMotivation + 
						" atrav�s da precis�o e agilidade de sua pontaria.");
				return fighterFunctionChoice;
			default:
				System.out.println("A escurid�o e o medo te confundem a ponto de voc� esquecer como conquistar� a "
						+ fighterMotivation + ".\n");
				functionChooser();
		}
		return fighterFunctionChoice;
	}
	
	public void weaponChooser(FighterFunction chosenRole) {
		System.out.println("Se preparando para enfrentar as batalhas que te aguardam, voc� tira sua arma da bolsa.. \n"
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
			System.out.println("Voc� n�o estava preparado para a for�a do inimigo");
			if(player.getMotivation() == Motivation.VINGANCA) {
				System.out.println("�N�o foi poss�vel concluir sua vingan�a, e\r\n"
						+ "agora resta saber se algu�m se vingar� por voc�");
			}
			else {
				deathScene();
			}
			return false;
		}
		else {
			System.out.println("O inimigo n�o � p�reo para o seu\r\n"
					+ "hero�smo, e jaz im�vel aos seus p�s.");
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
				System.out.println(attacker.getWeapon().getWeaponCatchphrase() + " Acerto cr�tico!");	
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
		System.out.println("\n1 - Sim\n2 - N�o");
		int decision = input.nextInt();
		if(decision==1 && currentDoor.getDoorNumber()==1) {
			System.out.println("Voc� resolve usar os equipamentos do\r\n"
					+ "inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de\r\n"
					+ "armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios\r\n"
					+ "� sua frente.");
			player.setArmor(player.getArmor()+5);
		}
		else if(decision==2 && currentDoor.getDoorNumber()==1) {
			System.out.println("Voc� decide que n�o precisa utilizar\r\n"
					+ "nada que venha das m�os do inimigo.");
		}
		else if(decision==1 && currentDoor.getDoorNumber()==2){
			System.out.println("�Voc� se sente revigorado para seguir adiante!");
			player.setLife(100.00);
		}
		else if(decision==2 && currentDoor.getDoorNumber()==2) {
			System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo");
		}
	}
		
	public void postCombatTransition() {
		currentDoor.getPostCombatTransition();
	}
	
	public void victoryScene() {
		System.out.println("Voc� conseguiu!");
		if (player.getMotivation() == Motivation.VINGANCA) {
			System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc�\r\n"
					+ "pode seguir sua vida.\r\n");
		}
		else {
			System.out.println("A �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de\r\n"
					+ "alegria. A gl�ria o aguarda, voc� a conquistou.\r\n");
		}
		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em\r\n"
				+ "dire��o � noite, retornando � cidade. Seu dever est� cumprido.\r\n");
	}

	private void deathScene() {
		if(player.getGender() == Sex.WOMAN) {
			System.out.println("A gl�ria que buscavas n�o ser� sua,\r\n"
					+ "e a cidade aguarda por sua pr�xima hero�na.");
		}
		else {
			System.out.println("A gl�ria que buscavas n�o ser� sua,\r\n"
					+ "e a cidade aguarda por seu pr�ximo her�i.");					
		}
	}

}
