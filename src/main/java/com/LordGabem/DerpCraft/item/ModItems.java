package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.tool.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    //METALS
    public static ItemBase ingot_uranium;
    public static ItemBase ingotCopper;
    public static ItemBase ingotTin;
    public static ItemBase ingotSteel;
    public static ItemBase dustIron;
    public static ItemBase dustCoal;
    public static ItemBase dustSteel;
    public static ItemBase dustBronze;
    public static ItemBase ingotBronze;


    //CROPS
    public static ItemGebgetableSeed gebgetableSeed;
    public  static ItemGebgetable gebgetable;
    public static ItemGebCarrot gebCarrot;

    //TOOLS+ARMOR
    public static ItemSword copperSword;
    public static ItemPickaxe copperPickaxe;
    public static ItemAxe copperAxe;
    public static ItemShovel copperShovel;
    public static ItemHoe copperHoe;
    public static ItemArmor copperHelmet;
    public static ItemArmor copperChestplate;
    public static ItemArmor copperLeggings;
    public static ItemArmor copperBoots;
    public static ItemArmor hazmatHelmet;
    public static ItemArmor hazmatChestplate;
    public static ItemArmor hazmatLeggings;
    public static ItemArmor hazmatBoots;
    public static ItemBase hammer;

    public static void init() {
        ingot_uranium = register(new ItemOre("ingot_uranium","ingotUranium"));
        ingotCopper = register(new ItemOre("ingotCopper","ingotCopper"));
        ingotTin = register(new ItemOre("ingotTin","ingotTin"));
        ingotSteel = register(new ItemOre("ingotSteel", "ingotSteel"));
        dustIron = register(new ItemBase("dustIron"));
        dustCoal = register(new ItemBase("dustCoal"));
        dustSteel = register(new ItemBase("dustSteel"));
        dustBronze = register(new ItemBase("dustBronze"));
        ingotBronze = register(new ItemOre("ingotBronze","ingotBronze"));
        gebgetableSeed = register(new ItemGebgetableSeed());
        gebgetable = register(new ItemGebgetable());
        gebCarrot = register(new ItemGebCarrot());
        copperSword = register(new ItemSword(DerpCraft.copperToolMaterial, "copperSword"));
        copperPickaxe = register(new ItemPickaxe(DerpCraft.copperToolMaterial,"copperPickaxe"));
        copperAxe = register(new ItemAxe(DerpCraft.copperToolMaterial,"copperAxe"));
        copperShovel = register(new ItemShovel(DerpCraft.copperToolMaterial, "copperShovel"));
        copperHoe = register(new ItemHoe(DerpCraft.copperToolMaterial, "copperHoe"));
        copperHelmet = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copperHelmet"));
        copperChestplate = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copperChestplate"));
        copperLeggings = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copperLeggings"));
        copperBoots = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.FEET, "copperBoots"));
        hazmatHelmet = register(new ItemArmor(DerpCraft.hazmatArmorMaterial, EntityEquipmentSlot.HEAD, "hazmatHelmet"));
        hazmatChestplate = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.CHEST, "hazmatChestplate"));
        hazmatLeggings = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.LEGS, "hazmatLeggings"));
        hazmatBoots = register(new ItemArmor(DerpCraft.hazmatArmorMaterial, EntityEquipmentSlot.FEET, "hazmatBoots"));
        hammer = register(new ItemBase("hammer"));
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
