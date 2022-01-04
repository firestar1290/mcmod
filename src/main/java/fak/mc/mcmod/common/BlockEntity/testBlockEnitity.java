package fak.mc.mcmod.common.BlockEntity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class testBlockEnitity extends Block{
    public testBlockEnitity(){
        super(BlockBehaviour.Properties.copy(Blocks.FURNACE)); //copy the strength, light level, friction, and sound of a vanilla furnace
        this.setRegistryName("mcmod", "test_block"); //set the registry name as mcmod:test_block
    }
}
