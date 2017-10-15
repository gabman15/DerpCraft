package com.LordGabem.DerpCraft;

import com.LordGabem.DerpCraft.blocks.ModBlocks;
import com.LordGabem.DerpCraft.client.DerpCraftTab;
import com.LordGabem.DerpCraft.item.ModItems;
import com.LordGabem.DerpCraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
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

    @SidedProxy(serverSide = "com.LordGabem.DerpCraft.proxy.CommonProxy", clientSide = "com.LordGabem.DerpCraft.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static DerpCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Initialized: DerpCraft says SKREEEEEEEEE");
    }

}
