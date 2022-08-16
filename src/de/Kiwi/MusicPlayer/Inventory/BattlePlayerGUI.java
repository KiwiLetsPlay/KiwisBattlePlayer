package de.Kiwi.MusicPlayer.Inventory;

import de.Kiwi.MusicPlayer.Config.ItemsConfigCreate.MusicManager;
import de.Kiwi.MusicPlayer.Creator.SkullCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class BattlePlayerGUI {
    static String GREEN = String.valueOf(ChatColor.GREEN);
    static String Lore1 = GREEN + "Writer: ";
    static String Lore2 = GREEN + "Album: ";
    public static Inventory BattlePlayerINV() {
        Inventory PlayerINV = Bukkit.createInventory(null, 9*3, ChatColor.GOLD + "§lBattlePlayer");


        //Space
        ItemStack Space = new ItemStack(Material.BLACK_STAINED_GLASS_PANE,1);
        ItemMeta Space_Meta = Space.getItemMeta();
        Space_Meta.setDisplayName(" ");
        Space.setItemMeta(Space_Meta);

        //TexturePack
        String URL1 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Q0ODdhNzlhMDExNzMzOGZlYWRkYmQyZjJhYzRlODk2NjQzZjliZDk2MTJhZDg2NWE4NGQ0MWVkOGY5ZjAifX19";
        ItemStack Texture = new ItemStack(SkullCreator.itemFromBase64(URL1));
        ItemMeta Texture_Meta = Texture.getItemMeta();
        Texture_Meta.setDisplayName(ChatColor.GOLD + "Get The Resource Pack");
        Texture.setItemMeta(Texture_Meta);


        //Close
        String URL = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ==";
        ItemStack Close = new ItemStack(SkullCreator.itemFromBase64(URL));
        ItemMeta Close_Meta = Close.getItemMeta();
        Close_Meta.setDisplayName(ChatColor.RED + "Close");
        Close.setItemMeta(Close_Meta);

        //Stop
        String URL2 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdhNWM2MGEwZWRiNTZkZDUyYmI1NjhhZTA4NzAyYzNmYTRiMzM3MzM2ZWEyZDhiNmQ1OGM3YThmNjA4OGZhMiJ9fX0=";
        ItemStack Stop = new ItemStack(SkullCreator.itemFromBase64(URL2));
        ItemMeta Stop_Meta = Stop.getItemMeta();
        Stop_Meta.setDisplayName(ChatColor.RED + "Stop");
        Stop.setItemMeta(Stop_Meta);





        //Song=1
        String URLID1 = MusicManager.Text("Music.ID1.IconSkull");
        ItemStack ID1 = new ItemStack(SkullCreator.itemFromBase64(URLID1));
        ItemMeta ID1_Meta = ID1.getItemMeta();
        ID1_Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ID1_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID1.Name"));
        List<String> ID1Lore = new ArrayList<String>();
        ID1Lore.add(Lore1 + MusicManager.Text("Music.ID1.Writer"));
        ID1Lore.add(Lore2 + MusicManager.Text("Music.ID1.Album"));
        ID1Lore.add(ChatColor.WHITE + "§oID 1");
        ID1_Meta.setLore(ID1Lore);
        ID1Lore.clear();
        ID1.setItemMeta(ID1_Meta);
        //Song=2
        String URLID2 = MusicManager.Text("Music.ID2.IconSkull");
        ItemStack ID2 = new ItemStack(SkullCreator.itemFromBase64(URLID2));
        ItemMeta ID2_Meta = ID2.getItemMeta();
        ID2_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID2.Name"));
        List<String> ID2Lore = new ArrayList<String>();
        ID2Lore.add( Lore1 + MusicManager.Text("Music.ID2.Writer"));
        ID2Lore.add( Lore2 + MusicManager.Text("Music.ID2.Album"));
        ID2Lore.add(ChatColor.WHITE + "§oID 2");
        ID2_Meta.setLore(ID2Lore);
        ID2Lore.clear();
        ID2.setItemMeta(ID2_Meta);
        //Song=3
        String URLID3 = MusicManager.Text("Music.ID3.IconSkull");
        ItemStack ID3 = new ItemStack(SkullCreator.itemFromBase64(URLID3));
        ItemMeta ID3_Meta = ID3.getItemMeta();
        ID3_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID3.Name"));
        List<String> ID3Lore = new ArrayList<String>();
        ID3Lore.add( Lore1 + MusicManager.Text("Music.ID3.Writer"));
        ID3Lore.add( Lore2 + MusicManager.Text("Music.ID3.Album"));
        ID3Lore.add(ChatColor.WHITE + "§oID 3");
        ID3_Meta.setLore(ID3Lore);
        ID3Lore.clear();
        ID3.setItemMeta(ID3_Meta);
        //Song=4
        String URLID4 = MusicManager.Text("Music.ID4.IconSkull");
        ItemStack ID4 = new ItemStack(SkullCreator.itemFromBase64(URLID4));
        ItemMeta ID4_Meta = ID4.getItemMeta();
        ID4_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID4.Name"));
        List<String> ID4Lore = new ArrayList<String>();
        ID4Lore.add( Lore1 + MusicManager.Text("Music.ID4.Writer"));
        ID4Lore.add( Lore2 + MusicManager.Text("Music.ID4.Album"));
        ID4Lore.add(ChatColor.WHITE + "§oID 4");
        ID4_Meta.setLore(ID4Lore);
        ID4Lore.clear();
        ID4.setItemMeta(ID4_Meta);
        //Song=5
        String URLID5 = MusicManager.Text("Music.ID5.IconSkull");
        ItemStack ID5 = new ItemStack(SkullCreator.itemFromBase64(URLID5));
        ItemMeta ID5_Meta = ID5.getItemMeta();
        ID5_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID5.Name"));
        List<String> ID5Lore = new ArrayList<String>();
        ID5Lore.add( Lore1 + MusicManager.Text("Music.ID5.Writer"));
        ID5Lore.add( Lore2 + MusicManager.Text("Music.ID5.Album"));
        ID5Lore.add(ChatColor.WHITE + "§oID 5");
        ID5_Meta.setLore(ID5Lore);
        ID5Lore.clear();
        ID5.setItemMeta(ID5_Meta);
        //Song=6
        String URLID6 = MusicManager.Text("Music.ID6.IconSkull");
        ItemStack ID6 = new ItemStack(SkullCreator.itemFromBase64(URLID6));
        ItemMeta ID6_Meta = ID6.getItemMeta();
        ID6_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID6.Name"));
        List<String> ID6Lore = new ArrayList<String>();
        ID6Lore.add( Lore1 + MusicManager.Text("Music.ID6.Writer"));
        ID6Lore.add( Lore2 + MusicManager.Text("Music.ID6.Album"));
        ID6Lore.add(ChatColor.WHITE + "§oID 6");
        ID6_Meta.setLore(ID6Lore);
        ID6Lore.clear();
        ID6.setItemMeta(ID6_Meta);
        //Song=7
        String URLID7 = MusicManager.Text("Music.ID7.IconSkull");
        ItemStack ID7 = new ItemStack(SkullCreator.itemFromBase64(URLID7));
        ItemMeta ID7_Meta = ID7.getItemMeta();
        ID7_Meta.setDisplayName(ChatColor.GOLD + MusicManager.Text("Music.ID7.Name"));
        List<String> ID7Lore = new ArrayList<String>();
        ID7Lore.add( Lore1 + MusicManager.Text("Music.ID7.Writer"));
        ID7Lore.add( Lore2 + MusicManager.Text("Music.ID7.Album"));
        ID7Lore.add(ChatColor.WHITE + "§oID 7");
        ID7_Meta.setLore(ID7Lore);
        ID7Lore.clear();
        ID7.setItemMeta(ID7_Meta);



        for (int i = 0; i < 27; i++) {
            switch (i) {
                case 1:
                    if (MusicManager.Enable("Music.ID1.Enable")) {
                        PlayerINV.setItem(i, ID1);
                    }else if (!MusicManager.Enable("Music.ID1.Enable")) {
                        PlayerINV.setItem(i,Space);
                    }
                    break;
                case 2:
                    PlayerINV.setItem(i, ID2);
                    break;
                case 3:
                    PlayerINV.setItem(i, ID3);
                    break;
                case 4:
                    PlayerINV.setItem(i, ID4);
                    break;
                case 5:
                    PlayerINV.setItem(i, ID5);
                    break;
                case 6:
                    PlayerINV.setItem(i, ID6);
                    break;
                case 7:
                    PlayerINV.setItem(i, ID7);
                    break;
                case 18:
                    PlayerINV.setItem(i,Close);
                    break;
                case 22:
                    PlayerINV.setItem(i, Stop);
                    break;
                case 26:
                    PlayerINV.setItem(i, Texture);
                    break;

                default:
                    PlayerINV.setItem(i, Space);
                    break;
            }

        }

        return PlayerINV;
    }
}
