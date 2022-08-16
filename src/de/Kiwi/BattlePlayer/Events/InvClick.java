package de.Kiwi.BattlePlayer.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class InvClick implements Listener {
    @EventHandler
    public static void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(" ")){
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Get The Resource Pack")) {
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Close")) {
            e.setCancelled(true);
        }
    }
}
