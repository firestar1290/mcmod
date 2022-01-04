package fak.mc.mcmod.datagen;

import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
public class tutLootTables extends baseLootTableProvider{

    public tutLootTables(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void addTables(){
        lootTable.put(registration.TEST_ORE_OVERWORLD.get(),createSilkTouchTable("test_ore_overworld",registration.TEST_ORE_OVERWORLD.get(),registration.TEST_ORE_CHUNK.get(),1,3));
    }
}
