package com.radeke.nuclearenergy.datagen;

import com.radeke.nuclearenergy.Blocks;
import com.radeke.nuclearenergy.Items;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Recipe extends RecipeProvider implements IConditionBuilder {
    public Recipe(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.URANIUM_BLOCK.get())
                .pattern("UUU")
                .pattern("UUU")
                .pattern("UUU")
                .define('U', Items.URANIUM.get())
                .unlockedBy("has_uranium", has(Items.URANIUM.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.URANIUM.get(), 9)
                .requires(Blocks.URANIUM_BLOCK.get())
                .unlockedBy("has_uranium_block", has(Blocks.URANIUM_BLOCK.get()))
                .save(recipeOutput);

        oreSmelting(recipeOutput, List.of(Blocks.URANIUM_ORE.get()), RecipeCategory.MISC, Items.URANIUM.get(), 0.5f, 500, "uranium");
        oreBlasting(recipeOutput, List.of(Blocks.URANIUM_ORE.get()), RecipeCategory.MISC, Items.URANIUM.get(), 0.6f, 250, "uranium");

        oreSmelting(recipeOutput, List.of(Blocks.DEEPSLATE_URANIUM_ORE.get()), RecipeCategory.MISC, Items.URANIUM.get(), 0.6f, 500, "uranium");
        oreBlasting(recipeOutput, List.of(Blocks.DEEPSLATE_URANIUM_ORE.get()), RecipeCategory.MISC, Items.URANIUM.get(), 0.8f, 250, "uranium");
    }
}
