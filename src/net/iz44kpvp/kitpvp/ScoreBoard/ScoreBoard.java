package net.iz44kpvp.kitpvp.ScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;

import net.iz44kpvp.kitpvp.Sistemas.API;
import net.iz44kpvp.kitpvp.Sistemas.KillsDeathsRankXp;

public class ScoreBoard {
	public static void FlameScore(final Player p) {
		final String jogadoronline = String.valueOf(String.valueOf(Bukkit.getServer().getOnlinePlayers().length))
				+ "§7/§7" + Bukkit.getServer().getMaxPlayers();
		final SimpleScoreboard ftw = new SimpleScoreboard(API.NomeServer);
		ftw.addLinha("§3 ", 10);
		ftw.addLinha("§b» §fWins: §7" + KillsDeathsRankXp.getKills(p), 9);
		ftw.addLinha("§b» §fLoses: §a" + KillsDeathsRankXp.getDeaths(p), 8);
		ftw.addLinha("§b» §fCoins: §7" + KillsDeathsRankXp.getXp(p), 7);
		ftw.addLinha("§e ", 6);
		ftw.addLinha("§b» §aSeu Kit Atualmente: §7" + API.getKit(p), 5);
		ftw.addLinha("§b» §fRank: §7" + KillsDeathsRankXp.getRank(p), 4);
		ftw.addLinha("§b» §fCaixas: §a" + KillsDeathsRankXp.getCaixa(p), 3);
		ftw.addLinha("§7 ", 2);
		ftw.addLinha("§b» §fJogadores: §7" + jogadoronline, 1);
		ftw.addLinha("§f ", 0);
		ftw.setScoreboard(p);
		final Objective o = ftw.getScoreboard().registerNewObjective("health", "health");
		o.setDisplayName(ChatColor.GREEN + "\u2764");
		o.setDisplaySlot(DisplaySlot.BELOW_NAME);
	}
}
