package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorOne extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o\r\n"
			+ "escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a\r\n"
			+ "outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha\r\n"
			+ "pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal\r\n"
			+ "do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem\r\n"
			+ "para espalhar o terror nas cidades e vilas da regi�o.\n\nEnquanto seu olhar percorre a sala, "
			+ "voc� ouve a porta se fechando e gira rapidamente para olhar\r\n"
			+ "para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um\r\n"
			+ "dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\r\n"
			+ "posi��o de combate. Ele avan�a em sua dire��o.\r\n";
	private Player doorEnemy = new Player("O Armeiro", null, null, enemies.getWeaponOne(), enemies);
	private String postCombatStory = "Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos\n"
			+ " est�o muito danificados, e olha\r"
			+ "em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado. \r\n"
			+ "Deseja pegar as armaduras?\r\n";
	private int doorNumber = 1;
	private String postCombatTransition = "Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das\r\n"
			+ "fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva\r\n"
			+ "presa ao cinto.";
	
	public DoorOne() {
		System.out.println(getDoorStory());
	}
	
	public String getDoorStory() {
		return doorStory;
	}
	public Player getDoorEnemy() {
		return doorEnemy;
	}
	public String getPostCombatStory() {
		return postCombatStory;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public String getPostCombatTransition() {
		return postCombatTransition;
	}
}
