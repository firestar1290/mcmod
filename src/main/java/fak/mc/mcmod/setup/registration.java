package fak.mc.mcmod.setup;

import fak.mc.mcmod.mcmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class registration {
    private static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,"mcmod"); //register for items
    private static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, "mcmod"); //register for blocks

    private static final BlockBehaviour.Properties ORE_PROPERTIES=BlockBehaviour.Properties.of(Material.STONE).strength(2f); //properties of Stone
    private static final Item.Properties ITEM_PROPERTIES=new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> TEST_ORE_OVERWORLD=BLOCKS.register("test_ore", () -> new Block(ORE_PROPERTIES)); //block to register
    public static final RegistryObject<Item> TEST_ORE_OVERWORLD_ITEM=fromBlock(TEST_ORE_OVERWORLD); //ore blockItem

    public static final RegistryObject<Item> TEST_ORE_CHUNK=ITEMS.register("test_ore_chunk", () -> new Item(ITEM_PROPERTIES)); //Item registry
    public static final RegistryObject<Item> TEST_INGOT=ITEMS.register("test_ingot", () ->new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Item> TEST_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(mcmod.MODID, "test_ore"));
    public static final Tags.IOptionalNamedTag<Block> TEST_ORE = BlockTags.createOptional(new ResourceLocation(mcmod.MODID,"test_ore"));

    public static void init(){
        IEventBus bus=FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    private static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
