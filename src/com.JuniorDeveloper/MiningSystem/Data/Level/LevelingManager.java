package Data.Level;

public class LevelingManager {

    /**
     * TODO: For usage => Comment will be deleted
     *  - Level will be saved into Database or Config,
     *  - Multiplier will be setted in the CONFIG
     *  - Amount of xp needed, can be discussed.
     *  - Maximum Level will be with Config
     */
    int level = 0;
    int multiplier = 0; // Multiplier has to be changed to config.
    int maxmimum = 150; // Set this in a config.
    XpAmount xpAmount = new XpAmount();

    public int getMultiplier() {
        return multiplier;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxmimum() {
        return maxmimum;
    }
}
