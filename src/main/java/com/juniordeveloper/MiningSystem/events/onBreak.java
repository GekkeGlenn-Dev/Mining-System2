
package com.juniordeveloper.MiningSystem.events;

import com.juniordeveloper.MiningSystem.data.OreRandomizer;
import com.juniordeveloper.MiningSystem.MineMain;
import com.juniordeveloper.MiningSystem.data.StaticMaps;
import com.juniordeveloper.MiningSystem.data.level.LevelingManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class onBreak implements Listener {


    /**
     * Voor mij zelf;
     *  <-- Mining System  -->
     *  - Check welke block dat er gebroken is, Als het in het systeem zit, verander deze naar een nieuwe block.
     *                      </-->
     *
     * <-- Leveling System -->
     *     Pak de Current XP amount + De XP per block.
     *     </-->
     */
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBreak(BlockBreakEvent event) {
        double xpPerOre = 0; //TODO: Fetch from config

        Player player = event.getPlayer();
        UUID playerUniqueId = player.getUniqueId(); //Player UUID

        Block block = event.getBlock();
        @NotNull Material blockType = event.getBlock().getType();







        Material bedrock = Material.BEDROCK;

        /**
         * DIAMOND
         * COAL
         * IRON
         * GOLD
         * REDSTONE
         * LAPIS
         * EMERALD
         * QUARTZ
         */

        if(Arrays.stream(new Material[] {Material.DIAMOND_ORE, Material.COAL_ORE, Material.IRON_ORE, Material.GOLD_ORE,
                Material.REDSTONE_ORE, Material.LAPIS_ORE, Material.LAPIS_ORE,
                Material.EMERALD_ORE, Material.NETHER_QUARTZ_ORE} ).anyMatch(t -> blockType == t)) {
            block.setType(bedrock);
            Bukkit.getScheduler().runTaskLater(MineMain.getInstance(), () -> block.setType(OreRandomizer.oreRandomizer()), 1200);
        }


        if(blockType.name().contains("ORE")) {

        }



    }

}
