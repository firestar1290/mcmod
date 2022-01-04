package fak.mc.mcmod.datagen;

import fak.mc.mcmod.mcmod;
import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class tutItemTags extends ItemTagsProvider{

    public tutItemTags(DataGenerator generator, tutBlockTags blockTags, ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, mcmod.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(){
        tag(Tags.Items.ORES)
            .add(registration.TEST_ORE_OVERWORLD_ITEM.get());
        tag(registration.TEST_ORE_ITEM)
            .add(registration.TEST_ORE_OVERWORLD_ITEM.get());
        tag(Tags.Items.INGOTS)
            .add(registration.TEST_INGOT.get());
    }
    @Override
    public String getName(){return "mcmod Tags";}
}
