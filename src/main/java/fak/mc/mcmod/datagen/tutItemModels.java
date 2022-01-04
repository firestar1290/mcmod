package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class tutItemModels extends ItemModelProvider{

    public tutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, mcmod.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels(){
        withExistingParent(registration.TEST_ORE_OVERWORLD.get().getRegistryName().getPath(), modLoc("block/test_ore")); //blockItem texture

        singleTexture(registration.TEST_INGOT.get().getRegistryName().getPath(),
        mcLoc("item/generated"),
        "layer0",modLoc("item/test_ingot")); //item texture

        singleTexture(registration.TEST_ORE_CHUNK.get().getRegistryName().getPath(),
        mcLoc("item/generated"),
        "layer0",modLoc("item/test_ore_chunk"));
    }
    
}
