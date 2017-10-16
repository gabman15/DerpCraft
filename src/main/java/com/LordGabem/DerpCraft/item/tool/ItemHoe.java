package com.LordGabem.DerpCraft.item.tool;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.ItemModelProvider;
import net.minecraft.item.Item;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider {

    private String name;

    public ItemHoe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this,0,name);
    }
}
