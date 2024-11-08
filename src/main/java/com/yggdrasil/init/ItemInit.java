package com.yggdrasil.init;

import com.yggdrasil.YggdrasilMod;
import com.yggdrasil.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ItemInit {

    public static final Item EXAMPLE_ITEM = register("example_item", Item::new, new Item.Settings());
    public static final Item MUSPELHEIM_ASH_CARAMBOLA_BERRIES = register("muspelheim_ash_carambola_berries", Item::new,
            new Item.Settings().food(FoodList.FOOD_MUSPELHEIM_ASH_CARAMBOLA_BERRIES));


    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, YggdrasilMod.id(name));
        return Items.register(registryKey, factory, settings) ;
    }

    public static void load() {}


}
