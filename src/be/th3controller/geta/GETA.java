package be.th3controller.geta;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class GETA extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	PluginDescriptionFile pdfile;
	
	public void lm(String msg){
		log.info("[GETA] " + msg);
	}
	public void onEnable(){
		pdfile = getDescription();
		getServer().getPluginManager().registerEvents(new GETAListener(this), this);
		File file = new File("plugins/GETA", "config.yml");
		if(!file.exists()) {
			this.saveResource("config.yml", true);
		}
		lm("Successfully initiated the plugin!");
	}

	public void onDisable(){
		lm("Successfully initiated the plugin!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args){
		if(cmd.getName().equalsIgnoreCase("geta")){
			if(!(sender instanceof Player)){
				lm("You are running version "+this.pdfile.getVersion()+" of GETA(Gotta Egg Them All)");
				lm("licensed with GPLv3");
			} else {
				((Player)sender).sendMessage(ChatColor.GREEN+ "You are running version" + this.pdfile.getVersion() + "of GETA(Gotta Egg Them All)");
			}
		}
		return true;
	}
}
