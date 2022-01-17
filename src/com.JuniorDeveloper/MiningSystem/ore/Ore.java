package com.JuniorDeveloper.MiningSystem.ore;

import java.util.List;

public class Ore {

    /**
     * Get a random ore material.
     * <p>
     * List of ores you can get: - COAL_ORE - REDSTONE_ORE - EMERALD_ORE - COPPER_ORE
     * <p>
     * Dit is een randomizer voor ores. Dit ga gebruikt worden bij: Als je een Blok mined, en je breekt hem veranderd
     * deze in BEDROCK, en daarna wordt het een random ore.
     */
    public static Material random() {
        Material[] materials = new Material[]{
                Material.COAL_ORE,
                Material.REDSTONE_ORE,
                Material.EMERALD_ORE,
                Material.COPPER_ORE
        };

        Random r = new Random();
        int randomMaterial = r.nextInt(materials.length);
        return material[randomMaterial];
    }
}