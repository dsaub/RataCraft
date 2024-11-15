package me.elordenador.ratacraft;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.World;
import org.bukkit.Location;

public class RataListener implements Listener {
    public RataListener() {

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) throws InterruptedException {
        Player player = event.getPlayer();

        int n = (int) Math.floor(Math.random()*20) + 1;
        if (n == 1) EventExecutor.executeRandomEvent(player);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) throws InterruptedException {
        Player player = event.getPlayer();

        int n = (int) Math.floor(Math.random()*20) + 1;
        if (n == 1) EventExecutor.executeRandomEvent(player);
    }

    @EventHandler
    public void onDeath(EntityDeathEvent event) throws InterruptedException {
        String name = event.getEntity().getCustomName();
        if (name.equals("REVENTON")) {
            Player player = (Player) event.getDamageSource().getCausingEntity();
            World world = player.getWorld();
            Location location = player.getLocation();
            Creeper creeper = (Creeper) world.spawnEntity(location, EntityType.CREEPER);
            creeper.setPowered(true);
            creeper.explode();

        }


        Player player = (Player) event.getDamageSource().getCausingEntity();
        int n = (int) Math.floor(Math.random()*20) + 1;
        if (n == 1) EventExecutor.executeRandomEvent(player);
    }

    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        if (event.getEntity().getCustomName().equals("CREEPER AMISTOSO")) {
            event.setCancelled(true);
        }
    }
}
