package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemGebgetableSeed extends ItemSeeds implements ItemModelProvider{

    public ItemGebgetableSeed() {
        super(ModBlocks.cropGebgetable, Blocks.FARMLAND);
        setUnlocalizedName("gebgetableSeed");
        setRegistryName("gebgetableSeed");
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(item, 0, "gebgetableSeed");
    }

}
