package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemFoodBase extends ItemFood implements ItemModelProvider, ItemOreDict {
    String itemOreName;
    String itemName;
    public ItemFoodBase(int amount, float saturation, String name, String oreName) {
        super(amount, saturation, false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(DerpCraft.creativeTab);
        itemOreName = oreName;
        itemName = name;
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this, 0, itemName);
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(itemOreName, this);
    }
}
