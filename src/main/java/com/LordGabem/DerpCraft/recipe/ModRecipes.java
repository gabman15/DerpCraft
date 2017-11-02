package com.LordGabem.DerpCraft.recipe;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {
    /**
     *
     * @param id Id of the enchantment
     * @param lvl Level of the enchantment
     * @return An nbt compound tag that should be put into the list
     */
    public static NBTTagCompound addEnchantToList(int id, int lvl) {


        NBTTagCompound tag = new NBTTagCompound();
        tag.setShort("id", (short)id);
        tag.setShort("lvl", (short)(lvl));


        return tag;
    }

    /**
     *
     * @param ids A list of the ids for the enchantments
     * @param lvl A list of the levels for the enchantments
     * @return An nbt compound that can be applied to an item stack to add enchantments
     */
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
        //CROPS+FOOD
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gebgetableSeed), ModItems.gebgetable);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebCarrot),
            " C ",
                     "CGC",
                     " C ",
                     'C', Items.CARROT, 'G', ModItems.gebgetable
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebCarrot),
                " C ",
                "CGC",
                " C ",
                'C', Items.CARROT, 'G', ModItems.gebgetable
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.gebFood),
                "GCG",
                "CDC",
                "GCG",
                'C', ModItems.gebCarrot, 'D', ModItems.ingotDerpium, 'G', Items.GOLDEN_APPLE
        );

        //MISC
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.fiberSweatshirt),
                "gsg",
                "gdg",
                "gsg",
                'g', new ItemStack(Items.DYE,1,2), 's', Items.STRING, 'd', ModItems.ingotOmnite
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pieceSweatshirt),
                "fef",
                "fdf",
                "fef",
                'f', ModItems.fiberSweatshirt, 'e', Items.SPIDER_EYE, 'd', ModItems.pureMaterial
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.wings),
                "fpf",
                "fdf",
                "fpf",
                'f', Items.FEATHER, 'p', ModItems.pureMaterial, 'd', ModItems.ingotDerpium
        );

        //TOOLS+ARMOR
        ItemStack stick = new ItemStack(ModItems.theStick, 1, 0);

        stick.setTagCompound(getEnchCompound(new int[] {16,19,20}, new int[] {10000,10000,10000}));

        GameRegistry.addShapedRecipe
            (stick,
            "sps",
            "sds",
            "sps",
            's',Items.STICK, 'd', ModBlocks.blockDerpium, 'p',ModItems.pureMaterial
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenSweatshirt),
                "pnp",
                "pdp",
                "pwp",
                'p', ModItems.pieceSweatshirt, 'n', Items.NETHER_WART, 'd', ModBlocks.blockDerpium, 'w', ModItems.wings
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hammer),
                " ci",
                " sc",
                "s  ",
                'c', ModItems.ingotCopper, 'i', Items.IRON_INGOT, 's', Items.STICK
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hazmatHelmet),
                "wsw",
                "tgt",
                "   ",
                'w', Blocks.WOOL, 's', Items.SLIME_BALL, 'g', Blocks.GLASS, 't', ModItems.ingotSteel
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hazmatChestplate),
                "w w",
                "tst",
                "wsw",
                'w', Blocks.WOOL, 's', Items.SLIME_BALL, 't', ModItems.ingotSteel
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hazmatLeggings),
                "wsw",
                "t t",
                "t t",
                'w', Blocks.WOOL, 's', Items.SLIME_BALL, 't', ModItems.ingotSteel
        );

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hazmatBoots),
                "   ",
                "tst",
                "w w",
                'w', Blocks.WOOL, 's', Items.SLIME_BALL, 't', ModItems.ingotSteel
        );

        //BLOCKS
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockCopper),"aaa","aaa","aaa",'a',ModItems.ingotCopper);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockTin),"aaa","aaa","aaa",'a',ModItems.ingotTin);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSteel),"aaa","aaa","aaa",'a',ModItems.ingotSteel);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockBronze),"aaa","aaa","aaa",'a',ModItems.ingotBronze);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockUranium),"aaa","aaa","aaa",'a',ModItems.ingotUranium);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockOmnite),"aaa","aaa","aaa",'a',ModItems.ingotOmnite);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockDerpium),"aaa","aaa","aaa",'a',ModItems.ingotDerpium);

        //HAMMERING >> DUSTS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustIron), Items.IRON_INGOT, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCoal), Items.COAL, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustDiamond), Items.DIAMOND, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCopper), ModItems.ingotCopper, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustIron, 2), Blocks.IRON_ORE, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCopper, 2), ModBlocks.oreCopper, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustTin, 2), ModBlocks.oreTin, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustTin), ModItems.ingotTin, new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustOmnite, 9),
                Blocks.IRON_BLOCK, Blocks.GOLD_BLOCK, ModBlocks.blockCopper,
                ModBlocks.blockSteel, ModBlocks.blockTin, ModBlocks.blockBronze,
                new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer))
        );

        //ALLOYING
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustSteel,2), ModItems.dustCoal, ModItems.dustIron));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustBronze,2), ModItems.dustCopper, ModItems.dustTin));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dustMegaDiamond),
                "glg",
                "ldl",
                "glg",
                'd', ModItems.dustDiamond, 'l', new ItemStack(Items.DYE,1,4), 'g', Items.GLOWSTONE_DUST
        ));
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
                'p', ModItems.pureMaterial, 'u', ModItems.ingotUranium, 'h', new ItemStack(ModItems.hammer.setContainerItem(ModItems.hammer))
        );

        //SMELTING
        GameRegistry.addSmelting(ModBlocks.oreUranium, new ItemStack(ModItems.ingotUranium), 1f);
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
