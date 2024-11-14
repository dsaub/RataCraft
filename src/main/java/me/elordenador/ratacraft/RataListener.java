package me.elordenador.ratacraft;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;

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
        Player player = (Player) event.getDamageSource().getCausingEntity();
        int n = (int) Math.floor(Math.random()*20) + 1;
        if (n == 1) EventExecutor.executeRandomEvent(player);
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) throws InterruptedException {
        Player player = event.getPlayer();
        int n = (int) Math.floor(Math.random()*1000) + 1;
        if (n == 1) EventExecutor.executeRandomEvent(player);
    }
}
