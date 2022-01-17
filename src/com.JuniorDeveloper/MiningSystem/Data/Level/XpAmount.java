package Data.Level;

import Messages.MessageManager;
import org.bukkit.entity.Player;

import java.util.logging.Level;

import static Data.Level.LevelingManager.*;

public class XpAmount {

    /* you should not make this static. because static will be stored in the ram. and that is not what you always want.
     * use this only when you need it. for now it can just be private final.
     * private final means. you can get it via an constructor. but you can't never replace it with a new value. So the
     * player will be the same player.
     */
    private final Player player;
    private int totalXPRequirdForLevelUp;

    // Dit is een constructor, wanneer deze classe wordt aangeroepen als 'new XpAmount()' wordt deze methode aangeroepen.
    // Dit gebreurt ook maar 1x, zo kan je er ook voorzorgen dat je in de () variabelen kan meegeven.
    public XpAmount(Player player) {
        // zet de meegegeven player op de prive player.
        this.player = player
    }
    /**
     * @Link{ https://www.spigotmc.org/threads/level-system.356440/ }
     *         <p>
     *         TODO: Fix better LEVELING system
     */

    public int getTotalXPRequirdForLevelUp() {

        // Here the will be 2 if statements used when someone has the level 50. i don
        if (level <= 50) {
            totalXPRequirdForLevelUp = (int) (getMultiplier() + Math.pow(level, 1.5) + 10 * level);
        }

        if (level > 50 || level <= 100) {
            totalXPRequirdForLevelUp = (int) (getMultiplier() + Math.pow(level, 1.5) + 10 * level);
        }

        if (level > 100) {
            totalXPRequirdForLevelUp = (int) (getMultiplier() + Math.pow(level, 1.5) + 10 * level);
        }

        if (level >= maxmimum) {
            totalXPRequirdForLevelUp = Integer.MAX_VALUE;
            player.sendMessage(MessageManager.WHY.getMessage());
        }
        return totalXPRequirdForLevelUp;
    }
}
