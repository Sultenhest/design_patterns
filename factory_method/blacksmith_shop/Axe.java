package factory_method.blacksmith_shop;

class Axe extends Weapon {
    private String weaponForger;

    public Axe(String weaponForger) {
        this.weaponForger = weaponForger;
    }

    @Override
    public String getWeaponForger() {
        return weaponForger;
    }

    @Override
    public String getWeaponInfo() {
        return "It's a cool axe";
    }
}
