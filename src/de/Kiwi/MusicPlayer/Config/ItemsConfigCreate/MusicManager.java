package de.Kiwi.MusicPlayer.Config.ItemsConfigCreate;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;
import java.util.Collections;

public class MusicManager {
        public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(CreateMusic.MConfig);

        public static void Music() {
            cfg.options().setHeader(Collections.singletonList("Kiwi's MusicPlayer" + "\n\n"
                    + "#Documentaion: " + "\n"
                    + "#Enable: true  // Activates/deactivates the item in inventory (if deactivated, replaced with a glass pane) " + "\n"
                    + "#IconSkull: <Value>  //  Determine the head that should be used as an icon for the song (use a head value best from https://minecraft-heads.com/)" + "\n"
                    + "#Name: <String>  //  That's the name of the song" + "\n"
                    + "#Writer: <String>  //  This is the creator of the song" + "\n"
                    + "#Album: >String>  //  That's the name of the album this song comes from" + "\n"
                    + "" + "\n"));
            cfg.set("Music.ID1.Enable", true);
            cfg.set("Music.ID1.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID1.Name", "Wait");
            cfg.set("Music.ID1.Writer", "C418");
            cfg.set("Music.ID1.Album", "Minecraft - Volume Beta No. 21");


            cfg.set("Music.ID2.Enable", true);
            cfg.set("Music.ID2.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID2.Name", "Chirp");
            cfg.set("Music.ID2.Writer", "C418");
            cfg.set("Music.ID2.Album", "Minecraft - Volume Beta No. 20");


            cfg.set("Music.ID3.Enable", true);
            cfg.set("Music.ID3.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID3.Name", "Pigstep");
            cfg.set("Music.ID3.Writer", "Lena Raine");
            cfg.set("Music.ID3.Album", "Minecraft: Nether Update (Original Game Soundtrack) No. 4");


            cfg.set("Music.ID4.Enable", true);
            cfg.set("Music.ID4.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID4.Name", "Thirteen");
            cfg.set("Music.ID4.Writer", "C418");
            cfg.set("Music.ID4.Album", "Minecraft - Volume Alpha No. 16");


            cfg.set("Music.ID5.Enable", true);
            cfg.set("Music.ID5.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID5.Name", "Cat");
            cfg.set("Music.ID5.Writer", "C418");
            cfg.set("Music.ID5.Album", "Minecraft - Volume Alpha No. 19");


            cfg.set("Music.ID6.Enable", true);
            cfg.set("Music.ID6.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID6.Name", "Blocks");
            cfg.set("Music.ID6.Writer", "C418");
            cfg.set("Music.ID6.Album", "Minecraft - Volume Beta No. 28");


            cfg.set("Music.ID7.Enable", true);
            cfg.set("Music.ID7.IconSkull","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYWVhZDkzMWJlNTdkODU4NDE2ZWVlNGU1ZWY5ZjU5Mjg2MDg5NTM1OGU3ZTZkNTJhMmVkZTc3YzEzMmU5MyJ9fX0=");
            cfg.set("Music.ID7.Name", "otherside");
            cfg.set("Music.ID7.Writer", "Lena Raine");
            cfg.set("Music.ID7.Album", "Minecraft: Caves & Cliffs (Original Game Soundtrack) No. 7");

            save(cfg);
        }
        private static void save(YamlConfiguration cfg) {
            try {
                cfg.save(CreateMusic.MConfig);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static int Nummer(String key) {
            return cfg.getInt(key);
        }

        public static String Color(String key) {
            String s = (String) cfg.get(key);
            return ChatColor.translateAlternateColorCodes('&', s);
        }
        public static String Text(String key) {
            return (String) cfg.get(key);
        }

        public static boolean Enable(String key) {
            return cfg.getBoolean(key);
        }
        public static ItemStack Item(Material key) {
            return cfg.getItemStack(String.valueOf(key));
        }

    }
