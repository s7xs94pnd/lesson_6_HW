public class Weapon {
    private String WeaponName;
    private WeaponType  wType;


    public Weapon(String weaponName, WeaponType wType) {
        WeaponName = weaponName;
        this.wType = wType;
    }

    public WeaponType getwType() {
        return wType;
    }

    public void setwType(WeaponType  wType) {
        this.wType = wType;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }
}

