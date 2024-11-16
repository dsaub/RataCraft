package me.elordenador.ratacraft;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventExecutor {
    public static void executeRandomEvent(Player player) throws InterruptedException {
        int random = (int) Math.floor(Math.random() * 40) + 1;
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
            case 21: espectador(player); break;
            case 22: levitation(player); break;
            case 23: goodluck(player); break;
            case 24: tntpillar(player); break;
            case 25: oneminutedeath(player); break;
            case 26: bugcerdo(player); break;
            case 27: instantdeath(player); break;
            case 28: diamondstellar(player); break;
            case 29: leatherarmorcursed(player); break;
            case 30: goldarmorcursed(player); break;
            case 31: chainmailarmorcursed(player); break;
            case 32: ironarmorcursed(player); break;
            case 33: diamondarmorcursed(player); break;
            case 34: netheritearmorcursed(player); break;
            case 35: laaldeaparati(player); break;
            case 36: pillagers(player); break;
            case 37: explosivezombie(player); break;
            case 38: friendly_creeper(player); break;
            case 39: rocket(player); break;
            case 40: thevoid(player); break;

            
        }
    }

    private static void thevoid(Player player) {
        broadcast(player.getName() + " ha recibido el evento Bienvenidos a las backrooms");
        Location location = player.getLocation();
        location.setY(0);
        player.teleport(location);
    }

    private static void rocket(Player player) {
        broadcast(player.getName() + " ha recibido el evento Piuuuuum");
        player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10*60, 100));
    }

    private static void friendly_creeper(Player player) {
        broadcast(player.getName() + " ha recibido el evento Dale cariño");
        Location location = player.getLocation();
        World world = player.getWorld();
        Creeper creeper = (Creeper) world.spawnEntity(location, EntityType.CREEPER);
        creeper.setCustomName("CREEPER AMISTOSO");
    }

    private static void explosivezombie(Player player) {
        broadcast(player.getName() + " ha recibido el evento Uups");
        Location location = player.getLocation();
        World world = player.getWorld();
        Zombie zombie = (Zombie) world.spawnEntity(location, EntityType.ZOMBIE);
        zombie.setCustomName("REVENTON");
    }

    private static void pillagers(Player player) {
        broadcast(player.getName() + " ha recibido el evento Oops");
        Location location = player.getLocation();
        World world = player.getWorld();
        for (int i = 0; i < 20; i++) {
            world.spawnEntity(location, EntityType.PILLAGER);
        }
    }

    private static void laaldeaparati(Player player) {
        broadcast(player.getName() + " ha recibido el evento La aldea para ti");
        Location location = player.getLocation();
        World world = player.getWorld();
        for (int i = 0; i < 20; i++) {
            world.spawnEntity(location, EntityType.VILLAGER);
        }
    }

    private static void netheritearmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de netherite");
        ItemStack HELMET = new ItemStack(Material.NETHERITE_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.NETHERITE_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);

    }

    private static void diamondarmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de diamante");
        ItemStack HELMET = new ItemStack(Material.DIAMOND_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.DIAMOND_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);
    }

    private static void ironarmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de hierro");
        ItemStack HELMET = new ItemStack(Material.IRON_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.IRON_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.IRON_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);
    }

    private static void chainmailarmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de chain");
        ItemStack HELMET = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.CHAINMAIL_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);
    }

    private static void goldarmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de oro");
        ItemStack HELMET = new ItemStack(Material.GOLDEN_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.GOLDEN_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.GOLDEN_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);
    }

    private static void leatherarmorcursed(Player player) {
        broadcast(player.getName() + " ha recibido el evento Armor maldita de cuero");
        ItemStack HELMET = new ItemStack(Material.LEATHER_HELMET);
        ItemStack CHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack LEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack BOOTS = new ItemStack(Material.LEATHER_BOOTS);
        HELMET.addEnchantment(Enchantment.BINDING_CURSE, 1);
        CHESTPLATE.addEnchantment(Enchantment.BINDING_CURSE, 1);
        LEGGINGS.addEnchantment(Enchantment.BINDING_CURSE, 1);
        BOOTS.addEnchantment(Enchantment.BINDING_CURSE, 1);

        PlayerInventory inventory = (PlayerInventory) player.getInventory();
        inventory.setHelmet(HELMET);
        inventory.setChestplate(CHESTPLATE);
        inventory.setLeggings(LEGGINGS);
        inventory.setBoots(BOOTS);
    }

    private static void diamondstellar(Player player) {
        broadcast(player.getName() + " ha recibido el evento Pilares de la fortuna");
        Location location = player.getLocation();
        for (int x = -1; x <= 1; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = -1; z <= 1; z++) {
                    Block block = player.getWorld().getBlockAt(location.blockX()+x, location.blockY()+y - 1, location.blockZ() + z );
                    block.setType(Material.DIAMOND_BLOCK);
                }
            }

        }
    }

    private static void instantdeath(Player player) {
        broadcast(player.getName() + " ha recibido el evento Mira abajo");
        player.setHealth(0.0);
    }

    private static void bugcerdo(Player player) {
        broadcast(player.getName() + " ha recibido el evento Coche Bug");
        World world = player.getWorld();
        Location location = player.getLocation();

        Pig cerdo = (Pig) world.spawnEntity(location, EntityType.PIG);
        cerdo.addPassenger(player);
        cerdo.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 2*20, 100));
    }


    private static void oneminutedeath(Player player) {
        broadcast(player.getName() + " ha recibido el evento Vas a morir en un minuto");
        RataCraft rataCraft = RataCraft.instance;
        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setHealth(0.0);
        }, 60 * 20L);
    }

    private static void tntpillar(Player player) {
        broadcast(player.getName() + " ha recibido el evento Pilares de la (no)Fortuna");
        Location location = player.getLocation();
        for (int x = -1; x <= 1; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = -1; z <= 1; z++) {
                    Block block = player.getWorld().getBlockAt(location.blockX()+x, location.blockY()+y - 1, location.blockZ() + z );
                    block.setType(Material.TNT);
                }
            }

        }
    }

    private static void goodluck(Player player) {
        broadcast(player.getName() + " ha recibido el evento Buena Suerte");
        player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*60, 100));
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20*60, 100));
    }

    private static void levitation(Player player) {
        broadcast(player.getName() + " ha recibido el evento Levitación");
        player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20*60, 1));
    }

    private static void espectador(Player player) {
        RataCraft rataCraft = RataCraft.instance;
        broadcast(player.getName() + " ha recibido el evento Espectador");
        player.setGameMode(GameMode.SPECTATOR);

        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setGameMode(GameMode.SURVIVAL);
        }, 60 * 20L);

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
        Warden warden = (Warden) world.spawnEntity(location, EntityType.WARDEN);
        Bukkit.getScheduler().runTaskLater(RataCraft.instance, () -> {
            warden.setHealth(0);
        }, 60*20L);
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
            Bukkit.getScheduler().runTaskLater(RataCraft.instance, () -> {
                zombie.setHealth(0);
            }, 60*20L);

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
            Bukkit.getScheduler().runTaskLater(RataCraft.instance, () -> {
                zombie.setHealth(0);
            }, 60*20L);

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
            Bukkit.getScheduler().runTaskLater(RataCraft.instance, () -> {
                zombie.setHealth(0);
            }, 60*20L);

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
        player.setAllowFlight(true);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60*20, 100));

        Bukkit.getScheduler().runTaskLater(rataCraft, () -> {
            player.setAllowFlight(false);
        }, 60 * 20L);

    }

    private static void sonic(Player player) {
        broadcast(player.getName() + " ha recibido el evento Sonic");
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60*20, 10));
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
        Bukkit.getScheduler().runTaskLater(RataCraft.instance, () -> {
            rata.setHealth(0);
        }, 60*20L);
    }
}
