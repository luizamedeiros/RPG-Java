package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorTwo extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se\r\n"
			+ "aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais\r\n"
			+ "for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara\r\n"
			+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e\r\n"
			+ "garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc� entende que o capit�o\r\n"
			+ "que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos\r\n"
			+ "soldados para aterrorizar a regi�o.\r\n"
			+ "No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque\r\n"
			+ "horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.";
	private Player doorEnemy = new Player("O Alquimista", null, null, enemies.getWeaponTwo(), enemies);
	private String postCombatStory = "Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque\r"
			+ "do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido\r\n"
			+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.\r\n"
			+ "Deseja beber o l�quido?";
	private int doorNumber = 2;
	private String postCombatTransition = "Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave\r\n"
			+ "abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa\r\n"
			+ "que leva presa ao cinto.\r\n";
	
	public DoorTwo() {
		System.out.println(getDoorStory());
	}
	
	public String getDoorStory() {
		return doorStory;
	}
	public Player getDoorEnemy() {
		return doorEnemy;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public String getPostCombatStory() {
		return postCombatStory;
	}
	public String getPostCombatTransition() {
		return postCombatTransition;
	}
}