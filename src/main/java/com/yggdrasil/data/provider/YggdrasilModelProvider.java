package com.yggdrasil.data.provider;

import com.yggdrasil.init.BlockInit;
import com.yggdrasil.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class YggdrasilModelProvider extends FabricModelProvider {
    public YggdrasilModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.COCO_NUT_PLANKS) ;
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.EXAMPLE_ITEM, Models.GENERATED) ;
        itemModelGenerator.register(ItemInit.MUSPELHEIM_ASH_CARAMBOLA_BERRIES, Models.GENERATED)  ;
    }
}
