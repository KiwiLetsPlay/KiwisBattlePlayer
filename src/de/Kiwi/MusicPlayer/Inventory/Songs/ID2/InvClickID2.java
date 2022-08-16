package de.Kiwi.MusicPlayer.Inventory.Songs.ID2;

import de.Kiwi.MusicPlayer.Config.ItemsConfigCreate.MusicManager;
import de.Kiwi.MusicPlayer.Config.SettingConfigCreate.SettingsManager;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static de.Kiwi.MusicPlayer.Inventory.BattlePlayerGUI.BattlePlayerINV;

public class InvClickID2 implements Listener {
    static String ID = "ID" + "2";
    public static String prefix = SettingsManager.get("Chat.Messages.Prefix");
    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if (!e.getView().getTitle().contains(ID)) {
            return;
        }
        if (e.getCurrentItem()== null || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.GREEN + "Play")) {
            p.stopAllSounds();
            //p.stopSound(Sound.valueOf(SettingsManager.MusicDisc("Music.Sound."+ID)));
            p.getWorld().playSound(p.getPlayer().getLocation(), Sound.valueOf(SettingsManager.MusicDisc("Music.Sound."+ID)), 10.0F, 1.0F);
            if (SettingsManager.getbo("Chat.Message.Enable")) {
                p.sendMessage(prefix + SettingsManager.MusicDisc("Chat.Message.Playing")+ " " + ChatColor.DARK_AQUA + MusicManager.Text("Music."+ID+".Writer")+ ChatColor.WHITE + " - " + ChatColor.GOLD +  MusicManager.Text("Music." + ID + ".Name"));
            }
            if (SettingsManager.getbo("Actionbar.Message.Enable")){
                String message = ChatColor.GOLD+ "► " + SettingsManager.MusicDisc("Chat.Message.Playing")+ " " + ChatColor.DARK_AQUA + MusicManager.Text("Music."+ID+".Writer") + ChatColor.WHITE + " - " + ChatColor.GOLD +  MusicManager.Text("Music." + ID + ".Name");
                p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
            }
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(" ")) {
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Back")) {
            p.openInventory(BattlePlayerINV());
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Stop")) {
            p.stopAllSounds();
            if (SettingsManager.getbo("Chat.Message.Enable")) {
                p.sendMessage(prefix + "Stop playing");
            }

            if (SettingsManager.getbo("Actionbar.Message.Enable")){
                String Stopmsg = ChatColor.GOLD+ "■ " + "Stop playing";
                p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(Stopmsg));
            }
           // p.stopSound(Sound.valueOf(SettingsManager.MusicDisc("Music.Sound."+ID)));
            e.setCancelled(true);
        }
    }
}
