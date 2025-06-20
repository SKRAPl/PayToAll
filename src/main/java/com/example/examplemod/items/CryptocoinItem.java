package com.example.examplemod.items; // Убедитесь, что пакет правильный

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CryptocoinItem extends Item {
    public CryptocoinItem() {
        // super(new Properties().group(ItemGroup.MISC)); // Для 1.16.5 используем .group()
        // Обновление: для Forge 1.16.5, обычно используется .tab() или .group() в зависимости от версии Forge
        // Для 36.2.42, скорее всего, используется .tab()
        super(new Properties().tab(ItemGroup.TAB_MISC)); // Используем TAB_MISC для группы "Разное"
    }
}