package de.Kiwi.MusicPlayer.Events;

import de.Kiwi.MusicPlayer.Config.ItemsConfigCreate.MusicManager;
import de.Kiwi.MusicPlayer.Config.SettingConfigCreate.SettingsManager;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static de.Kiwi.MusicPlayer.Inventory.Songs.ID1.ID1.ID1INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID2.ID2.ID2INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID3.ID3.ID3INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID4.ID4.ID4INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID5.ID5.ID5INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID6.ID6.ID6INV;
import static de.Kiwi.MusicPlayer.Inventory.Songs.ID7.ID7.ID7INV;


public class InvClick implements Listener {
    public static String prefix = SettingsManager.get("Chat.Messages.Prefix");
    @EventHandler
    public static void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if (!e.getView().getTitle().contains("BattlePlayer")) {
            return;
        }
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains(" ")){
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Close")) {
            p.closeInventory();
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.GOLD + "Get The Resource Pack")) {
            if (SettingsManager.getbo("Custom.Texture.Enable")) {
               p.setResourcePack(SettingsManager.MusicDisc("Custom.Texture.Source"));
                if (SettingsManager.getbo("Chat.Message.Enable")) {
                    p.sendMessage("Resourcepack has been downloaded");
                }
            }else {
                if (SettingsManager.getbo("Chat.Message.Enable")) {
                    p.sendMessage(prefix + "This was deactivated in the config by an admin");
                }
            }
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID1.Name"))) {
            p.openInventory(ID1INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID2.Name"))) {
            p.openInventory(ID2INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID3.Name"))) {
            p.openInventory(ID3INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID4.Name"))) {
            p.openInventory(ID4INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID5.Name"))) {
            p.openInventory(ID5INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID6.Name"))) {
            p.openInventory(ID6INV());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + MusicManager.Text("Music.ID7.Name"))) {
            p.openInventory(ID7INV());
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
