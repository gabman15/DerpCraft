package com.LordGabem.DerpCraft.item;

import com.LordGabem.DerpCraft.DerpCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {

    public static boolean radiationProtected = false;

    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material,0,slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel(Item item) {
        DerpCraft.proxy.registerItemRenderer(this,0,name);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.inventory.armorItemInSlot(2) != null) {
            ItemStack plate = player.inventory.armorItemInSlot(2);
            if (plate.getItem() == ModItems.greenSweatshirt) {
                player.capabilities.allowFlying = true;
                player.sendPlayerAbilities();
            }
        }
    }

}
