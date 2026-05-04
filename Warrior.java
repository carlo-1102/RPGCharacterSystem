public class Warrior extends GameCharacter implements Defendable {

    private int armorRating;

    public Warrior(String name, int hp, int attackPower, int armorRating) {
        super(name, hp, attackPower);
        this.armorRating = armorRating;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings sword with power " + getAttackPower());
    }

    @Override
    public String describeClass() {
        return "Warrior - melee fighter with armor " + armorRating;
    }

    @Override
    public void block() {
        System.out.println(getName() + " blocks the attack!");
    }

    @Override
    public int getDefenseRating() {
        return armorRating;
    }
}