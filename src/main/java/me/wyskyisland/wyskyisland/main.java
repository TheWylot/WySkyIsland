package me.wyskyisland.wyskyisland;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import me.wyskyisland.wyskyisland.Extra.Mods;

public class main extends JavaPlugin {

    public static Plugin getPlugin() {
        return plugin;
    }
    private static Plugin plugin;

    public static Plugin getInst() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        logConsole("&bWySkyIsland Load Shod.");
    }

    public void logConsole(String str) {
        this.getServer().getConsoleSender().sendMessage(Mods.color(str));
    }
}
