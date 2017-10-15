package com.LordGabem.DerpCraft.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static ItemBase ingot_uranium;
    public static ItemGebgetableSeed gebgetableSeed;
    public  static  ItemBase gebgetable;

    public static void init() {
        ingot_uranium = register(new ItemBase("ingot_uranium"));
        gebgetableSeed = register(new ItemGebgetableSeed());
        gebgetable = register(new ItemBase("gebgetable"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        return item;
    }
}
