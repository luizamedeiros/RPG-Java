package fighter;

public abstract class FighterFunction {
	private String fighterFunctionName = "";
	public Weapon weaponOne;
	public Weapon weaponTwo;
	public Weapon weaponThree;
	
	public abstract Weapon weaponOne();
	public abstract Weapon weaponTwo();
	public abstract Weapon weaponThree();

	public Weapon getWeaponOne() {
		return weaponOne;
	}
	public Weapon getWeaponTwo() {
		return weaponTwo;
	}
	public Weapon getWeaponThree() {
		return weaponThree;
	}
	public String getfighterFunctionName() {
		return fighterFunctionName;
	}
}