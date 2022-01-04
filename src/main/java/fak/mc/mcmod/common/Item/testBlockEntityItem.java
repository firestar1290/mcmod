package fak.mc.mcmod.common.Item;

import fak.mc.mcmod.common.BlockEntity.testBlockEnitity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;

public class testBlockEntityItem extends BlockItem{
    private static final Block testBlock = new testBlockEnitity();
    private static final Properties PROPERTIES = new Properties();
    public testBlockEntityItem(){
        super(testBlock, PROPERTIES);
        PROPERTIES.defaultDurability(0);
        PROPERTIES.tab(CreativeModeTab.TAB_MISC);
        PROPERTIES.stacksTo(64);
        PROPERTIES.setNoRepair();
        setRegistryName(testBlock.getRegistryName());
    }
}
