package game;

import fighter.FighterFunction;

public class Game {
	
	public static void main(String[] args) {
		int latestDoorDecision;
		boolean survivedLastestDoor;
		int door =1;
		
		GameControls newGame = new GameControls();
		newGame.start();
		newGame.difficultyChooser();
		newGame.namer();
		newGame.genderChooser();
		newGame.intro();
		newGame.motivation();
		FighterFunction a = newGame.functionChooser();
		newGame.weaponChooser(a);
		newGame.createUser();
		newGame.fightOrFlight();
		newGame.createGameEnemies();
		latestDoorDecision = newGame.doorScene(door);
		survivedLastestDoor = newGame.combatStart(latestDoorDecision);
		if (survivedLastestDoor) { 
			newGame.postCombatSequence(door);
			newGame.postCombatTransition(door);
			door += 1;
			latestDoorDecision = newGame.doorScene(door);
			survivedLastestDoor = newGame.combatStart(latestDoorDecision);
			if (survivedLastestDoor == true) {
			door += 1;
			newGame.postCombatSequence(door);
			newGame.postCombatTransition(door);
			latestDoorDecision = newGame.finalDoor();
			survivedLastestDoor = newGame.combatStart(latestDoorDecision);
			}
		}
			
	}
	
	
}
