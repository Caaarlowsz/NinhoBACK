package net.iz44kpvp.kitpvp.Comandos;

import java.util.*;
import org.bukkit.event.player.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.command.*;
import net.iz44kpvp.kitpvp.Sistemas.*;

public class StaffChat implements Listener, CommandExecutor
{
    public static ArrayList<String> staff;
    
    static {
        StaffChat.staff = new ArrayList<String>();
    }
    
    @EventHandler
    public void onChat(final PlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (this.isStaffChatting(p)) {
            Bukkit.broadcast(ChatColor.GRAY + "§4[STAFF]" + ChatColor.GRAY + "§7 " + p.getDisplayName() + "§4 \u27a1 " + "§7" + e.getMessage().replaceAll("&", "§"), "Ninho.staff");
            e.setCancelled(true);
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("sc")) {
            if (p.hasPermission("Ninho.staff")) {
                if (this.isStaffChatting(p)) {
                    StaffChat.staff.remove(p.getName());
                    p.sendMessage(ChatColor.RED + "Voc\u00ea saiu do chat da staff.");
                    Player[] onlinePlayers;
                    for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                        final Player online = onlinePlayers[i];
                        if (this.isStaffChatting(p) && !online.hasPermission("Ninho.staff")) {
                            this.isStaffChatting(online);
                        }
                    }
                }
                else {
                    StaffChat.staff.add(p.getName());
                    p.sendMessage(ChatColor.GREEN + "Voc\u00ea entrou no chat da staff.");
                    Player[] onlinePlayers2;
                    for (int length2 = (onlinePlayers2 = Bukkit.getOnlinePlayers()).length, j = 0; j < length2; ++j) {
                        final Player online = onlinePlayers2[j];
                        if (this.isStaffChatting(p) && !online.hasPermission("Ninho.staff")) {
                            this.isStaffChatting(online);
                        }
                    }
                }
            }
            else {
                p.sendMessage(API.semperm);
            }
        }
        return true;
    }
    
    public boolean isStaffChatting(final Player player) {
        return StaffChat.staff.contains(player.getName());
    }
}
