package fak.mc.mcmod.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static final String TAB_NAME="mcmod";
    public static final CreativeModeTab ITEM_GROUP=new CreativeModeTab(TAB_NAME) {
        @Override public ItemStack makeIcon(){return new ItemStack(registration.TEST_ORE_OVERWORLD_ITEM.get());}
    };
    public static void init(FMLCommonSetupEvent event){

    }
}
