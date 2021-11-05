package door;

import fighter.EnemyFunction;
import player.Player;

public class DoorThree extends Door{
	EnemyFunction enemies = new EnemyFunction();
	private String doorStory = "De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a\r\n"
			+ "porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc�\r\n"
			+ "percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca\r\n"
			+ "no combate que voc� sabe que ir� se seguir, e adentra a porta.\r\n"
			+ "L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\r\n"
			+ "prisioneiros acorrentados �s paredes.\r\n"
			+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
			+ "l�mina dupla."; 
	private Player doorEnemy = new Player("O Capit�o", null, null, enemies.getWeaponThree(), enemies);
	
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