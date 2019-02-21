package factory_method.blacksmith_shop;

class Sword extends Weapon {
    private String weaponName;

    public Sword(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    @Override
    public String getWeaponInfo() {
        return "Basic Sword";
    }
}
