package fighter;

public class MageFunction extends FighterFunction{
	String fighterFunctionName = "Mago";
	private Weapon weaponOne;
	private Weapon weaponTwo;
	private Weapon weaponThree;

	public Weapon weaponOne(){
		Weapon weaponOne = new Weapon("Cajado do Veigar", 20.00, "Veigar n�o tem piedade de voc�!");
		return weaponOne;
	}
	
	public Weapon weaponTwo(){
		Weapon weaponTwo = new Weapon("Sombra da Vex", 15.00, "Morre ai, Padr�ozinho!");
		return weaponTwo;
	}

	public Weapon weaponThree(){
		Weapon weaponThree = new Weapon("Chacra da Neeko", 17.00, "Neeko � a melhor decis�o!");
		return weaponThree;
	}
	
	public String getFighterFunctionName() {
		return fighterFunctionName;
	}
	
	public MageFunction() {
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
