import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GameCharacter> party = new ArrayList<>();

        // Create characters
        party.add(new Warrior("Aldric", 120, 18, 25));
        party.add(new Mage("Elara", 70, 30, 100));
        party.add(new Archer("Kael", 85, 22, 5));

        // POLYMORPHISM LOOP
        System.out.println("=== PARTY ROSTER ===");

        for (GameCharacter c : party) {
            System.out.println(c.describeClass());
            c.attack();
            c.rest();
            System.out.println();
        }

        // CASTERS
        System.out.println("=== CASTERS ===");

        for (GameCharacter c : party) {
            if (c instanceof CasterAbility) {
                CasterAbility caster = (CasterAbility) c;
                caster.castSpell("Fireball");
                System.out.println("Mana left: " + caster.getMana());
            }
        }

        // DEFENDERS
        System.out.println("\n=== DEFENDERS ===");

        for (GameCharacter c : party) {
            if (c instanceof Defendable) {
                Defendable d = (Defendable) c;
                d.block();
                System.out.println("Defense rating: " + d.getDefenseRating());
            }
        }

     // SUMMARY
int totalHp = 0;
int casterCount = 0;
int meleeCount = 0;

for (GameCharacter c : party) {
    totalHp += c.getHp();

    if (c instanceof CasterAbility) {
        casterCount++;
    } else {
        meleeCount++;
    }
}

String readiness = totalHp >= 250 ? "READY FOR BATTLE" : "NEEDS REST";

System.out.println("\n=== PARTY SUMMARY ===");
System.out.println("Total members: " + party.size());
System.out.println("Total HP: " + totalHp);
System.out.println("Casters: " + casterCount);
System.out.println("Melee/Ranged: " + meleeCount);
System.out.println("Party Status: " + readiness);
}
}