package player;

import fighter.FighterFunction;
import fighter.Motivation;
import fighter.Sex;
import fighter.Weapon;

public class Player {
	private String name;
	private Sex gender;
	private Motivation motivation;
	private Weapon weapon;
	private double life = 100.00;
	private double armor;
	private double attackPoints;
	private FighterFunction fighterFunction;
	
	public Player(String name, Sex fighterSex, Motivation fighterMotivation, Weapon weapon, FighterFunction fighterFunction) {
		this.name = name;
		this.gender = fighterSex;
		this.motivation = fighterMotivation;
		this.weapon = weapon;
		this.life = 100.00;
		this.armor = 00.00;
		this.attackPoints = 00.00;
		this.fighterFunction = fighterFunction;
	}

	public Player() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public Motivation getMotivation() {
		return motivation;
	}

	public void setMotivation(Motivation motivation) {
		this.motivation = motivation;
	}

	public double getLife() {
		return life;
	}

	public void setLife(double life) {
		this.life = life;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public double getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(double attackPoints) {
		this.attackPoints = attackPoints;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}
	
	public double getDamage() {
		double damage = getAttackPoints() + weapon.getWeaponDamage();
		return damage;
	}
	
	public FighterFunction getFighterFunction() {
		return fighterFunction;
	}
}
