package me.elordenador.ratacraft;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventExecutor {
    public static void executeRandomEvent(Player player) throws InterruptedException {
        int random = (int) Math.floor(Math.random() * 20) + 1;
        switch (random) {
            case 1: rata(player, true); break;
            case 2: diamantes(player); break;
            case 3: lava(player); break;
            case 4: jijijija(player); break;
            case 5: nuclear(player); break;
            case 6: sonic(player); break;
            case 7: supersonic(player); break;
            case 8: superratas(player); break;
            case 9: viricos(player); break;
            case 10: colericos(player); break;
            case 11: alfa(player); break;
            case 12: figure(player); break;
            case 13: galletas(player); break;
            case 14: itemrandom(player); break;
            case 15: bomba(player); break;
            case 16: volatilestarlight(player); break;
            case 17: waterdrop(player); break;
            case 18: enderpearl(player); break;
            case 19: creativo(player); break;
            case 20: aventura(player); break;
        }
    }

    private static void broadcast(String message) {
        Bukkit.broadcastMessage(message);
    }

    private static void aventura(Player player) {
        RataCraft rataCraft = RataCraft.instance;
        broadcast(player.getName() + " ha recibido el evento Aventura");
        player.setGameMode(GameMode.ADVENTURE);

        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setGameMode(GameMode.SURVIVAL);
        }, 60 * 20L);




    }

    private static void creativo(Player player)  {
        RataCraft rataCraft = RataCraft.instance;
        broadcast(player.getName() + " ha recibido el evento Creativo");
        player.setGameMode(GameMode.CREATIVE);
        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setGameMode(GameMode.SURVIVAL);
        }, 20 * 20L);
    }

    private static void enderpearl(Player player) {
        broadcast(player.getName() + " ha recibido el evento Ender Pearlll");
        ItemStack perla = new ItemStack(Material.ENDER_PEARL, (int) Math.floor(Math.random()*2) + 1);
        player.getInventory().addItem(perla);
    }

    private static void waterdrop(Player player) {
        broadcast(player.getName() + " ha recibido el evento Water Drop");
        Location location = player.getLocation();
        location.setY(location.getY()+1000);
        player.teleport(location);
    }

    private static void volatilestarlight(Player player) {
        broadcast(player.getName() + " ha recibido el evento Volatile Starlight");

        int numero = (int) Math.floor(Math.random() * 10) + 1;
        if (numero > 2) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 4));
        } else {
            Location location = player.getLocation();
            World world = player.getWorld();
            Creeper creeper = (Creeper) world.spawnEntity(location, EntityType.CREEPER);
            creeper.setPowered(true);
            creeper.explode();
        }
    }

    private static void bomba(Player player) {
        broadcast(player.getName() + " ha recibido el evento Bomba");
        World world = player.getWorld();
        Location location = player.getLocation();
        int n = (int) Math.floor(Math.random()*10) + 1;
        if (n >= 5) {
            for (int i = 0; i < 10; i++) {
                world.spawnEntity(location, EntityType.TNT);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                ItemStack TNT = new ItemStack(Material.TNT);
                player.getInventory().addItem(TNT);
            }
        }
    }

    private static void itemrandom(Player player) {
        broadcast(player.getName() + " ha recibido el evento Me llevo un item random tuyo");
        Inventory inventory = player.getInventory();
        int size = inventory.getSize();
        boolean salida = false;
        while (!salida) {
            int n = (int) Math.floor(Math.random()*size);
            ItemStack item = inventory.getItem(n);
            if (!item.isEmpty()) {
                ItemStack empty = new ItemStack(Material.AIR);
                inventory.setItem(n, empty);
                salida = true;
            }
        }
    }

    private static void galletas(Player player) {
        broadcast(player.getName() + " ha recibido el evento Galletas");
        int quantity = (int) Math.floor(Math.random()*32) + 1;
        for (int i = 0; i < quantity; i++) {
            player.getInventory().addItem(new ItemStack(Material.COOKIE));
        }
    }

    private static void figure(Player player) {
        broadcast(player.getName() + " ha recibido el evento Figure");
        Location location = player.getLocation();
        World world = player.getWorld();
        world.spawnEntity(location, EntityType.WARDEN);
    }

    private static void alfa(Player player) {
        broadcast(player.getName() + " ha recibido el evento Alfa");
        Location location = player.getLocation();
        World world = player.getWorld();
        for (int i = 0; i < 20; i++) {
            Zombie zombie = (Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 3000, 8));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 8));
            zombie.setCustomName("Alfa");

        }
    }

    private static void colericos(Player player) {
        broadcast(player.getName() + " ha recibido el evento Colericos");
        Location location = player.getLocation();
        World world = player.getWorld();
        for (int i = 0; i < 20; i++) {
            Zombie zombie = (Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 3000, 4));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 4));
            zombie.setCustomName("Colerico");

        }
    }

    private static void viricos(Player player) {
        broadcast(player.getName() + " ha recibido el evento Viricos");
        Location location = player.getLocation();
        World world = player.getWorld();
        for (int i = 0; i < 20; i++) {
            Zombie zombie = (Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 3000, 2));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 2));
            zombie.setCustomName("Virico");

        }
    }


    private static void superratas(Player player) {
        broadcast(player.getName() + " ha recibido el evento Super Ratas");
        for (int i = 0; i < 10; i++) {
            rata(player, false);
        }
    }

    private static void supersonic(Player player) throws InterruptedException {
        RataCraft rataCraft = RataCraft.instance;
        broadcast(player.getName() + " ha recibido el evento Super Sonic");
        player.setFlying(true);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 100));

        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setFlying(false);
        }, 60 * 20L);

    }

    private static void sonic(Player player) {
        broadcast(player.getName() + " ha recibido el evento Sonic");
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 10));
    }

    private static void nuclear(Player player) {
        broadcast(player.getName() + " ha recibido el evento Nuclear");
        Location location = player.getLocation();
        World world = location.getWorld();
        for (int i = 0; i < 100; i++) {
            Creeper creeper = (Creeper) world.spawnEntity(location, EntityType.CREEPER);
            creeper.setPowered(true);
            creeper.explode();
        }
    }

    private static void jijijija(Player player) {
        broadcast(player.getName() + " ha recibido el evento jijijija");
        Location location = player.getLocation();
        World world = location.getWorld();
        Creeper creeper = (Creeper) world.spawnEntity(location, EntityType.CREEPER);
        creeper.explode();
    }

    private static void lava(Player player) {
        broadcast(player.getName() + " ha recibido el evento lava");
        Location location = player.getLocation();
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                Block block = player.getWorld().getBlockAt(location.blockX()+x, location.blockY() - 1, location.blockZ() + z );
                block.setType(Material.LAVA);
            }
        }
    }

    private static void diamantes(Player player) {
        broadcast(player.getName() + " ha recibido el evento Diamantes");
        int quantity = (int) Math.floor(Math.random()*32) + 1;
        for (int i = 0; i < quantity; i++) {
            player.getInventory().addItem(new ItemStack(Material.DIAMOND));
        }
    }

    private static void rata(Player player, boolean instance) {
        if (instance) broadcast(player.getName() + " ha recibido el evento Rata");

        World world = player.getWorld();
        Location loc = player.getLocation();
        Silverfish rata = (Silverfish) world.spawnEntity(loc, EntityType.SILVERFISH);
        rata.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 3000, 100));
        rata.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 2));
        rata.setCustomName("RATA");
    }
}
