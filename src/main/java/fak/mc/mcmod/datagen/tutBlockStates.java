package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class tutBlockStates extends BlockStateProvider{

    public tutBlockStates(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, mcmod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(registration.TEST_ORE_OVERWORLD.get());
    }
    
}
