package factory_method.blacksmith_shop;

class Axe extends Weapon {
    private String weaponName;

    public Axe(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    @Override
    public String getWeaponInfo() {
        return "It's a cool axe";
    }
}
