package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
