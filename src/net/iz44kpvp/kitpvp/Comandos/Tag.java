package net.iz44kpvp.kitpvp.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.iz44kpvp.kitpvp.Sistemas.API;
import net.iz44kpvp.kitpvp.Sistemas.TagsAPI;

public class Tag implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(API.semconsole);
			return true;
		}
		final Player p = (Player) sender;
		if (args.length != 0) {
			if (args[0].equalsIgnoreCase("dono")) {
				if (p.hasPermission("tag.dono")) {
					TagsAPI.setarTag(p, "§4§lDONO §4");
					p.setPlayerListName("§4" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fDono.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("dev")) {
				if (p.getName().equalsIgnoreCase("NinhoBACK")) {
					TagsAPI.setarTag(p, "§4§lDEV §4");
					p.setPlayerListName("§4" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fdeveloper.");
					return true;
				}
				p.kickPlayer("§c[!]§7Voc\u00ea N\u00e3o §a§nProgamou §7Este Plugin");
			}
			if (args[0].equalsIgnoreCase("admin")) {
				if (p.hasPermission("tag.admin")) {
					TagsAPI.setarTag(p, "§c§lADMIN §c");
					p.setPlayerListName("§c" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fadmin.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("admin+")) {
				if (p.hasPermission("tag.admin+")) {
					TagsAPI.setarTag(p, "§4§lADMIN+ §4");
					p.setPlayerListName("§4" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fadmin+.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("mod")) {
				if (p.hasPermission("tag.mod")) {
					TagsAPI.setarTag(p, "§5§lMOD §5");
					p.setPlayerListName("§5" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fmod.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("mod+")) {
				if (p.hasPermission("tag.mod+")) {
					TagsAPI.setarTag(p, "§5§lMOD+ §5");
					p.setPlayerListName("§5" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fmod+.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("trial")) {
				if (p.hasPermission("tag.trial")) {
					TagsAPI.setarTag(p, "§d§lTRIAL §d");
					p.setPlayerListName("§d" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §ftrial.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("helper")) {
				if (p.hasPermission("tag.helper")) {
					TagsAPI.setarTag(p, "§d§lHELPER §d");
					p.setPlayerListName("§d" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fhelper.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("builder")) {
				if (p.hasPermission("tag.builder")) {
					TagsAPI.setarTag(p, "§e§lBUILDER §e");
					p.setPlayerListName("§e" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fbuilder.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("youtuber")) {
				if (p.hasPermission("tag.youtuber")) {
					TagsAPI.setarTag(p, "§b§lYT §b");
					p.setPlayerListName("§b" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fyoutuber");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("youtuber+")) {
				if (p.hasPermission("tag.youtuber+")) {
					TagsAPI.setarTag(p, "§b§lYT+ §b");
					p.setPlayerListName("§b" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fyoutuberplus.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("pro")) {
				if (p.hasPermission("tag.pro")) {
					TagsAPI.setarTag(p, "§6§lPRO §6");
					p.setPlayerListName("§6" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fpro.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("vip")) {
				if (p.hasPermission("tag.vip")) {
					TagsAPI.setarTag(p, "§a§lVIP §a");
					p.setPlayerListName("§a" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fvip.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("mvp")) {
				if (p.hasPermission("tag.mvp")) {
					TagsAPI.setarTag(p, "§9§lMVP §9");
					p.setPlayerListName("§9" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fmvp.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("beta")) {
				if (p.hasPermission("tag.beta")) {
					TagsAPI.setarTag(p, "§1§lBETA §1");
					p.setPlayerListName("§1" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fbeta.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			if (args[0].equalsIgnoreCase("normal")) {
				if (p.hasPermission("tag.normal")) {
					TagsAPI.setarTag(p, "§7§lMEMBRO §7");
					p.setPlayerListName("§7" + p.getName());
					p.sendMessage(String.valueOf(String.valueOf(API.preffix))
							+ "§aSua tag foi modificada conforme o pedido para §fmembro.");
					return true;
				}
				p.sendMessage(API.naotemtag);
			}
			return false;
		}
		if (p.hasPermission("tag.dono")) {
			p.sendMessage(
					"§aUse: §f/tag §4DONO, DEV, §4ADMIN+, §cADMIN, §5§oMOD+, §5MOD, §dTRIAL, §d§oHELPER, §bYOUTUBER, §b§oYOUTUBER+, §eBUILDER, §1BETA, §6PRO, §9MVP, §aVIP, §7NORMAL");
			return true;
		}
		if (p.hasPermission("tag.admin")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §cADMIN");
			return true;
		}
		if (p.hasPermission("tag.admin+")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §4ADMIN+");
			return true;
		}
		if (p.hasPermission("tag.mod+")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §5§oMOD+");
			return true;
		}
		if (p.hasPermission("tag.mod")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §5MOD");
			return true;
		}
		if (p.hasPermission("tag.trial")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §dTRIAL");
			return true;
		}
		if (p.hasPermission("tag.helper")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §d§oHELPER");
			return true;
		}
		if (p.hasPermission("tag.youtuber")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §bYOUTUBER");
			return true;
		}
		if (p.hasPermission("tag.youtuber+")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO, §3§oYOUTUBER+");
			return true;
		}
		if (p.hasPermission("tag.pro")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §aVIP, §9MVP, §6PRO");
			return true;
		}
		if (p.hasPermission("tag.mvp")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §aVIP, §9MVP, §6PRO");
			return true;
		}
		if (p.hasPermission("tag.vip")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §aVIP");
			return true;
		}
		if (p.hasPermission("tag.beta")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §1BETA, §aVIP, §9MVP, §6PRO");
			return true;
		}
		if (p.hasPermission("tag.builder")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL, §eBUILDER, §1BETA, §aVIP, §9MVP, §6PRO");
			return true;
		}
		if (p.hasPermission("tag.normal")) {
			p.sendMessage("§aUse: §f/tag §7NORMAL");
			return true;
		}
		p.sendMessage(
				"§aUse: §f/tag §4DONO, DEV, §4ADMIN+, §cADMIN, §5§oMOD+, §5MOD, §dTRIAL, §d§oHELPER, §bYOUTUBER, §b§oYOUTUBER+, §eBUILDER, §1BETA, §6PRO, §9MVP, §aVIP, §7NORMAL");
		return true;
	}
}
