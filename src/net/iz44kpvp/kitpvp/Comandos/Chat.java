package net.iz44kpvp.kitpvp.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;

import net.iz44kpvp.kitpvp.Sistemas.API;

public class Chat implements Listener, CommandExecutor {
	public static boolean chat1;

	static {
		Chat.chat1 = true;
	}

	@EventHandler
	public void onPlayerChat(final AsyncPlayerChatEvent e) {
		if (!e.getPlayer().hasPermission("Ninho.falarchat") && !Chat.chat1) {
			e.setCancelled(true);
			e.getPlayer().sendMessage("�cO chat est\u00e1 desativado.");
		}
	}

	@EventHandler
	public void onPlayerChat1(final PlayerChatEvent e) {
		if (!e.getPlayer().hasPermission("Ninho.falarchat") && !Chat.chat1) {
			e.setCancelled(true);
		}
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel,
			final String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (sender.hasPermission("Ninho.staff")) {
			if (args.length > 0) {
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("off")) {
						Chat.chat1 = false;
						Bukkit.broadcastMessage(" ");
						Bukkit.broadcastMessage(
								"�c�lAVISO �7� �aO chat foi �cfechado�7, aguardem a libera\u00e7\u00e3o.");
						Bukkit.broadcastMessage("�c�lAVISO �7� �aSomente jogadores do grupo �3BETA�a podem falar.");
						Bukkit.broadcastMessage(" ");
					} else if (args[0].equalsIgnoreCase("on")) {
						Chat.chat1 = true;
						Bukkit.broadcastMessage(" ");
						Bukkit.broadcastMessage("�c�lAVISO �7� �aO chat foi �aaberto�a.");
						Bukkit.broadcastMessage("�c�lAVISO �7� �aTodos os jogadores tem liberdade de falar!.");
						Bukkit.broadcastMessage(" ");
					}
				} else {
					sender.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�cUse: /chat (on/off");
				}
			} else {
				sender.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�cUse: /chat (on/off");
			}
		}
		return true;
	}
}
