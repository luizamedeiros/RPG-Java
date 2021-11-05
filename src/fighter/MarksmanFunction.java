package fighter;

public class MarksmanFunction extends FighterFunction{
	String fighterFunctionName = "Atirador";
	private Weapon weaponOne;
	private Weapon weaponTwo;
	private Weapon weaponThree;

	public Weapon weaponOne(){
		Weapon weaponOne = new Weapon("Pistola da Cait", 20.00, "Boom! Headshot.");
		return weaponOne;
	}
	
	public Weapon weaponTwo(){
		Weapon weaponTwo = new Weapon("Ashe's bow", 15.00, "Preciso como uma flecha!");
		return weaponTwo;
	}

	public Weapon weaponThree(){
		Weapon weaponThree = new Weapon("Tristana's cannon", 17.00, "Nada que um pouco de pólvora não resolva!");
		return weaponThree;
	}
	
	public String getFighterFunctionName() {
		return fighterFunctionName;
	}
	
	public MarksmanFunction() {
		this.weaponOne = new Weapon("Pistola da Cait", 20.00, "Boom! Headshot.");
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
