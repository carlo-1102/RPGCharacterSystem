public class Archer extends GameCharacter {

    private int arrowCount;

    public Archer(String name, int hp, int attackPower, int arrowCount) {
        super(name, hp, attackPower);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " shoots an arrow. Remaining: " + arrowCount);
        } else {
            System.out.println(getName() + " has no arrows left!");
        }
    }

    @Override
    public String describeClass() {
        return "Archer - ranged attacker with arrows " + arrowCount;
    }
}