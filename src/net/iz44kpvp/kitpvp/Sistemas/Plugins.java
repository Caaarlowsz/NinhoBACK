package net.iz44kpvp.kitpvp.Sistemas;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Plugins implements Listener {
	@EventHandler
	private void onCommand(final PlayerCommandPreprocessEvent e) {
		final Player p = e.getPlayer();
		if (e.getMessage().equalsIgnoreCase("/pl") || e.getMessage().equalsIgnoreCase("/plugins")
				|| e.getMessage().equalsIgnoreCase("/bukkit:pl") || e.getMessage().equalsIgnoreCase("/bukkit:plugins")
				|| e.getMessage().equalsIgnoreCase("/ver") || e.getMessage().equalsIgnoreCase("/help")
				|| e.getMessage().equalsIgnoreCase("/?") || e.getMessage().equalsIgnoreCase("/bukkit:ver")
				|| e.getMessage().equalsIgnoreCase("/bukkit:help") || e.getMessage().equalsIgnoreCase("/bukkit:?")) {
			e.setCancelled(true);
			p.sendMessage("�f");
			p.sendMessage("�cPlugin Desenvolvido Por!.");
			p.sendMessage("�c@NinhoBACK :/!");
			p.sendMessage("�f");
		}
	}
}
