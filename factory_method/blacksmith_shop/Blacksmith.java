package factory_method.blacksmith_shop;

import factory_method.WeaponType;

public class Blacksmith{
    public Weapon getWeapon(WeaponType weaponType) {
        Weapon weapon;

        switch (weaponType) {
            case SWORD :
                weapon = new Sword("Human");
                break;
            case AXE :
                weapon = new Axe( "Human");
                break;
            default :
                System.out.println("Guns are not allowed.. No weapon for you");
                weapon = new NullWeapon();
        }

        return weapon;
    }
}
