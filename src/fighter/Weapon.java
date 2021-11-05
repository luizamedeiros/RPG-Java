package fighter;

public class Weapon {
	String weaponName;
	double weaponDamage;
	String weaponCatchphrase;
	
	public Weapon(String weaponName, double weaponDamage, String weaponCatchphrase) {
		this.weaponName = weaponName;
		this.weaponDamage = weaponDamage;
		this.weaponCatchphrase = weaponCatchphrase;
	}

	public Weapon() {
	}

	public void setWeaponName(String newWeaponName) {
		this.weaponName = newWeaponName;
	}
	
	public String getWeaponName() {
		return this.weaponName;
	}
	
	public void setWeaponDamage(double newWeaponDamage) {
		this.weaponDamage = newWeaponDamage;
	}
	
	public double getWeaponDamage() {
		return this.weaponDamage;
	}
	
	public void setWeaponCatchphrase(String newWeaponCatchphrase) {
		this.weaponCatchphrase = newWeaponCatchphrase;
	}
	
	public String getWeaponCatchphrase() {
		return this.weaponCatchphrase;
	}
	
}
