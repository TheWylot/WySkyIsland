package me.wyskyisland.wyskyisland.Heart;
import me.wyskyisland.wyskyisland.Extra.Mods;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.List;

public class Config {
    public static FileConfiguration cfg = Loader.getConfig;
    public static String PREFIX;
    public static String HELP_MESSAGE;
    public static String NO_PERMISSION;
    public static String FIRSTISLANDMESSAGE;

    public static void initConfigValues() {

        PREFIX = Mods.color(cfg.getString("prefix"));
        HELP_MESSAGE = Mods.color(cfg.getString("helpmessage"));
        NO_PERMISSION = Mods.color(cfg.getString("nopermission"));
        FIRSTISLANDMESSAGE = Mods.color(cfg.getString("firstislandmessage"));

    }
}
