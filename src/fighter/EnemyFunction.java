package fighter;

public class EnemyFunction extends FighterFunction{
	private String fighterFunctionName = "Inimigo";
	private Weapon weaponOne;
	private Weapon weaponTwo;
	private Weapon weaponThree;

	public Weapon weaponOne(){
		Weapon weaponOne = new Weapon("Arma inimiga lvl 1", 10.00, "O mal devasta!");
		return weaponOne;
	}
	
	public Weapon weaponTwo(){
		Weapon weaponTwo = new Weapon("Arma inimiga lvl 2", 7.00, "A derrota se aproxima!");
		return weaponTwo;
	}

	public Weapon weaponThree(){
		Weapon weaponThree = new Weapon("Arma inimiga lvl 3", 20.00, "A escuridão intensifica!");
		return weaponThree;
	}
	
	public String getFighterFunctionName() {
		return fighterFunctionName;
	}
	public EnemyFunction() {
		this.weaponOne = weaponOne();
		this.weaponTwo = weaponTwo();
		this.weaponThree = weaponThree();
	}

	public Weapon getWeaponOne() {
		return weaponOne;
	}
	public Weapon getWeaponTwo() {
		return weaponTwo;
	}
	public Weapon getWeaponThree() {
		return weaponThree;
	}
	
}
