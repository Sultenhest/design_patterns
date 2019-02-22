package factory_method.blacksmith_shop;

class NullWeapon extends Weapon {
    public NullWeapon() {}

    @Override
    public int doSomeDamage() {
        return 0;
    }

    @Override
    public String getWeaponForger() {
        return "No name";
    }

    @Override
    public String getWeaponInfo() { return "Not a Weapon"; }
}
