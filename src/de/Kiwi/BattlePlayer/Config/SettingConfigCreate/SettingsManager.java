package de.Kiwi.BattlePlayer.Config.SettingConfigCreate;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.IOException;

public class SettingsManager {
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(CreateSettings.SetConfig);

    public static void Settings() {
        cfg.options().header("Kiwi's Guns Settings\n" +
                "Here you have the general settings that are important\n\n" +
                "Documentation: \n" +
                "Setting.General.WorldName == Set the world where the weapons are used\n" +
                "Setting.General.Permissions == \n" +
                "This will disable or enable the permissions for the plugin\n" +
                "Setting.General.ResourcePack-Enable == This activates or deactivates the server and plugin texture pack\n" +
                "Setting.General.ResourcePack == \n" +
                "Set the link for the server texture pack\n" +
                "Setting.General.ShowTeam == In the tab list, the team is displayed based on the weapon being used, be careful it can consume resources such as RAM");

        cfg.set("Setting.General.WorldName", "world");
        // cfg.set("Setting.General.ArmorWeight", true);
        cfg.set("Setting.General.Permissions", true );
        cfg.set("Setting.General.ResourcePack-Enable", true);
        cfg.set("Setting.General.ResourcePack", "https://kiwiletsplay.de/sites/Downloads/Data/Textures/2D/KiwisGuns-2D.zip?dl=1");
        cfg.set("Setting.General.ShowTeam", false);
        save(cfg);
    }
    private static void save(YamlConfiguration cfg) {
        try {
            cfg.save(CreateSettings.SetConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int ausgabe(String key) {
        return cfg.getInt(key);
    }

    public static String get(String key) {
        String s = (String) cfg.get(key);
        return ChatColor.translateAlternateColorCodes('&', s);
    }
    public static String GetString(String key) {
        return (String) cfg.get(key);
    }

    public static boolean getbo(String key) {
        return cfg.getBoolean(key);
    }

    public static int damage(String key) {
        return cfg.getInt(key);
    }

}
