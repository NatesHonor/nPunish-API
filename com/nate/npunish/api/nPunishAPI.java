package com.nate.npunish.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class nPunishAPI {
    public boolean banPlayer(String playerName, String reason, String duration) {
        Player target = Bukkit.getPlayerExact(playerName);
        if (target == null) {
            return false;
        }

        String banReason = ChatColor.translateAlternateColorCodes('&', reason);
        String banDuration = ChatColor.translateAlternateColorCodes('&', duration);
        String[] banCommand = {"ban", target.getName(), banReason, banDuration};
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), String.join(" ", banCommand));

        return true;
    }

    public boolean unbanPlayer(String playerName) {
        String[] unbanCommand = {"unban", playerName};
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), String.join(" ", unbanCommand));
        return true;
    }
}
