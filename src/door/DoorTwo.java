package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorTwo extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "Você retorna à sala anterior e se dirige à porta da esquerda. Você se\r\n"
			+ "aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais\r\n"
			+ "força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\r\n"
			+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\r\n"
			+ "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\r\n"
			+ "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\r\n"
			+ "soldados para aterrorizar a região.\r\n"
			+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\r\n"
			+ "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.";
	private Player doorEnemy = new Player("O Alquimista", null, null, enemies.getWeaponTwo(), enemies);
	private String postCombatStory = "Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque\r"
			+ "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido\r\n"
			+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.\r\n"
			+ "Deseja beber o líquido?";
	private int doorNumber = 2;
	private String postCombatTransition = "Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave\r\n"
			+ "abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa\r\n"
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