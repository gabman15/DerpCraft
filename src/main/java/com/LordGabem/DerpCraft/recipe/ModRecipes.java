package com.LordGabem.DerpCraft.recipe;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        //CROPS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gebgetableSeed), ModItems.gebgetable);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebCarrot),
            " C ",
                     "CGC",
                     " C ",
                     'C', Items.CARROT, 'G', ModItems.gebgetable
        );
        //BLOCKS
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockCopper),"aaa","aaa","aaa",'a',ModItems.ingotCopper);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockTin),"aaa","aaa","aaa",'a',ModItems.ingotTin);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSteel),"aaa","aaa","aaa",'a',ModItems.ingotSteel);
        //HAMMERING >> DUSTS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustIron), Items.IRON_INGOT, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCoal), Items.COAL, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));

        //ALLOYING
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustSteel,2), ModItems.dustCoal, ModItems.dustIron);

        //SMELTING
        GameRegistry.addSmelting(ModBlocks.ore_uranium, new ItemStack(ModItems.ingot_uranium), 1f);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), .7f);
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), .7f);
        GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.IRON_INGOT), .7f);
        GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), .7f);
    }
}
