package de.Kiwi.MusicPlayer.Main;

import de.Kiwi.MusicPlayer.Config.ItemsConfigCreate.CreateMusic;
import de.Kiwi.MusicPlayer.Config.SettingConfigCreate.CreateSettings;
import de.Kiwi.MusicPlayer.Events.CMD_Open_GUI;
import de.Kiwi.MusicPlayer.Events.InvClick;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID1.InvClickID1;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID2.InvClickID2;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID3.InvClickID3;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID4.InvClickID4;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID5.InvClickID5;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID6.InvClickID6;
import de.Kiwi.MusicPlayer.Inventory.Songs.ID7.InvClickID7;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        CreateMusic.CreateMuisc();
        CreateSettings.CreateSettings();


        getCommand("music").setExecutor(new CMD_Open_GUI());
        Bukkit.getPluginManager().registerEvents(new InvClick(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID1(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID2(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID3(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID4(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID5(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID6(),this);
        Bukkit.getPluginManager().registerEvents(new InvClickID7(),this);

    }
}
