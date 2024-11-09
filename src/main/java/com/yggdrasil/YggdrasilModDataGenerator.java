package com.yggdrasil;

import com.yggdrasil.data.provider.YggdrasilBlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import com.yggdrasil.data.provider.* ;

public class YggdrasilModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack() ;

		pack.addProvider(YggdrasilModelProvider::new)  ;
		pack.addProvider(YggdrasilEnglishLanguageProvider::new)  ;
		pack.addProvider(YggdrasilBlockLootTableProvider::new) ;
		pack.addProvider(YggdrasilBlockTagProvider::new) ;

	}
}
