package com.LordGabem.DerpCraft.event;

import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GebEventHandler {
    @SubscribeEvent
    public void LivingUpdateEvent(LivingEvent.LivingUpdateEvent event) {
        if(event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            ItemStack plate = player.inventory.armorItemInSlot(2);
            if(plate!=null && plate.getItem() == ModItems.greenSweatshirt) {
                player.capabilities.allowFlying = true;
            }
            else {
                player.capabilities.allowFlying = player.capabilities.isCreativeMode;
            }
        }
    }
}
