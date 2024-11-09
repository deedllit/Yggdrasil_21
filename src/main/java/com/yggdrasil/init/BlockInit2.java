package com.yggdrasil.init;

public class BlockInit2 {

        /*
    public static final Block EXAMPLE_BLOCK = register("example_block", Block::new,
           Blocks.STONE, AbstractBlock.Settings::nonOpaque) ;


    public static final Block EXAMPLE_BLOCK_2 = register("example_block_2", Block::new,
            AbstractBlock.Settings.create()
                    .strength(1.5f, 6.0f)
                    .requiresTool());
*/
    /*

     */

    /*
    public static <T extends Block> T register(String name, Function<AbstractBlock.Settings, T> constructor, Function<AbstractBlock.Settings, AbstractBlock.Settings> settingsApplier) {
        return registerBlock(name, constructor.apply(
                settingsApplier.apply(AbstractBlock.Settings.create()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name))))));
    }

    public static <T extends Block> T registerWithCopy(String name, Function<AbstractBlock.Settings, T> constructor, Block toCopy, Function<AbstractBlock.Settings, AbstractBlock.Settings> settingsApplier) {
        return registerBlock(name, constructor.apply(
                settingsApplier.apply(AbstractBlock.Settings.copy(toCopy)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name))))));
    }

    public static <T extends Block> T registerWithItemCopy(String name, Function<AbstractBlock.Settings, T> constructor, Block toCopy, Function<AbstractBlock.Settings, AbstractBlock.Settings> settingsApplier) {
        T registeredBlock = registerBlock(name, constructor.apply(
                settingsApplier.apply(AbstractBlock.Settings.copy(toCopy)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, YggdrasilMod.id(name))))));
        ItemInit.register(name, settings -> new BlockItem(registeredBlock, settings), Item.Settings::useBlockPrefixedTranslationKey);
        return registeredBlock;
    }

    private static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, YggdrasilMod.id(name), block);
    }
*/

}
