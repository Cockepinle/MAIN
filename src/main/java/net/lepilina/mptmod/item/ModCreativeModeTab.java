package net.lepilina.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SPANCH_TAB = new CreativeModeTab("Spanch Tab") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.ANANAS.get());
        }
    };
}
