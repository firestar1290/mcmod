package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import fak.mc.mcmod.setup.ModSetup;
import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class tutLanguageProvider extends LanguageProvider{

    public tutLanguageProvider(DataGenerator generator, String locale) {
        super(generator, mcmod.MODID, locale);
    }
    @Override
    protected void addTranslations(){
        add("itemGroup."+ModSetup.TAB_NAME,"mcmod");

        add(registration.TEST_ORE_OVERWORLD.get(),"Test Ore");
        add(registration.TEST_INGOT.get(),"Test Ingot");
        add(registration.TEST_ORE_CHUNK.get(),"Test Ore Chunk");
    }
}
