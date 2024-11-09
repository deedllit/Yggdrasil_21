package com.yggdrasil;
import com.yggdrasil.init.ItemInit ;
import com.yggdrasil.init.BlockInit ;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class YggdrasilMod implements ModInitializer {
	public static final String MOD_ID = "yggdrasil";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		BlockInit.load() ;
		LOGGER.info("Done Blocks!");
		ItemInit.load() ;
		LOGGER.info("Done Items!");

		LOGGER.info("Done All!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path) ;
	}

}