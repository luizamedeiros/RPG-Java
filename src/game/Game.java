package game;

import fighter.FighterFunction;

public class Game {
	
	public static void main(String[] args) {
		int latestDoorDecision;
		boolean survivedLatestDoor;
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
		boolean stayed = newGame.fightOrFlight();
		newGame.createGameEnemies();
		latestDoorDecision = newGame.doorScene(door);
		survivedLatestDoor = newGame.combatStart(latestDoorDecision);
		while (survivedLatestDoor == true && door<3) { 
			newGame.postCombatSequence();
			newGame.postCombatTransition();
			door += 1;
			latestDoorDecision = newGame.doorScene(door);
			survivedLatestDoor = newGame.combatStart(latestDoorDecision);
		}
		if(survivedLatestDoor==true) {
		newGame.victoryScene();	
	}
	}
}
