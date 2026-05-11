// Mage.java

public class Mage extends GameCharacter implements CasterAbility {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = Math.max(0, mana);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts magic blast with power " + getAttackPower());
    }

    @Override
    public String describeClass() {
        return "Mage - spell caster with mana " + mana;
    }

    @Override
    public void castSpell(String spellName) {

        if (mana >= 10) {
            mana -= 10;
            System.out.println(getName() + " casts " + spellName + "!");
        } else {
            System.out.println(getName() + " does not have enough mana!");
        }
    }

    @Override
    public int getMana() {
        return mana;
    }

    // Setter
    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        }
    }
}