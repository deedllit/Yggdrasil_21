package com.yggdrasil.data.provider;

import com.yggdrasil.YggdrasilMod;
import com.yggdrasil.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block ;

import java.util.concurrent.CompletableFuture;

public class YggdrasilBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public YggdrasilBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.COCO_NUT_PLANKS)  ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockInit.COCO_NUT_PLANKS) ;

        /*
        getOrCreateTagBuilder(EXAMPLE_TAG)
                .add(BlockInit.COCO_NUT_PLANKS) ;
        */

    }
}
