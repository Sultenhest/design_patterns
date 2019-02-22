package factory_method.blacksmith_shop;

class Sword extends Weapon {
    private String weaponForger;

    public Sword(String weaponForger) {
        this.weaponForger = weaponForger;
    }

    @Override
    public String getWeaponForger() {
        return weaponForger;
    }

    @Override
    public String getWeaponInfo() {
        return "Basic Sword";
    }
}
