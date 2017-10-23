package com.LordGabem.DerpCraft;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.client.DerpCraftTab;
import com.LordGabem.DerpCraft.event.GebEventHandler;
import com.LordGabem.DerpCraft.item.ModItems;
import com.LordGabem.DerpCraft.proxy.CommonProxy;
import com.LordGabem.DerpCraft.recipe.ModRecipes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DerpCraft.MODID, name = DerpCraft.name, version = DerpCraft.VERSION)
public class DerpCraft
{
    public static final String MODID = "derpcraft";
    public static final String name = "Derp Craft";
    public static final String VERSION = "1.0";

    public static final DerpCraftTab creativeTab = new DerpCraftTab();

    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6,2, 14);
    //public static final Item.ToolMaterial stickToolMaterial = EnumHelper.addToolMaterial("STICK", 2, -1, 6,1, 50);

    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial sweatshirtArmorMaterial = EnumHelper.addArmorMaterial("SWEATSHIRT", MODID + ":sweatshirt", 50, new int[]{50, 50, 50, 50}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 20.0F);
    public static final ItemArmor.ArmorMaterial hazmatArmorMaterial = EnumHelper.addArmorMaterial("HAZMAT", MODID + ":hazmatsuit", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

    @SidedProxy(serverSide = "com.LordGabem.DerpCraft.proxy.CommonProxy", clientSide = "com.LordGabem.DerpCraft.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static DerpCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
        System.out.println("Initialized: DerpCraft says SKREEEEEEEEE");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new GebEventHandler());
    }


}
