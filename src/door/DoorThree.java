package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorThree extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\r\n"
			+ "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\r\n"
			+ "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca\r\n"
			+ "no combate que você sabe que irá se seguir, e adentra a porta.\r\n"
			+ "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\r\n"
			+ "prisioneiros acorrentados às paredes.\r\n"
			+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
			+ "lâmina dupla."; 
	private Player doorEnemy = new Player("O Capitão", null, null, enemies.getWeaponThree(), enemies);
	
	public DoorThree() {
		System.out.println(getDoorStory());
	}
	
	public String getDoorStory() {
		return doorStory;
	}
	public Player getDoorEnemy() {
		return doorEnemy;
	}
}