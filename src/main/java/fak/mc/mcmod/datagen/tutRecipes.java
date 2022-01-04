package fak.mc.mcmod.datagen;

import java.util.function.Consumer;

import fak.mc.mcmod.setup.registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

public class tutRecipes extends RecipeProvider{

    public tutRecipes(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(registration.TEST_ORE_ITEM),
            registration.TEST_INGOT.get(),1.0f,100)
            .unlockedBy("has_ore",has(registration.TEST_ORE_ITEM))
            .save(consumer,"test_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(registration.TEST_ORE_CHUNK.get()),
            registration.TEST_INGOT.get(),0.0f,100)
            .unlockedBy("has_chunk",has(registration.TEST_ORE_CHUNK.get()))
            .save(consumer,"test_ingot2");
    }
}
