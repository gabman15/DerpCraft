package com.LordGabem.DerpCraft.blocks;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    public void registerItemModel(Item itemBlock) {
        DerpCraft.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}