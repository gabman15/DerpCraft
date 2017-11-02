package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import com.LordGabem.DerpCraft.item.tool.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDamage;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    //METALS
    public static ItemUranium ingotUranium;
    public static ItemOre ingotCopper;
    public static ItemOre ingotTin;
    public static ItemOre ingotSteel;
    public static ItemOre dustIron;
    public static ItemOre dustCoal;
    public static ItemOre dustSteel;
    public static ItemOre dustBronze;
    public static ItemOre ingotBronze;
    public static ItemOre dustOmnite;
    public static ItemOre ingotOmnite;
    public static ItemOre dustDerpium;
    public static ItemOre ingotDerpium;
    public static ItemOre dustMegaDiamond;
    public static ItemOre dustDiamond;
    public static ItemBase megaDiamond;
    public static ItemBase pureMaterial;
    public static ItemOre dustCopper;
    public static ItemOre dustTin;

    //CROPS
    public static ItemGebgetableSeed gebgetableSeed;
    public static ItemFoodBase gebgetable;
    public static ItemFoodBase gebCarrot;
    public static ItemFoodBase gebFood;

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
    public static Hazmat hazmatHelmet;
    public static Hazmat hazmatChestplate;
    public static Hazmat hazmatLeggings;
    public static Hazmat hazmatBoots;
    public static ItemBase hammer;
    public static ItemBase theStick;
    public static GreenSweatshirt greenSweatshirt;
    public static ItemBase fiberSweatshirt;
    public static ItemBase pieceSweatshirt;

    //MISC
    public static ItemBase wings;

    public static void init() {
        ingotUranium = register(new ItemUranium());
        ingotCopper = register(new ItemOre("ingotCopper","ingotCopper"));
        ingotTin = register(new ItemOre("ingotTin","ingotTin"));
        ingotSteel = register(new ItemOre("ingotSteel", "ingotSteel"));
        dustIron = register(new ItemOre("dustIron","dustIron"));
        dustCoal = register(new ItemOre("dustCoal","dustCoal"));
        dustSteel = register(new ItemOre("dustSteel","dustSteel"));
        dustBronze = register(new ItemOre("dustBronze","dustBronze"));
        ingotBronze = register(new ItemOre("ingotBronze","ingotBronze"));
        dustOmnite = register(new ItemOre("dustOmnite","dustOmnite"));
        ingotOmnite = register(new ItemOre("ingotOmnite","ingotOmnite"));
        dustDerpium = register(new ItemOre("dustDerpium", "dustDerpium"));
        ingotDerpium = register(new ItemOre("ingotDerpium", "ingotDerpium"));
        dustDiamond = register(new ItemOre("dustDiamond", "dustDiamond"));
        dustMegaDiamond = register(new ItemOre("dustMegaDiamond", "dustMegaDiamond"));
        megaDiamond = register(new ItemBase("megaDiamond"));
        pureMaterial = register(new ItemBase("pureMaterial"));
        dustCopper = register(new ItemOre("dustCopper", "dustCopper"));
        dustTin = register(new ItemOre("dustTin", "dustTin"));

        gebgetableSeed = register(new ItemGebgetableSeed());
        gebgetable = register(new ItemFoodBase(5, .6f,"gebgetable", "cropGebgetable"));
        gebCarrot = register(new ItemFoodBase(8, .6f, "gebCarrot", "cropGebCarrot"));
        gebFood = register(new ItemFoodBase(20, 10.0f, "gebFood", "gebFood"));

        copperSword = register(new ItemSword(DerpCraft.copperToolMaterial, "copperSword"));
        copperPickaxe = register(new ItemPickaxe(DerpCraft.copperToolMaterial,"copperPickaxe"));
        copperAxe = register(new ItemAxe(DerpCraft.copperToolMaterial,"copperAxe"));
        copperShovel = register(new ItemShovel(DerpCraft.copperToolMaterial, "copperShovel"));
        copperHoe = register(new ItemHoe(DerpCraft.copperToolMaterial, "copperHoe"));
        theStick = register(new ItemBase("theStick"));
        copperHelmet = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copperHelmet"));
        copperChestplate = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copperChestplate"));
        copperLeggings = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copperLeggings"));
        copperBoots = register(new ItemArmor(DerpCraft.copperArmorMaterial, EntityEquipmentSlot.FEET, "copperBoots"));
        hazmatHelmet = register(new Hazmat(EntityEquipmentSlot.HEAD, "hazmatHelmet"));
        hazmatChestplate = register(new Hazmat(EntityEquipmentSlot.CHEST, "hazmatChestplate"));
        hazmatLeggings = register(new Hazmat(EntityEquipmentSlot.LEGS, "hazmatLeggings"));
        hazmatBoots = register(new Hazmat(EntityEquipmentSlot.FEET, "hazmatBoots"));
        hammer = register(new ItemBase("hammer"));
        greenSweatshirt = register(new GreenSweatshirt());

        wings = register(new ItemBase("wings"));
        fiberSweatshirt = register(new ItemBase("fiberSweatshirt"));
        pieceSweatshirt = register(new ItemBase("pieceSweatshirt"));
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
