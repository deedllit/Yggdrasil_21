package com.yggdrasil;
import com.yggdrasil.init.ItemGroupInit;
import com.yggdrasil.init.ItemInit ;
import com.yggdrasil.init.BlockInit ;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class YggdrasilMod implements ModInitializer {
	public static final String MOD_ID = "yggdrasil";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loadding Yggdrasil...");

		ItemInit.load() ;
		LOGGER.info("Done init Items!");
		BlockInit.load() ;
		LOGGER.info("Done init Blocks!");
		ItemGroupInit.load() ;
		LOGGER.info("Done init Item Groups!");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
			fabricItemGroupEntries.addAfter(Items.GLOW_BERRIES, ItemInit.MUSPELHEIM_ASH_CARAMBOLA_BERRIES);
		});

		LOGGER.info("Yggdrasil Lodded!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path) ;
	}

}