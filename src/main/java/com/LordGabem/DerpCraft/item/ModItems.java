package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.tool.ItemPickaxe;
import com.LordGabem.DerpCraft.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static ItemBase ingot_uranium;
    public static ItemBase ingotCopper;
    public static ItemGebgetableSeed gebgetableSeed;
    public  static ItemGebgetable gebgetable;
    public static ItemGebCarrot gebCarrot;
    public static ItemSword copperSword;
    public static ItemPickaxe copperPickaxe;

    public static void init() {
        ingot_uranium = register(new ItemOre("ingot_uranium","ingotUranium"));
        ingotCopper = register(new ItemOre("ingotCopper","ingotCopper"));
        gebgetableSeed = register(new ItemGebgetableSeed());
        gebgetable = register(new ItemGebgetable());
        gebCarrot = register(new ItemGebCarrot());
        copperSword = register(new ItemSword(DerpCraft.copperToolMaterial, "copperSword"));
        copperPickaxe = register(new ItemPickaxe(DerpCraft.copperToolMaterial,"copperPickaxe"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}
