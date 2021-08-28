package net.iz44kpvp.kitpvp.Comandos;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import net.iz44kpvp.kitpvp.Sistemas.API;

public class StaffChat implements Listener, CommandExecutor {
	public static ArrayList<String> staff;

	static {
		StaffChat.staff = new ArrayList<String>();
	}

	@EventHandler
	public void onChat(final PlayerChatEvent e) {
		final Player p = e.getPlayer();
		if (this.isStaffChatting(p)) {
			Bukkit.broadcast(ChatColor.GRAY + "�4[STAFF]" + ChatColor.GRAY + "�7 " + p.getDisplayName() + "�4 \u27a1 "
					+ "�7" + e.getMessage().replaceAll("&", "�"), "Ninho.staff");
			e.setCancelled(true);
		}
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel,
			final String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		final Player p = (Player) sender;
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
				} else {
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
			} else {
				p.sendMessage(API.semperm);
			}
		}
		return true;
	}

	public boolean isStaffChatting(final Player player) {
		return StaffChat.staff.contains(player.getName());
	}
}
