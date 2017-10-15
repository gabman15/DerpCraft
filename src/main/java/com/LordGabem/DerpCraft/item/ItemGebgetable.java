package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemGebgetable extends ItemFood implements ItemModelProvider, ItemOreDict{
    public ItemGebgetable() {
        super(5, .6f,false);
        setUnlocalizedName("gebgetable");
        setRegistryName("gebgetable");
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this, 0, "gebgetable");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("cropGebgetable", this);
    }
}
