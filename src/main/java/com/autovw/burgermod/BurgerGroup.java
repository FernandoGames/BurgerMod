package com.autovw.burgermod;

import com.autovw.burgermod.core.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * Author: Autovw
 */
public class BurgerGroup extends ItemGroup {

    // Creative inventory tab
    public BurgerGroup(String name) {
        super(name);
    }

    @Override
    public ItemStack makeIcon() {
        return ModItems.BEEF_BURGER.get().getDefaultInstance();
    }
}