package net.lepilina.mptmod.item;

import net.lepilina.mptmod.MptMod;
import net.lepilina.mptmod.item.ModCreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> ANANAS = ITEMS.register("ananas",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f)
                            .build()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FLOWER = ITEMS.register("flower",
            () -> new Item(new Item.Properties().tab(TAB_MISC)));
    public static final RegistryObject<Item> LOPATKA = ITEMS.register("lopatka",
            () -> new Item(new Item.Properties().tab(TAB_MISC)));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(1.0f)
                            .build()).tab(CreativeModeTab.TAB_MISC)));
}
