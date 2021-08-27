package net.iz44kpvp.kitpvp.Comandos;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import net.iz44kpvp.kitpvp.Sistemas.*;
import org.bukkit.*;
import ru.tehkode.permissions.bukkit.*;

public class DarKit implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("darkit")) {
            if (p.hasPermission("Ninho.darkit")) {
                if (args.length == 0) {
                    p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�7Sintaxe correta: /darkit <player> <kit>");
                    return true;
                }
                if (args.length == 1) {
                    p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�7Sintaxe correta: /darkit <player> <kit>");
                    return true;
                }
                final Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage(API.jogadoroff);
                    return true;
                }
                final String m = args[1];
                if (m.length() >= 16) {
                    p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�7Esse kit n\u00e3o existe");
                    return true;
                }
                if (m.length() <= 1) {
                    p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�7Esse kit n\u00e3o existe");
                    return true;
                }
                PermissionsEx.getUser(t.getName()).addPermission("kit." + args[1]);
                p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�7Voc\u00ea deu o kit: �5" + m + " �7para: �5" + t.getName());
            }
            else {
                p.sendMessage(API.semperm);
            }
        }
        return false;
    }
}
