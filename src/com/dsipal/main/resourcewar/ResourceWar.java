package com.dsipal.main.resourcewar;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ResourceWar extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Resource War Enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Resource War Disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("resourcewar")) {
            try{
                Player s = (Player)sender;
                Chunk loc = s.getLocation().getChunk();
                return true;
            } catch(Exception e) {
                System.out.println("Error handling command.");
                return false;
            }

        } else {
            return false;
        }
    }
}
