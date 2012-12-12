package be.th3controller.geta;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class GETAListener implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void PlayerInteractingEntity(PlayerInteractEntityEvent event){
		Player p = event.getPlayer();
		Entity rightclick = event.getRightClicked();
		Location loc = rightclick.getLocation();
		PlayerInventory inventory = p.getInventory();
		if(rightclick instanceof Creeper && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.creeper", p)){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)50));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a creeper!");
		}
		else if(rightclick instanceof Ghast && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.ghast", p)){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)56));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a ghast!");
		}
		else if(rightclick instanceof PigZombie && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.pigzombie", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)57));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a zombie pigman!");
		}
		else if(rightclick instanceof Enderman && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.enderman", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)58));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a enderman!");
		}
		else if(rightclick instanceof CaveSpider && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.cavespider", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)59));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a cave spider!");
		}
		else if(rightclick instanceof Blaze && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.blaze", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)61));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a blaze!");
		}
		else if(rightclick instanceof Bat && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.bat", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)65));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a bat!");
		}
		else if(rightclick instanceof Pig && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.pig", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)90));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a pig!");
		}
		else if(rightclick instanceof Sheep && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.sheep", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)91));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a sheep!");
		}
		else if(event.getRightClicked().getType() == EntityType.COW && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.cow", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)92));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a cow!");
		}
		else if(rightclick instanceof Chicken && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.chicken", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)93));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a chicken!");
		}
		else if(rightclick instanceof Squid && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.squid", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)94));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a squid!");
		}
		else if(rightclick instanceof Wolf && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.wolf", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)95));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a wolf!");
		}
		else if(event.getRightClicked().getType() == EntityType.MUSHROOM_COW && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.mooshroom", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)96));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a cow with the mad cow desease!");
		}
		else if(rightclick instanceof Ocelot && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.ocelot", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)98));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a ocelot!");
		}
		else if(rightclick instanceof Villager && p.getItemInHand().getType() == Material.STICK && hasPerms("geta.villager", p) && event.getPlayer().isOp()){
			rightclick.remove();
			inventory.addItem(new ItemStack(Material.MONSTER_EGG, 1, (short)120));
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
			p.updateInventory();
			p.sendMessage(ChatColor.GREEN+"You caught a villager!");
		}
	}
	private boolean hasPerms(String perm, Player p){
		return p.hasPermission(perm);
	}
}
