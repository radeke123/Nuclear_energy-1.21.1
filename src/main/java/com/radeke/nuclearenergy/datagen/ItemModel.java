package com.radeke.nuclearenergy.datagen;

import com.radeke.nuclearenergy.Nuclearenergy;
import com.radeke.nuclearenergy.Items;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModel extends ItemModelProvider {
    public ItemModel(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Nuclearenergy.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Items.URANIUM.get());
    }
}
