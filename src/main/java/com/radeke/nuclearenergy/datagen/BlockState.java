package com.radeke.nuclearenergy.datagen;

import com.radeke.nuclearenergy.Blocks;
import com.radeke.nuclearenergy.Nuclearenergy;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockState extends BlockStateProvider {
    public BlockState(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Nuclearenergy.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(Blocks.URANIUM_BLOCK.get(), cubeAll(Blocks.URANIUM_BLOCK.get()));
        simpleBlockWithItem(Blocks.URANIUM_ORE.get(), cubeAll(Blocks.URANIUM_ORE.get()));
        simpleBlockWithItem(Blocks.DEEPSLATE_URANIUM_ORE.get(), cubeAll(Blocks.DEEPSLATE_URANIUM_ORE.get()));
    }
}
