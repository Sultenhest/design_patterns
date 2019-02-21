package factory_method;

public class Blacksmith {
    public static Weapon getWeapon(WeaponType weaponType, String weaponName) {
        Weapon weapon;

        switch (weaponType) {
            case SWORD :
                weapon = new Sword(weaponName);
                break;
            case AXE :
                weapon = new Axe(weaponName);
                break;
            default :
                System.out.println("Guns are not allowed.. No weapon for you");
                weapon = new NullWeapon();
        }

        return weapon;
    }
}
