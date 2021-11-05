package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorOne extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não\r\n"
			+ "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\r\n"
			+ "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\r\n"
			+ "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\r\n"
			+ "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\r\n"
			+ "para espalhar o terror nas cidades e vilas da região.\n\nEnquanto seu olhar percorre a sala, "
			+ "você ouve a porta se fechando e gira rapidamente para olhar\r\n"
			+ "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\r\n"
			+ "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\r\n"
			+ "posição de combate. Ele avança em sua direção.\r\n";
	private Player doorEnemy = new Player("O Armeiro", null, null, enemies.getWeaponOne(), enemies);
	
	public DoorOne() {
		System.out.println(getDoorStory());
	}
	
	public String getDoorStory() {
		return doorStory;
	}
	public Player getDoorEnemy() {
		return doorEnemy;
	}
}
