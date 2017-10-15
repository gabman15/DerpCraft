package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemGebCarrot extends ItemFood implements ItemModelProvider, ItemOreDict{
    public ItemGebCarrot() {
        super(8, .6f,false);
        setUnlocalizedName("gebCarrot");
        setRegistryName("gebCarrot");
        setCreativeTab(DerpCraft.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this, 0, "gebCarrot");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("cropGebCarrot", this);
    }
}
