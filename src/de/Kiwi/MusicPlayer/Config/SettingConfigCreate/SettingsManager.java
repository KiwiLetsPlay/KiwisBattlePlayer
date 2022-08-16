package de.Kiwi.MusicPlayer.Config.SettingConfigCreate;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.IOException;

public class SettingsManager {
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(CreateSettings.SetConfig);

    public static void Settings() {
        cfg.options().header("Kiwi's MusicPlayer Settings\n\n\n"
                + "Documentaion:" + "\n\n"
                + "Chat.Message.Prefix " + "= Set the prefix for the chat" + "\n"
                + "Chat.Message.Enable " + "= Enable/Disable the message in the chat" + "\n"
                + "Chat.Message.Playing " + "= Set the chat message for now playing" + "\n\n"
                + "Actionbar.Message.Enable " + "= Enable/Disable the message in the Actionbar" + "\n\n"
                + "Custom.Texture.Enable " + "= Enable/Disable the button for the textures in the inventory" + "\n"
                + "Custom.Texture.Source " + "= Set the texture pack link in inventory (Works only if Custom.Texture.Enable has been enabled)" + "\n\n"
                + "Music.Sound.ID " + "= Set the sound for the id's (It is recommended not to change this if you are not familiar with sounds)" + "\n");

        cfg.set("Chat.Messages.Prefix","[&4Kiwis MusicPlayer&f]: ");
        cfg.set("Chat.Message.Enable", true);
        cfg.set("Chat.Message.Playing", "Now playing");


        cfg.set("Actionbar.Message.Enable", true);
        cfg.set("Custom.Texture.Enable", false);
        cfg.set("Custom.Texture.Source", "");

        cfg.set("Music.Sound.ID1", "MUSIC_DISC_WAIT");
        cfg.set("Music.Sound.ID2", "MUSIC_DISC_CHIRP");
        cfg.set("Music.Sound.ID3", "MUSIC_DISC_PIGSTEP");
        cfg.set("Music.Sound.ID4", "MUSIC_DISC_13");
        cfg.set("Music.Sound.ID5", "MUSIC_DISC_CAT");
        cfg.set("Music.Sound.ID6", "MUSIC_DISC_BLOCKS");
        cfg.set("Music.Sound.ID7", "MUSIC_DISC_OTHERSIDE");

        save(cfg);
    }
    private static void save(YamlConfiguration cfg) {
        try {
            cfg.save(CreateSettings.SetConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String get(String key) {
        String s = (String) cfg.get(key);
        return ChatColor.translateAlternateColorCodes('&', s);
    }
    public static String MusicDisc(String key) {
        return (String) cfg.get(key);
    }

    public static boolean getbo(String key) {
        return cfg.getBoolean(key);
    }

    public static int damage(String key) {
        return cfg.getInt(key);
    }

}
