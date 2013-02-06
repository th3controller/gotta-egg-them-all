package be.th3controller.geta;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class GETAListener implements Listener {
	
	GETA plugin;
	
	public GETAListener(GETA plugin) {
		this.plugin = plugin;
	}
	/**
	 * 
	 * @param perm Permission to be used
	 * @param p Player involved
	 * @return Returns true if the player has permission
	 */
	private boolean hasPerms(String perm, Player p) {
		return p.hasPermission(perm);
	}
	/**
	 * Spawns an instance of an entity
	 * @param p The target player
	 * @param rc The entity that is involved
	 * @param loc The location where effects of smoke would occur
	 * @param inv The target inventory
	 * @param mobname The name that should be displayed when an entity is caught
	 * @param entid The entity ID
	 */
	@SuppressWarnings("deprecation")
	public void spawninstance(Player p, Entity rc, Location loc, PlayerInventory inv, String mobname, Short entid) {
		rc.remove();
		inv.addItem(new ItemStack(Material.MONSTER_EGG, 1, entid));
		loc.getWorld().playEffect(loc, Effect.SMOKE, 4);
		p.updateInventory();
		p.sendMessage(ChatColor.GREEN+"You caught a "+mobname+"!");
	}
	
	@EventHandler
	public void PlayerInteractingEntity(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
		Entity rightclick = event.getRightClicked();
		String nameent = rightclick.getType().getName();
		short endid = rightclick.getType().getTypeId();
		Location loc = rightclick.getLocation();
		PlayerInventory inventory = p.getInventory();
		if(p.getItemInHand().getType() == Material.STICK) {
			if(rightclick instanceof Bat && hasPerms("geta.bat", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Chicken && hasPerms("geta.chicken", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Cow && hasPerms("geta.cow", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof MushroomCow && hasPerms("geta.mooshroom", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Ocelot && hasPerms("geta.ocelot", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Pig && hasPerms("geta.pig", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Sheep && hasPerms("geta.sheep", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Squid && hasPerms("geta.squid", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Villager && hasPerms("geta.villager", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Enderman && hasPerms("geta.enderman", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Wolf && hasPerms("geta.wolf", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof PigZombie && hasPerms("geta.pigzombie", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Blaze && hasPerms("geta.blaze", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof CaveSpider && hasPerms("geta.cavespider", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Creeper && hasPerms("geta.creeper", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Ghast && hasPerms("geta.ghast", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof MagmaCube && hasPerms("geta.magmacube", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Silverfish && hasPerms("geta.silverfish", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Skeleton && hasPerms("geta.skeleton", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Slime && hasPerms("geta.slime", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Spider && hasPerms("geta.spider", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Witch && hasPerms("geta.witch", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
			else if(rightclick instanceof Zombie && hasPerms("geta.zombie", p)) {
				spawninstance(p, rightclick, loc, inventory, nameent, endid);
			}
		}
	}
}
