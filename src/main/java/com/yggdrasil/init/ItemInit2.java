package com.yggdrasil.init;

import com.yggdrasil.YggdrasilMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import java.util.function.Function;

public class ItemInit2 {

    //https://github.com/DaRealTurtyWurty/Industria/compare/19224c9daf7a...27e68be6ad57

/*
    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, YggdrasilMod.id(name), item);
    }

    public static Item register(String name) {
        return registerItem(name, new Item(new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, YggdrasilMod.id(name)))));
    }


    public static <T extends Item> T register(String name, Function<Item.Settings, T> constructor, Function<Item.Settings, Item.Settings> settingsApplier) {
        return registerItem(name, constructor.apply(
                settingsApplier.apply(new Item.Settings().registryKey(
                        RegistryKey.of(RegistryKeys.ITEM, YggdrasilMod.id(name))))));
*/

}
