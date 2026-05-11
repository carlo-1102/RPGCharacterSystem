// GameCharacter.java

/**
 * Base abstract class for all RPG characters.
 */
public abstract class GameCharacter {

    private String name;
    private int hp;
    private int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = Math.max(0, hp);
        this.attackPower = Math.max(0, attackPower);
    }

    // Concrete method
    public void rest() {
        hp += 10;
        System.out.println(name + " rests and recovers 10 HP. HP now: " + hp);
    }

    // Abstract methods
    public abstract void attack();

    public abstract String describeClass();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower >= 0) {
            this.attackPower = attackPower;
        }
    }
}