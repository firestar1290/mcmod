package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid= mcmod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class dataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator=event.getGenerator();
        if (event.includeClient()){
            generator.addProvider(new tutBlockStates(generator,event.getExistingFileHelper())); //generate blockstates json
            generator.addProvider(new tutItemModels(generator,event.getExistingFileHelper())); //generate item models json
            generator.addProvider(new tutLanguageProvider(generator,"en_us")); //generate localization json
        }
        if (event.includeServer()){
            generator.addProvider(new tutRecipes(generator)); //generate recipes json
            generator.addProvider(new tutLootTables(generator)); //generate loot tables
            tutBlockTags blockTags=new tutBlockTags(generator,event.getExistingFileHelper());
            generator.addProvider(blockTags); //generate block tags json
            generator.addProvider(new tutItemTags(generator,blockTags,event.getExistingFileHelper())); //generate item tags json
        }
    }
}
