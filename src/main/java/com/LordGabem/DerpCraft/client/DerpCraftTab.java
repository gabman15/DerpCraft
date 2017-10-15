package com.LordGabem.DerpCraft.client;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DerpCraftTab extends CreativeTabs{

    public DerpCraftTab() {
        super(DerpCraft.MODID);
        setBackgroundImageName("derpcraft.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.gebgetable;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
