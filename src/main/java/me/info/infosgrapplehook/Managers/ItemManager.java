package me.info.infosgrapplehook.Managers;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack grapplehook;

    public static void init(){createGrappleHook();}

    private static void createGrappleHook(){
        ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6§lGrapple Hook");
        List<String> lore = new ArrayList<>();
        lore.add("§6Use this hook to fling in the ");
        lore.add("§6direction you are looking!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1 , true);
        meta.isUnbreakable();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        grapplehook = item;
    }

}
