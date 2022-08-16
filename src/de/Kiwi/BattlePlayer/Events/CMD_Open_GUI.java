package de.Kiwi.BattlePlayer.Events;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static de.Kiwi.BattlePlayer.Inventory.BattlePlayerGUI.BattlePlayerINV;

public class CMD_Open_GUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender S, Command cmd, String s, String[] strings) {
       Player p = (Player) S;
       p.openInventory(BattlePlayerINV());

        return false;
    }
}
