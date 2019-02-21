package factory_method;

import factory_method.blacksmith_shop.Blacksmith;
import factory_method.blacksmith_shop.Weapon;

public class Start {
    public static void main(String[] args) {
        Weapon sword = Blacksmith.getWeapon(WeaponType.SWORD, "Mr. Sword");
        Weapon axe   = Blacksmith.getWeapon(WeaponType.AXE, "Axe");
        Weapon gun   = Blacksmith.getWeapon(WeaponType.GUN, "Bob");

        System.out.println( sword.getWeaponName() + " | " + sword.doSomeDamage() );
        System.out.println( axe.getWeaponName() + " | " + axe.doSomeDamage() );
        System.out.println( gun.getWeaponName() + " | " + gun.doSomeDamage() );
    }
}
