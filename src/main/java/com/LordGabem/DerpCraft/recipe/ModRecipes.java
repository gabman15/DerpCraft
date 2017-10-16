package com.LordGabem.DerpCraft.recipe;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockBronze),"aaa","aaa","aaa",'a',ModItems.ingotBronze);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockUranium),"aaa","aaa","aaa",'a',ModItems.ingot_uranium);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockOmnite),"aaa","aaa","aaa",'a',ModItems.ingotOmnite);


        //HAMMERING >> DUSTS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustIron), Items.IRON_INGOT, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCoal), Items.COAL, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustDiamond), Items.DIAMOND, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustOmnite, 9),
                Blocks.IRON_BLOCK, Blocks.GOLD_BLOCK, ModBlocks.blockCopper,
                ModBlocks.blockSteel, ModBlocks.blockTin, ModBlocks.blockBronze,
                new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer))
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dustMegaDiamond),
                " l ",
                "ldl",
                " l ",
                'd', ModItems.dustDiamond, 'l', Items.DYE
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dustDerpium),
                "ddd",
                "OdU",
                "ddd",
                'd', Blocks.DIAMOND_BLOCK, 'O', ModBlocks.blockOmnite, 'U', ModBlocks.blockUranium
        );
        //ALLOYING
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustSteel,2), ModItems.dustCoal, ModItems.dustIron);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustBronze,2), ModItems.gebgetable, ModItems.dustIron);

        //SMELTING
        GameRegistry.addSmelting(ModBlocks.ore_uranium, new ItemStack(ModItems.ingot_uranium), 1f);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), .7f);
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), .7f);
        GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.IRON_INGOT), .7f);
        GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), .7f);
        GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze), .7f);
        GameRegistry.addSmelting(ModItems.dustOmnite, new ItemStack(ModItems.ingotOmnite), .7f);
    }
}
