package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Collection;

public class GreenSweatshirt extends ItemArmor{

    public GreenSweatshirt() {
        super(DerpCraft.sweatshirtArmorMaterial, EntityEquipmentSlot.CHEST, "greenSweatshirt");
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        if (player.inventory.armorItemInSlot(2) != null) {
            ItemStack plate = player.inventory.armorItemInSlot(2);

            if (plate.getItem() == ModItems.greenSweatshirt)
            {
                player.capabilities.allowFlying = true;
                player.sendPlayerAbilities();

                Collection<PotionEffect> effects = player.getActivePotionEffects();

                for (PotionEffect effect : effects) {
                    if(effect.getPotion().isBadEffect()) {
                        player.removePotionEffect(effect.getPotion());
                    }
                }
            }
        }
    }
}