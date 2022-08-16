package de.Kiwi.BattlePlayer.Main;

import de.Kiwi.BattlePlayer.Config.ItemsConfigCreate.CreateMusic;
import de.Kiwi.BattlePlayer.Config.SettingConfigCreate.CreateSettings;
import de.Kiwi.BattlePlayer.Events.CMD_Open_GUI;
import de.Kiwi.BattlePlayer.Events.InvClick;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        CreateSettings.CreateSettings();
        CreateMusic.CreateMuisc();
        getCommand("KiwisBattlePlayer").setExecutor(new CMD_Open_GUI());
        Bukkit.getPluginManager().registerEvents(new InvClick(),this);
    }
}
