package com.LordGabem.DerpCraft.item.tool;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.ItemModelProvider;
import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this,0,name);
    }
}
