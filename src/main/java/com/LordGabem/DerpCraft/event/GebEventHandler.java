package com.LordGabem.DerpCraft.event;

import com.LordGabem.DerpCraft.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Collection;

import static com.LordGabem.DerpCraft.DerpCraft.i;

public class GebEventHandler {

    public static boolean has17 = false;

    public static boolean has19 = false;

    public static boolean radiationProtected;

    @SubscribeEvent
    public void LivingUpdateEvent(LivingEvent.LivingUpdateEvent event) {
        if(i==0)
            i++;
        else if(event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();

            ItemStack boots = player.inventory.armorItemInSlot(0);
            ItemStack legs = player.inventory.armorItemInSlot(1);
            ItemStack plate = player.inventory.armorItemInSlot(2);
            ItemStack helmet = player.inventory.armorItemInSlot(3);
            if(radiationProtected) {
                Collection<PotionEffect> effects = player.getActivePotionEffects();

                for (PotionEffect effect : effects) {
                    if (effect.getPotion().isBadEffect()) {
                        if(effect.getPotion() != Potion.getPotionById(17)) {
                            System.out.println("Effect is not 17");
                            if (effect.getPotion() != Potion.getPotionById(19)){
                                System.out.println("Effect is not 19. Removing effect");
                                player.removePotionEffect(effect.getPotion());
                            }
                        }
                    }
                }
            }
            if(plate!=null) {
                if (plate.getItem() == ModItems.greenSweatshirt) {
                    radiationProtected = true;
                    player.capabilities.allowFlying = true;
                    player.sendPlayerAbilities();


                } else if (boots != null && legs != null && helmet != null) {
                    if (plate.getItem() == ModItems.hazmatChestplate && boots.getItem() == ModItems.hazmatBoots && legs.getItem() == ModItems.hazmatLeggings && helmet.getItem() == ModItems.hazmatHelmet) {
                        radiationProtected = true;
                        Collection<PotionEffect> effects = player.getActivePotionEffects();

                        for (PotionEffect effect : effects) {
                            if (effect.getPotion().isBadEffect()) {
                               // player.removePotionEffect(effect.getPotion());
                            }
                        }
                    }
                } else {
                    player.capabilities.allowFlying = player.capabilities.isCreativeMode;
                    radiationProtected = false;
                }
            } else {
                player.capabilities.allowFlying = player.capabilities.isCreativeMode;
                radiationProtected = false;
            }
            if(player.inventory.hasItemStack(new ItemStack(ModItems.ingotUranium))) {
                if (plate==null || !radiationProtected) {
                    Collection<PotionEffect> effects = player.getActivePotionEffects();
                    has17 = false;
                    has19 = false;
                    for (PotionEffect effect : effects) {
                        if(effect.getPotion() == Potion.getPotionById(17))
                            has17 = true;
                        if(effect.getPotion() == Potion.getPotionById(19))
                            has19 = true;
                    }
                    System.out.println("17: "+has17+", 19: "+has19);
                    if(!has17)
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(17), 30));
                    if(!has19)
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 30));
                }
            }
        }
    }
}
