package com.LordGabem.DerpCraft.recipe;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gebgetableSeed), ModItems.gebgetable);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebCarrot),
            " C ",
                     "CGC",
                     " C ",
                     'C', Items.CARROT, 'G', ModItems.gebgetable
        );

        GameRegistry.addSmelting(ModBlocks.ore_uranium, new ItemStack(ModItems.ingot_uranium), 1f);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), .7f);
    }
}
