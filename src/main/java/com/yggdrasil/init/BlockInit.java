package com.yggdrasil.init;

import com.yggdrasil.YggdrasilMod;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.Function;

public class BlockInit {


    public static final Block COCO_NUT_PLANKS = registerWithItemCopy("coco_nut_planks",
            Block::new, Blocks.ACACIA_PLANKS, AbstractBlock.Settings::nonOpaque) ;








    public static Block register(String name, Function<Block.Settings, Block> factory, Block.Settings settings)
    {
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name));
        return Blocks.register(registryKey, factory, settings) ;

    }

    public static Block registerWithItem(String name, Function<Block.Settings, Block> factory, Block.Settings settings) {

        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name));


        YggdrasilMod.LOGGER.info("BLOCK={}", name);

        ItemInit.register(name) ;

        return Blocks.register(registryKey, factory, settings) ;
    }

    public static <T extends Block> T registerWithItemCopy(String name, Function<AbstractBlock.Settings, T> constructor, Block toCopy, Function<AbstractBlock.Settings, AbstractBlock.Settings> settingsApplier) {
        T registeredBlock = registerBlock(name, constructor.apply(
                settingsApplier.apply(AbstractBlock.Settings.copy(toCopy)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name))))));

        ItemInit.register(name, settings -> new BlockItem(registeredBlock, settings), Item.Settings::useBlockPrefixedTranslationKey);

        return registeredBlock;
    }

    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, YggdrasilMod.id(name), block);
    }

    public static void load() {}

}
