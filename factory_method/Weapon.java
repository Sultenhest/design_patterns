package factory_method;

import java.util.Random;

public abstract class Weapon {
    public int doSomeDamage() {
        return new Random().nextInt(10);
    }

    abstract String getWeaponName();
    abstract String getWeaponInfo();
}
