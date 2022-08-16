package de.Kiwi.MusicPlayer.Inventory.Songs.ID2;

import de.Kiwi.MusicPlayer.Config.ItemsConfigCreate.MusicManager;
import de.Kiwi.MusicPlayer.Creator.SkullCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class ID2 {
    static String ID = "ID" + "2";

    @EventHandler
    public static Inventory ID2INV() {
    Inventory ID0_temp = Bukkit.createInventory(null, InventoryType.HOPPER, ChatColor.RED + "Mode " + ID);

        ItemStack empty = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta empty_meta = empty.getItemMeta();
        empty_meta.setDisplayName(" ");
        empty.setItemMeta(empty_meta);

        String URL1 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmE4ZjZiMTMxZWY4NDdkOTE2MGU1MTZhNmY0NGJmYTkzMjU1NGQ0MGMxOGE4MTc5NmQ3NjZhNTQ4N2I5ZjcxMCJ9fX0=";
        ItemStack Play = new ItemStack(SkullCreator.itemFromBase64(URL1));
        ItemMeta Play_Meta = Play.getItemMeta();
        Play_Meta.setDisplayName(ChatColor.GREEN + "Play");
        List<String> ID0Lore = new ArrayList<>();
        ID0Lore.add(ChatColor.GOLD + "Name: " + MusicManager.Text("Music."+ID+".Name"));
        ID0Lore.add(ChatColor.GREEN + "Writer: " + MusicManager.Text("Music."+ID+".Writer"));
        ID0Lore.add(ChatColor.GREEN + "Album: " + MusicManager.Text("Music."+ID+".Album"));
        Play_Meta.setLore(ID0Lore);
        Play.setItemMeta(Play_Meta);


        String URL2 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdhNWM2MGEwZWRiNTZkZDUyYmI1NjhhZTA4NzAyYzNmYTRiMzM3MzM2ZWEyZDhiNmQ1OGM3YThmNjA4OGZhMiJ9fX0=";
        ItemStack Stop = new ItemStack(SkullCreator.itemFromBase64(URL2));
        ItemMeta Stop_Meta = Stop.getItemMeta();
        Stop_Meta.setDisplayName(ChatColor.RED + "Stop");
        Stop.setItemMeta(Stop_Meta);

        //Back
        String URL = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ==";
        ItemStack Back = new ItemStack(SkullCreator.itemFromBase64(URL));
        ItemMeta Back_Meta = Back.getItemMeta();
        Back_Meta.setDisplayName(ChatColor.GRAY + "Back");
        Back.setItemMeta(Back_Meta);


        ID0_temp.setItem(0,Back);
        ID0_temp.setItem(1,empty);
        ID0_temp.setItem(2,Play);
        ID0_temp.setItem(3, Stop);
        ID0_temp.setItem(4,empty);


        return ID0_temp;
    }
}
