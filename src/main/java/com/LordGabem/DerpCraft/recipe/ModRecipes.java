package com.LordGabem.DerpCraft.recipe;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static NBTTagCompound addEnchantToList(int id, int lvl) {


        NBTTagCompound tag = new NBTTagCompound();
        tag.setShort("id", (short)id);
        tag.setShort("lvl", (short)(lvl));


        return tag;
    }

    public static NBTTagCompound getEnchCompound(int[] ids, int[] lvl) {
        if(ids.length==lvl.length) {
            NBTTagCompound comp = new NBTTagCompound();
            NBTTagList tagList = new NBTTagList();
            for (int i = 0; i < ids.length; i++) {
                tagList.appendTag(addEnchantToList(ids[i], lvl[i]));
            }

            comp.setTag("ench", tagList);

            return comp;
        }
        return null;
    }

    public static void init() {
        //CROPS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gebgetableSeed), ModItems.gebgetable);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebCarrot),
            " C ",
                     "CGC",
                     " C ",
                     'C', Items.CARROT, 'G', ModItems.gebgetable
        );

        //TOOLS
        ItemStack stick = new ItemStack(ModItems.theStick, 1, 0);

        stick.setTagCompound(getEnchCompound(new int[] {16,19,20}, new int[]{10000,10000,10000}));

        GameRegistry.addShapedRecipe
            (stick,
            "sds",
            "sps",
            "sds",
            's',Items.STICK, 'd', ModItems.ingotDerpium, 'p',ModItems.pureMaterial
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
                "glg",
                "ldl",
                "glg",
                'd', ModItems.dustDiamond, 'l', new ItemStack(Items.DYE,1,4), 'g', Items.GLOWSTONE_DUST
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pureMaterial),
                "ooo",
                "omo",
                "ooo",
                'o', ModItems.ingotOmnite, 'm', ModItems.megaDiamond
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dustDerpium),
                "pup",
                "uhu",
                "pup",
                'p', ModItems.pureMaterial, 'u', ModItems.ingot_uranium, 'h', new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer))
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.fiberSweatshirt),
                "gsg",
                "gdg",
                "gsg",
                'g', new ItemStack(Items.DYE,1,2), 's', Items.STRING, 'd', ModItems.ingotDerpium
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pieceSweatshirt),
                "fef",
                "fdf",
                "fef",
                'f', ModItems.fiberSweatshirt, 'e', Items.SPIDER_EYE, 'd', ModItems.ingotDerpium
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenSweatshirt),
                "fef",
                "fdf",
                "fef",
                'f', ModItems.fiberSweatshirt, 'e', Items.SPIDER_EYE, 'd', ModItems.ingotDerpium
        );
        //ALLOYING
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustSteel,2), ModItems.dustCoal, ModItems.dustIron);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustBronze,2), ModItems.gebgetable, ModItems.dustIron);

        //SMELTING
        GameRegistry.addSmelting(ModBlocks.oreUranium, new ItemStack(ModItems.ingot_uranium), 1f);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), .7f);
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), .7f);
        GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.IRON_INGOT), .7f);
        GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), .7f);
        GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze), .7f);
        GameRegistry.addSmelting(ModItems.dustOmnite, new ItemStack(ModItems.ingotOmnite), .7f);
        GameRegistry.addSmelting(ModItems.dustMegaDiamond, new ItemStack(ModItems.megaDiamond), .7f);
        GameRegistry.addSmelting(ModItems.dustDerpium, new ItemStack(ModItems.ingotDerpium), 1f);
    }
}
