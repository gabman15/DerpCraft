package com.LordGabem.DerpCraft.blocks;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropGebgetable extends BlockCrops{

    public BlockCropGebgetable() {
        setUnlocalizedName("cropGebgetable");
        setRegistryName("cropGebgetable");
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    protected Item getSeed() {
        return ModItems.gebgetableSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.gebgetable;
    }

}
