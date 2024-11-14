package me.elordenador.ratacraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class RataCraft extends JavaPlugin {
    public static RataCraft instance;
    @Override
    public void onEnable() {
        instance = this;
        RataListener listener = new RataListener();

        getServer().getPluginManager().registerEvents(listener, this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
