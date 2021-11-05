package door;

import player.Player;

public abstract class Door {
	private String doorStory;
	private Player doorEnemy;
	
	public Door() {
		this.doorEnemy = doorEnemy;
		this.doorStory = doorStory;
	}
	
	public String getDoorStory() {
		return doorStory;
	}
	public Player getDoorEnemy() {
		return doorEnemy;
	}
}
