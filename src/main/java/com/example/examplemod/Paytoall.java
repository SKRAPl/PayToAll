package com.example.examplemod;

import com.example.examplemod.items.CryptocoinItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Paytoall.MOD_ID)
public class Paytoall {
    public static final String MOD_ID = "paytoall"; // Убедитесь, что это соответствует вашему Mod ID

    // Создаем DeferredRegister для предметов
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // Регистрируем наш предмет Криптокоин
    // "cryptocoin" - это ID (название) предмета, по которому он будет известен в игре
    public static final RegistryObject<Item> CRYPTOCOIN = ITEMS.register("cryptocoin", CryptocoinItem::new);

    public Paytoall() {
        // Получаем шину событий мода
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрируем наш DeferredRegister со шиной событий мода
        ITEMS.register(modEventBus);
    }
}
