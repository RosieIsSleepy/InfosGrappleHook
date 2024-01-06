package me.info.infosgrapplehook.Listeners;

import me.info.infosgrapplehook.InfosGrappleHook;
import me.info.infosgrapplehook.Managers.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class GrappleListeners implements Listener {

    private boolean GrappleReady = true;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.getInventory().addItem(ItemManager.grapplehook);

    }
    @EventHandler
    public void onGrappleUse(PlayerFishEvent event){
            if(event.getPlayer().getInventory().getItemInMainHand() == null || event.getPlayer().getInventory().getItemInMainHand().getType().isAir()){return;}

        if (GrappleReady == true){
            if (event.getState() == PlayerFishEvent.State.REEL_IN){
                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().equals(ItemManager.grapplehook.getItemMeta())){
                    Vector direction =event.getPlayer().getEyeLocation().getDirection();
                    Vector launch = direction.multiply(3);
                    event.getPlayer().setVelocity(launch);
                }
            }
        }


    }

}
