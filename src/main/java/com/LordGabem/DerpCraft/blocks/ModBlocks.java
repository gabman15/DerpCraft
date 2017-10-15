package com.LordGabem.DerpCraft.blocks;

import com.LordGabem.DerpCraft.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockOre ore_uranium;

    public static BlockCropGebgetable cropGebgetable;

    public static void init() {
        ore_uranium = register(new BlockOre("ore_uranium"));
        cropGebgetable = register(new BlockCropGebgetable(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if(itemBlock != null) {
            GameRegistry.register(itemBlock);

            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider) block).registerItemModel(itemBlock);
            }
        }
        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

}