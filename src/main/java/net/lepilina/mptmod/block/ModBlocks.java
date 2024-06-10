package net.lepilina.mptmod.block;

import net.lepilina.mptmod.MptMod;
import net.lepilina.mptmod.item.ModCreativeModeTab;
import net.lepilina.mptmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MptMod.MOD_ID);

    public static final RegistryObject<Block> SPANCH_BLOCK = registryBlock("spanch_block",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(3f).requiresCorrectToolForDrops()
                    ), ModCreativeModeTab.SPANCH_TAB);

    public static final RegistryObject<Block> PATRIK_BLOCK = registryBlock("patrik_block",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()
                    ), ModCreativeModeTab.SPANCH_TAB);
    public static final RegistryObject<Block> ANANAS_BLOCK = registryBlock("ananas_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SPANCH_TAB);
    public static final RegistryObject<Block> SENDI_BLOCK = registryBlock("sendi_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.SPANCH_TAB);

    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name,block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }
    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}