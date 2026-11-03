package com.radeke.nuclearenergy.datagen;

import com.radeke.nuclearenergy.Blocks;
import com.radeke.nuclearenergy.Nuclearenergy;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
//import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTag extends BlockTagsProvider {
    public BlockTag(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Nuclearenergy.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Blocks.URANIUM_BLOCK.get())
                .add(Blocks.URANIUM_ORE.get())
                .add(Blocks.DEEPSLATE_URANIUM_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.URANIUM_BLOCK.get())
                .add(Blocks.URANIUM_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(Blocks.DEEPSLATE_URANIUM_ORE.get());
        //tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                //.add(Blocks.DEEPSLATE_URANIUM_ORE.get());
    }
}
