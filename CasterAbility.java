/**
 * Represents magic users who can cast spells.
 */
public interface CasterAbility {
    void castSpell(String spellName);
    int getMana();
}