package net.iz44kpvp.kitpvp.Comandos;

import java.util.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import net.iz44kpvp.kitpvp.Sistemas.*;
import org.bukkit.*;

public class Report implements CommandExecutor
{
    public String[] aliases;
    public String description;
    public static ArrayList<String> reportou;
    
    static {
        Report.reportou = new ArrayList<String>();
    }
    
    public Report() {
        this.aliases = new String[] { "report" };
        this.description = "Reportar";
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        final Player p = (Player)sender;
        if (args.length < 2) {
            p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "§cSintaxe correta: /report (nome) (motivo)");
        }
        else if (args.length >= 2) {
            final Player t = Bukkit.getPlayer(args[0]);
            if (t == null) {
                p.sendMessage(API.jogadoroff);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                for (int i = 1; i < args.length; ++i) {
                    sb.append(args[i]).append(" ");
                }
                final String motivo = sb.toString().trim();
                Report.reportou.contains(sender.getName());
                sender.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "§bVoc\u00ea reportou: §5" + t.getDisplayName());
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getServer().getOnlinePlayers()).length, j = 0; j < length; ++j) {
                    final Player todos = onlinePlayers[j];
                    if (todos.hasPermission("Ninho.report")) {
                        todos.sendMessage("§7-----------§e§nReport§7-----------");
                        todos.sendMessage("§7player: §c§n" + p.getDisplayName());
                        todos.sendMessage("§7Suposto Hacker: §a§n" + t.getDisplayName());
                        todos.sendMessage("§7Motivo: §c§n" + motivo);
                        todos.sendMessage("§7-----------§e§nReport§7-----------");
                    }
                }
            }
        }
        return true;
    }
}
