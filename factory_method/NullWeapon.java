package factory_method;

public class NullWeapon extends Weapon {
    public NullWeapon() {}

    @Override
    public int doSomeDamage() {
        return 0;
    }

    @Override
    public String getWeaponName() {
        return "No name";
    }

    @Override
    public String getWeaponInfo() { return "Not a Weapon"; }
}
