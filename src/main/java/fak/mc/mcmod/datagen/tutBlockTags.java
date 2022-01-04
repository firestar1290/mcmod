package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class tutBlockTags extends BlockTagsProvider{

    public tutBlockTags(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, mcmod.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(){
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(registration.TEST_ORE_OVERWORLD.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
            .add(registration.TEST_ORE_OVERWORLD.get());
        tag(Tags.Blocks.ORES)
            .add(registration.TEST_ORE_OVERWORLD.get());
        tag(registration.TEST_ORE)
            .add(registration.TEST_ORE_OVERWORLD.get());
    }
    @Override
    public String getName(){return "mcmod Tags:";}
}
