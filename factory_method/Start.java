package factory_method;

import factory_method.ShapeExample.Shape;
import factory_method.ShapeExample.ShapeFactory;
import factory_method.blacksmith_shop.Blacksmith;
import factory_method.blacksmith_shop.Weapon;

public class Start {
    public static void main(String[] args) {
        shapeFactoryExample();
    }

    /*
     * Factory Method
     */
    private static void blacksmithExample() {
        Blacksmith blacksmith = new Blacksmith();

        Weapon sword = blacksmith.getWeapon(WeaponType.SWORD);
        Weapon axe   = blacksmith.getWeapon(WeaponType.AXE);
        Weapon gun   = blacksmith.getWeapon(WeaponType.GUN);

        System.out.println( sword.getWeaponForger() + " | " + sword.doSomeDamage() );
        System.out.println( axe.getWeaponForger() + " | " + axe.doSomeDamage() );
        System.out.println( gun.getWeaponForger() + " | " + gun.doSomeDamage() );
    }

    /*
     * Simple Factory Method
     */
    private static void shapeFactoryExample() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("circle");
        System.out.println(circle.getShapeName());

        Shape triangle = shapeFactory.createShape("triangle");
        System.out.println(triangle.getShapeName());
    }
}
