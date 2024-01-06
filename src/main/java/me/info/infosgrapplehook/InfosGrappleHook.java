package me.info.infosgrapplehook;

import me.info.infosgrapplehook.Listeners.GrappleListeners;
import me.info.infosgrapplehook.Managers.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class InfosGrappleHook extends JavaPlugin {
    private static InfosGrappleHook instance;
    @Override
    public void onEnable() {
        InfosGrappleHook.instance = this;
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new GrappleListeners(), this);
    }

    public static InfosGrappleHook getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
