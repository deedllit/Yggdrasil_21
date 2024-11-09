package com.yggdrasil.data.provider;

import com.yggdrasil.YggdrasilMod;
import com.yggdrasil.init.BlockInit;
import com.yggdrasil.init.ItemGroupInit;
import com.yggdrasil.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class YggdrasilEnglishLanguageProvider extends FabricLanguageProvider {
    public YggdrasilEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        //builder.add(((TranslatableTextContent) text.getContent()).getKey(), value) ;
        if(text.getContent() instanceof  TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            YggdrasilMod.LOGGER.warn("Failed to add translation for text : {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ItemInit.MUSPELHEIM_ASH_CARAMBOLA_BERRIES, "Ash Carambola Berries");
        translationBuilder.add(ItemInit.EXAMPLE_ITEM, "Test");
        translationBuilder.add(BlockInit.COCO_NUT_PLANKS, "Coco Nut Planks");

        addText(translationBuilder, ItemGroupInit.YGGRADSIL_TITLE, "Yggdrasil");
    }
}
