package factory_method.blacksmith_shop;

import java.util.Random;

public abstract class Weapon {
    public int doSomeDamage() {
        return new Random().nextInt(10);
    }
    public abstract String getWeaponName();
    public abstract String getWeaponInfo();
}
