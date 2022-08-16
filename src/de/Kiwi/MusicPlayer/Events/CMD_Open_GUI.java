package de.Kiwi.MusicPlayer.Events;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static de.Kiwi.MusicPlayer.Inventory.BattlePlayerGUI.BattlePlayerINV;

public class CMD_Open_GUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender S, Command cmd, String s, String[] strings) {
       Player p = (Player) S;
       p.openInventory(BattlePlayerINV());

        return false;
    }
}
