package net.iz44kpvp.kitpvp.Comandos;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.iz44kpvp.kitpvp.Main;
import net.iz44kpvp.kitpvp.Sistemas.API;

public class SetArena implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(API.semconsole);
			return true;
		}
		final Player p = (Player) sender;
		if (label.equalsIgnoreCase("setarena")) {
			if (p.hasPermission("Ninho.staff")) {
				if (args.length == 0) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "Sintaxe correta: /setarena (1|5)");
					return true;
				}
				if (args[0].equalsIgnoreCase("1")) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�aVoc\u00ea setou a ARENA 1");
					Main.getInstance().arenas.set("arena1.x", (Object) p.getLocation().getX());
					Main.getInstance().arenas.set("arena1.y", (Object) p.getLocation().getY());
					Main.getInstance().arenas.set("arena1.z", (Object) p.getLocation().getZ());
					Main.getInstance().arenas.set("arena1.pitch", (Object) p.getLocation().getPitch());
					Main.getInstance().arenas.set("arena1.yaw", (Object) p.getLocation().getYaw());
					Main.getInstance().arenas.set("arena1.world", (Object) p.getLocation().getWorld().getName());
					Main.getInstance().save();
				}
				if (args[0].equalsIgnoreCase("2")) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�aVoc\u00ea setou a ARENA 2");
					Main.getInstance().arenas.set("arena2.x", (Object) p.getLocation().getX());
					Main.getInstance().arenas.set("arena2.y", (Object) p.getLocation().getY());
					Main.getInstance().arenas.set("arena2.z", (Object) p.getLocation().getZ());
					Main.getInstance().arenas.set("arena2.pitch", (Object) p.getLocation().getPitch());
					Main.getInstance().arenas.set("arena2.yaw", (Object) p.getLocation().getYaw());
					Main.getInstance().arenas.set("arena2.world", (Object) p.getLocation().getWorld().getName());
					Main.getInstance().save();
				}
				if (args[0].equalsIgnoreCase("3")) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�aVoc\u00ea setou a ARENA 3");
					Main.getInstance().arenas.set("arena3.x", (Object) p.getLocation().getX());
					Main.getInstance().arenas.set("arena3.y", (Object) p.getLocation().getY());
					Main.getInstance().arenas.set("arena3.z", (Object) p.getLocation().getZ());
					Main.getInstance().arenas.set("arena3.pitch", (Object) p.getLocation().getPitch());
					Main.getInstance().arenas.set("arena3.yaw", (Object) p.getLocation().getYaw());
					Main.getInstance().arenas.set("arena3.world", (Object) p.getLocation().getWorld().getName());
					Main.getInstance().save();
				}
				if (args[0].equalsIgnoreCase("4")) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�aVoc\u00ea setou a ARENA 4");
					Main.getInstance().arenas.set("arena4.x", (Object) p.getLocation().getX());
					Main.getInstance().arenas.set("arena4.y", (Object) p.getLocation().getY());
					Main.getInstance().arenas.set("arena4.z", (Object) p.getLocation().getZ());
					Main.getInstance().arenas.set("arena4.pitch", (Object) p.getLocation().getPitch());
					Main.getInstance().arenas.set("arena4.yaw", (Object) p.getLocation().getYaw());
					Main.getInstance().arenas.set("arena4.world", (Object) p.getLocation().getWorld().getName());
					Main.getInstance().save();
				}
				if (args[0].equalsIgnoreCase("5")) {
					p.sendMessage(String.valueOf(String.valueOf(API.preffix)) + "�aVoc\u00ea setou a ARENA 5");
					Main.getInstance().arenas.set("arena5.x", (Object) p.getLocation().getX());
					Main.getInstance().arenas.set("arena5.y", (Object) p.getLocation().getY());
					Main.getInstance().arenas.set("arena5.z", (Object) p.getLocation().getZ());
					Main.getInstance().arenas.set("arena5.pitch", (Object) p.getLocation().getPitch());
					Main.getInstance().arenas.set("arena5.yaw", (Object) p.getLocation().getYaw());
					Main.getInstance().arenas.set("arena5.world", (Object) p.getLocation().getWorld().getName());
					Main.getInstance().save();
				}
			} else {
				p.sendMessage(API.semperm);
			}
		}
		return false;
	}

	public static void TeleportArenaRandom(final Player p) {
		final Random dice = new Random();
		final int number = dice.nextInt(4);
		switch (number) {
		case 0: {
			final World w = Bukkit.getServer().getWorld(Main.getInstance().arenas.getString("arena1.world"));
			final double x = Main.getInstance().arenas.getDouble("arena1.x");
			final double y = Main.getInstance().arenas.getDouble("arena1.y");
			final double z = Main.getInstance().arenas.getDouble("arena1.z");
			final Location lobby = new Location(w, x, y, z);
			lobby.setPitch((float) Main.getInstance().arenas.getDouble("arena1.pitch"));
			lobby.setYaw((float) Main.getInstance().arenas.getDouble("arena1.yaw"));
			p.getWorld().playEffect(lobby, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
			p.teleport(lobby);
			break;
		}
		case 1: {
			final World w2 = Bukkit.getServer().getWorld(Main.getInstance().arenas.getString("arena2.world"));
			final double x2 = Main.getInstance().arenas.getDouble("arena2.x");
			final double y2 = Main.getInstance().arenas.getDouble("arena2.y");
			final double z2 = Main.getInstance().arenas.getDouble("arena2.z");
			final Location lobby2 = new Location(w2, x2, y2, z2);
			lobby2.setPitch((float) Main.getInstance().arenas.getDouble("arena2.pitch"));
			lobby2.setYaw((float) Main.getInstance().arenas.getDouble("arena2.yaw"));
			p.getWorld().playEffect(lobby2, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
			p.teleport(lobby2);
			break;
		}
		case 2: {
			final World w3 = Bukkit.getServer().getWorld(Main.getInstance().arenas.getString("arena3.world"));
			final double x3 = Main.getInstance().arenas.getDouble("arena3.x");
			final double y3 = Main.getInstance().arenas.getDouble("arena3.y");
			final double z3 = Main.getInstance().arenas.getDouble("arena3.z");
			final Location lobby3 = new Location(w3, x3, y3, z3);
			lobby3.setPitch((float) Main.getInstance().arenas.getDouble("arena3.pitch"));
			lobby3.setYaw((float) Main.getInstance().arenas.getDouble("arena3.yaw"));
			p.getWorld().playEffect(lobby3, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
			p.teleport(lobby3);
			break;
		}
		case 3: {
			final World w4 = Bukkit.getServer().getWorld(Main.getInstance().arenas.getString("arena4.world"));
			final double x4 = Main.getInstance().arenas.getDouble("arena4.x");
			final double y4 = Main.getInstance().arenas.getDouble("arena4.y");
			final double z4 = Main.getInstance().arenas.getDouble("arena4.z");
			final Location lobby4 = new Location(w4, x4, y4, z4);
			lobby4.setPitch((float) Main.getInstance().arenas.getDouble("arena4.pitch"));
			lobby4.setYaw((float) Main.getInstance().arenas.getDouble("arena4.yaw"));
			p.getWorld().playEffect(lobby4, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
			p.teleport(lobby4);
			break;
		}
		case 4: {
			final World w5 = Bukkit.getServer().getWorld(Main.getInstance().arenas.getString("arena5.world"));
			final double x5 = Main.getInstance().arenas.getDouble("arena5.x");
			final double y5 = Main.getInstance().arenas.getDouble("arena5.y");
			final double z5 = Main.getInstance().arenas.getDouble("arena5.z");
			final Location lobby5 = new Location(w5, x5, y5, z5);
			lobby5.setPitch((float) Main.getInstance().arenas.getDouble("arena5.pitch"));
			lobby5.setYaw((float) Main.getInstance().arenas.getDouble("arena5.yaw"));
			p.getWorld().playEffect(lobby5, Effect.ENDER_SIGNAL, 5);
			p.getPlayer().playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
			p.teleport(lobby5);
			break;
		}
		}
	}
}
