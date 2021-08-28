package net.iz44kpvp.kitpvp.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Youtuber implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("AVISO")) {
			p.sendMessage("");
			p.sendMessage("§8\u2770§a§l!§8\u2771 §7Para se tornar §bYOUTUBER§r§7:");
			p.sendMessage("");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Possuir no minimo 1.000 inscritos.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Gravar videos no servidor.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Ter pelo menos 1 videos no servidor.");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("§8\u2770§a§l!§8\u2771 §7Para se tornar §6PRO§r§7:");
			p.sendMessage("");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Possuir no minimo 600 inscritos.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Gravar videos no servidor.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Ter pelo menos 2 videos no servidor.");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("§8\u2770§a§l!§8\u2771 §7Para se tornar §9MVP§r§7:");
			p.sendMessage("");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Possuir no minimo 400 inscritos.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Gravar videos no servidor.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Ter pelo menos 3 videos no servidor.");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("§8\u2770§a§l!§8\u2771 §7Para se tornar §3YOUTUBERPLUS§r§7:");
			p.sendMessage("");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Possuir no minimo 5.000 inscritos.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Gravar videos no servidor.");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7Ter a confian\u00e7a do SrMatt.");
			p.sendMessage("");
			p.sendMessage("§8\u2770§e§l!§8\u2771 §7PARA SOLICITAR AS TAGS, ENTRAR EM CONTATO VIA TWITTER!");
		}
		return false;
	}
}
