package com.yggdrasil.init;

import com.yggdrasil.YggdrasilMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    //Creative table

    private static final Text YGGRADSIL_TITLE = Text.translatable("itemGroup." + YggdrasilMod.MOD_ID + ".yggdrasil_group") ;

    public static final ItemGroup YGGDRASIL_GROUP = register("main", FabricItemGroup.builder()
            .displayName(YGGRADSIL_TITLE)
            .icon(() -> ItemInit.MUSPELHEIM_ASH_CARAMBOLA_BERRIES.asItem().getDefaultStack())
            .entries((displayContext, entries) ->
                    Registries.ITEM.getKeys().stream()
                            .filter(key -> key.getValue().getNamespace().equals(YggdrasilMod.MOD_ID))
                            .map(Registries.ITEM::getValueOrThrow)
                            .forEach(entries::add))
            .build());


    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, YggdrasilMod.id(name),itemGroup) ;
    }

    public static void load() {
    }
}
