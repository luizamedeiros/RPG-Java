package fighter;

public class BruiserFunction extends FighterFunction{
	String fighterFunctionName = "Lutador";
	private Weapon weaponOne;
	private Weapon weaponTwo;
	private Weapon weaponThree;

	public Weapon weaponOne(){
		Weapon weaponOne = new Weapon("Lâminas da Irelia", 20.00, "Não há espaço para erros!");
		return weaponOne;
	}
	
	public Weapon weaponTwo(){
		Weapon weaponTwo = new Weapon("Raiva do Gnar", 15.00, "GNAR!");
		return weaponTwo;
	}

	public Weapon weaponThree(){
		Weapon weaponThree = new Weapon("Fúria do Renekton", 17.00, " Massacre-os!");
		return weaponThree;
	}
	
	public String getfighterFunctionName() {
		return fighterFunctionName;
	}
	
	public BruiserFunction() {
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
