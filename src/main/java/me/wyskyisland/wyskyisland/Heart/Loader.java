package me.wyskyisland.wyskyisland.Heart;
import me.wyskyisland.wyskyisland.*;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;

public class Loader {
    public static FileConfiguration getConfig;
    private static File configfile;
    private static FileConfiguration config;

    public static void createConfig() throws IOException, InvalidConfigurationException {

        configfile = new File(main.getInst().getDataFolder(), "config.yml");

        if (!configfile.exists()) {
            configfile.getParentFile().mkdirs();
            main.getInst().saveResource("config.yml", false);
        }

        config = new YamlConfiguration();
        config.load(configfile);
    }

    public static void reloadConfig() {

        try {
            config.load(configfile);
            Config.initConfigValues();
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static FileConfiguration getConfig() {
        return config;
    }
}
