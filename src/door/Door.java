package door;

import player.Player;

public abstract class Door {
	private String doorStory;
	private Player doorEnemy;
	private String postCombatStory;
	private int doorNumber;
	private String postCombatTransition;
	
	public Door() {
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
