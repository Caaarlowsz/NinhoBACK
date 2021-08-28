package net.iz44kpvp.kitpvp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;

import net.iz44kpvp.kitpvp.Comandos.Admin;
import net.iz44kpvp.kitpvp.Comandos.Aplicar;
import net.iz44kpvp.kitpvp.Comandos.Aviso;
import net.iz44kpvp.kitpvp.Comandos.Build;
import net.iz44kpvp.kitpvp.Comandos.Caixa;
import net.iz44kpvp.kitpvp.Comandos.Chat;
import net.iz44kpvp.kitpvp.Comandos.ClearChat;
import net.iz44kpvp.kitpvp.Comandos.ClickTest;
import net.iz44kpvp.kitpvp.Comandos.Congelar;
import net.iz44kpvp.kitpvp.Comandos.DarKit;
import net.iz44kpvp.kitpvp.Comandos.Fake;
import net.iz44kpvp.kitpvp.Comandos.Fly;
import net.iz44kpvp.kitpvp.Comandos.Gamemode;
import net.iz44kpvp.kitpvp.Comandos.Head;
import net.iz44kpvp.kitpvp.Comandos.Kills;
import net.iz44kpvp.kitpvp.Comandos.Kit;
import net.iz44kpvp.kitpvp.Comandos.Rank;
import net.iz44kpvp.kitpvp.Comandos.Report;
import net.iz44kpvp.kitpvp.Comandos.ResetKit;
import net.iz44kpvp.kitpvp.Comandos.Score;
import net.iz44kpvp.kitpvp.Comandos.SetArena;
import net.iz44kpvp.kitpvp.Comandos.Spawn;
import net.iz44kpvp.kitpvp.Comandos.StaffChat;
import net.iz44kpvp.kitpvp.Comandos.Status;
import net.iz44kpvp.kitpvp.Comandos.Tag;
import net.iz44kpvp.kitpvp.Comandos.Tell;
import net.iz44kpvp.kitpvp.Comandos.TogglePvP;
import net.iz44kpvp.kitpvp.Comandos.Tp;
import net.iz44kpvp.kitpvp.Comandos.UnCage;
import net.iz44kpvp.kitpvp.Comandos.Ver;
import net.iz44kpvp.kitpvp.Comandos.Xp;
import net.iz44kpvp.kitpvp.Comandos.Youtuber;
import net.iz44kpvp.kitpvp.Eventos.BarKit;
import net.iz44kpvp.kitpvp.Eventos.Bussola;
import net.iz44kpvp.kitpvp.Eventos.DropEventos;
import net.iz44kpvp.kitpvp.Eventos.MorteEventos;
import net.iz44kpvp.kitpvp.Eventos.Naturais;
import net.iz44kpvp.kitpvp.Eventos.Nerfs;
import net.iz44kpvp.kitpvp.Eventos.PlayerEventos;
import net.iz44kpvp.kitpvp.Guis.EventosGuis;
import net.iz44kpvp.kitpvp.Guis.GuiCaixa;
import net.iz44kpvp.kitpvp.Guis.GuiKits;
import net.iz44kpvp.kitpvp.Guis.GuiKits2;
import net.iz44kpvp.kitpvp.Guis.GuiLoja;
import net.iz44kpvp.kitpvp.Guis.GuiRank;
import net.iz44kpvp.kitpvp.Guis.GuiWarps;
import net.iz44kpvp.kitpvp.Kits.Anchor;
import net.iz44kpvp.kitpvp.Kits.Avatar;
import net.iz44kpvp.kitpvp.Kits.Bombeiro;
import net.iz44kpvp.kitpvp.Kits.Bruxa;
import net.iz44kpvp.kitpvp.Kits.C4;
import net.iz44kpvp.kitpvp.Kits.Confus�o;
import net.iz44kpvp.kitpvp.Kits.Deshzin;
import net.iz44kpvp.kitpvp.Kits.FisherMan;
import net.iz44kpvp.kitpvp.Kits.Flash;
import net.iz44kpvp.kitpvp.Kits.FlashBack;
import net.iz44kpvp.kitpvp.Kits.ForceField;
import net.iz44kpvp.kitpvp.Kits.Gaara;
import net.iz44kpvp.kitpvp.Kits.Gladiator;
import net.iz44kpvp.kitpvp.Kits.Goku;
import net.iz44kpvp.kitpvp.Kits.Grappler;
import net.iz44kpvp.kitpvp.Kits.Gun;
import net.iz44kpvp.kitpvp.Kits.Hack;
import net.iz44kpvp.kitpvp.Kits.HotPotato;
import net.iz44kpvp.kitpvp.Kits.Infernor;
import net.iz44kpvp.kitpvp.Kits.IronMan;
import net.iz44kpvp.kitpvp.Kits.JellyFish;
import net.iz44kpvp.kitpvp.Kits.Jumper;
import net.iz44kpvp.kitpvp.Kits.Magma;
import net.iz44kpvp.kitpvp.Kits.Monk;
import net.iz44kpvp.kitpvp.Kits.Phantom;
import net.iz44kpvp.kitpvp.Kits.Poseidon;
import net.iz44kpvp.kitpvp.Kits.Rain;
import net.iz44kpvp.kitpvp.Kits.Rusher;
import net.iz44kpvp.kitpvp.Kits.Shooter;
import net.iz44kpvp.kitpvp.Kits.Stomper;
import net.iz44kpvp.kitpvp.Kits.Subzero;
import net.iz44kpvp.kitpvp.Kits.Switcher;
import net.iz44kpvp.kitpvp.Kits.Teleporter;
import net.iz44kpvp.kitpvp.Kits.Terrorista;
import net.iz44kpvp.kitpvp.Kits.Thor;
import net.iz44kpvp.kitpvp.Kits.TimeLord;
import net.iz44kpvp.kitpvp.Kits.Trader;
import net.iz44kpvp.kitpvp.Kits.Turtle;
import net.iz44kpvp.kitpvp.Kits.Vacuum;
import net.iz44kpvp.kitpvp.Kits.Viking;
import net.iz44kpvp.kitpvp.Kits2.Ajnin;
import net.iz44kpvp.kitpvp.Kits2.DeshIce_DeshFire;
import net.iz44kpvp.kitpvp.Kits2.Hercules;
import net.iz44kpvp.kitpvp.Kits2.Hulk;
import net.iz44kpvp.kitpvp.Kits2.Ninja;
import net.iz44kpvp.kitpvp.Kits2.NoFall;
import net.iz44kpvp.kitpvp.Kits2.Pyro;
import net.iz44kpvp.kitpvp.Kits2.Resouper;
import net.iz44kpvp.kitpvp.Kits2.Viper_Snail;
import net.iz44kpvp.kitpvp.ScoreBoard.ScoreBoard;
import net.iz44kpvp.kitpvp.Sistemas.API;
import net.iz44kpvp.kitpvp.Sistemas.BlocosJump;
import net.iz44kpvp.kitpvp.Sistemas.PlacaDeRecraft;
import net.iz44kpvp.kitpvp.Sistemas.PlacaDeSopa;
import net.iz44kpvp.kitpvp.Sistemas.Plugins;
import net.iz44kpvp.kitpvp.Warps.SetWarp;
import net.iz44kpvp.kitpvp.Warps.irWarp;

public class Main extends JavaPlugin {
	public static Plugin plugin;
	public static Main instance;
	public static Integer score;
	public File statusfile;
	public YamlConfiguration status;
	public File warpsfile;
	public YamlConfiguration warps;
	public File arenasfile;
	public YamlConfiguration arenas;

	static {
		Main.score = null;
	}

	public void onLoad() {
		Player[] onlinePlayers;
		for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
			final Player todos = onlinePlayers[i];
			final ArrayList<String> msg = new ArrayList<String>();
			msg.add("�eServidor �areiniciado para melhorar sua jogabilidade");
			todos.kickPlayer(String.valueOf(msg));
		}
	}

	public void onEnable() {
		Main.plugin = (Plugin) this;
		Main.instance = this;
		final File status = new File(this.getDataFolder(), "status.yml");
		if (!status.exists()) {
			this.saveResource("status.yml", false);
		}
		this.statusfile = new File(this.getDataFolder(), "status.yml");
		this.status = YamlConfiguration.loadConfiguration(this.statusfile);
		final File warps = new File(this.getDataFolder(), "warps.yml");
		if (!warps.exists()) {
			this.saveResource("warps.yml", false);
		}
		this.warpsfile = new File(this.getDataFolder(), "warps.yml");
		this.warps = YamlConfiguration.loadConfiguration(this.warpsfile);
		final File arenas = new File(this.getDataFolder(), "arenas.yml");
		if (!arenas.exists()) {
			this.saveResource("arenas.yml", false);
		}
		this.arenasfile = new File(this.getDataFolder(), "arenas.yml");
		this.arenas = YamlConfiguration.loadConfiguration(this.arenasfile);
		this.save();
		this.Eventos();
		this.Comandos();
		this.Kits();
		this.Guis();
		this.saveDefaultConfig();
		API.novaReceita();
		Bukkit.getConsoleSender().sendMessage("�aPLUGIN ATIVADO");
		Main.score = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin) getInstance(),
				(Runnable) new Runnable() {
					@Override
					public void run() {
						Player[] arrayOfPlayer;
						for (int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length, i = 0; i < j; ++i) {
							final Player p = arrayOfPlayer[i];
							if (Score.ntemscore.contains(p.getName())) {
								ScoreBoard.FlameScore(p);
							}
							if (Score.temscore.contains(p.getName())) {
								p.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
							}
						}
					}
				}, 0L, 10L);
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("�cPLUGIN DESATIVADO");
	}

	public void Eventos() {
		final PluginManager evento = Bukkit.getPluginManager();
		evento.registerEvents((Listener) new MorteEventos(), (Plugin) this);
		evento.registerEvents((Listener) new Naturais(), (Plugin) this);
		evento.registerEvents((Listener) new Nerfs(), (Plugin) this);
		evento.registerEvents((Listener) new PlayerEventos(), (Plugin) this);
		evento.registerEvents((Listener) new DropEventos(), (Plugin) this);
		evento.registerEvents((Listener) new Build(), (Plugin) this);
		evento.registerEvents((Listener) new Admin(), (Plugin) this);
		evento.registerEvents((Listener) new Congelar(), (Plugin) this);
		evento.registerEvents((Listener) new ClickTest(), (Plugin) this);
		evento.registerEvents((Listener) new Fake(), (Plugin) this);
		evento.registerEvents((Listener) new BarKit(), (Plugin) this);
		evento.registerEvents((Listener) new GuiLoja(), (Plugin) this);
		evento.registerEvents((Listener) new BlocosJump(), (Plugin) this);
		evento.registerEvents((Listener) new PlacaDeRecraft(), (Plugin) this);
		evento.registerEvents((Listener) new PlacaDeSopa(), (Plugin) this);
		evento.registerEvents((Listener) new Chat(), (Plugin) this);
		evento.registerEvents((Listener) new StaffChat(), (Plugin) this);
		evento.registerEvents((Listener) new Bussola(), (Plugin) this);
		evento.registerEvents((Listener) new Ninja(), (Plugin) this);
		evento.registerEvents((Listener) new Plugins(), (Plugin) this);
	}

	public void Comandos() {
		this.getCommand("fly").setExecutor((CommandExecutor) new Fly());
		this.getCommand("report").setExecutor((CommandExecutor) new Report());
		this.getCommand("status").setExecutor((CommandExecutor) new Status());
		this.getCommand("rank").setExecutor((CommandExecutor) new Rank());
		this.getCommand("xp").setExecutor((CommandExecutor) new Xp());
		this.getCommand("score").setExecutor((CommandExecutor) new Score());
		this.getCommand("resetkit").setExecutor((CommandExecutor) new ResetKit());
		this.getCommand("clicktest").setExecutor((CommandExecutor) new ClickTest());
		this.getCommand("gm").setExecutor((CommandExecutor) new Gamemode());
		this.getCommand("gamemode").setExecutor((CommandExecutor) new Gamemode());
		this.getCommand("build").setExecutor((CommandExecutor) new Build());
		this.getCommand("admin").setExecutor((CommandExecutor) new Admin());
		this.getCommand("congelar").setExecutor((CommandExecutor) new Congelar());
		this.getCommand("pvp").setExecutor((CommandExecutor) new TogglePvP());
		this.getCommand("tag").setExecutor((CommandExecutor) new Tag());
		this.getCommand("warpset").setExecutor((CommandExecutor) new SetWarp());
		this.getCommand("warp").setExecutor((CommandExecutor) new irWarp());
		this.getCommand("aviso").setExecutor((CommandExecutor) new Aviso());
		this.getCommand("cc").setExecutor((CommandExecutor) new ClearChat());
		this.getCommand("fake").setExecutor((CommandExecutor) new Fake());
		this.getCommand("tell").setExecutor((CommandExecutor) new Tell());
		this.getCommand("chat").setExecutor((CommandExecutor) new Chat());
		this.getCommand("aplicar").setExecutor((CommandExecutor) new Aplicar());
		this.getCommand("sc").setExecutor((CommandExecutor) new StaffChat());
		this.getCommand("setarena").setExecutor((CommandExecutor) new SetArena());
		this.getCommand("caixa").setExecutor((CommandExecutor) new Caixa());
		this.getCommand("darkit").setExecutor((CommandExecutor) new DarKit());
		this.getCommand("tp").setExecutor((CommandExecutor) new Tp());
		this.getCommand("tphere").setExecutor((CommandExecutor) new Tp());
		this.getCommand("tpall").setExecutor((CommandExecutor) new Tp());
		this.getCommand("vis").setExecutor((CommandExecutor) new Ver());
		this.getCommand("spawn").setExecutor((CommandExecutor) new Spawn());
		this.getCommand("head").setExecutor((CommandExecutor) new Head());
		this.getCommand("youtuber").setExecutor((CommandExecutor) new Youtuber());
		this.getCommand("uncage").setExecutor((CommandExecutor) new UnCage());
		this.getCommand("kills").setExecutor((CommandExecutor) new Kills());
		this.getCommand("sendmsg").setExecutor((CommandExecutor) new SendMSG());
	}

	public void Kits() {
		final PluginManager kits = Bukkit.getPluginManager();
		this.getCommand("kit").setExecutor((CommandExecutor) new Kit());
		kits.registerEvents((Listener) new Bombeiro(), (Plugin) this);
		kits.registerEvents((Listener) new Jumper(), (Plugin) this);
		kits.registerEvents((Listener) new Goku(), (Plugin) this);
		kits.registerEvents((Listener) new Bruxa(), (Plugin) this);
		kits.registerEvents((Listener) new Shooter(), (Plugin) this);
		kits.registerEvents((Listener) new TimeLord(), (Plugin) this);
		kits.registerEvents((Listener) new JellyFish(), (Plugin) this);
		kits.registerEvents((Listener) new Anchor(), (Plugin) this);
		kits.registerEvents((Listener) new FisherMan(), (Plugin) this);
		kits.registerEvents((Listener) new Magma(), (Plugin) this);
		kits.registerEvents((Listener) new Confus\u00e3o(), (Plugin) this);
		kits.registerEvents((Listener) new Gladiator(), (Plugin) this);
		kits.registerEvents((Listener) new HotPotato(), (Plugin) this);
		kits.registerEvents((Listener) new ForceField(), (Plugin) this);
		kits.registerEvents((Listener) new Avatar(), (Plugin) this);
		kits.registerEvents((Listener) new Grappler(), (Plugin) this);
		kits.registerEvents((Listener) new Monk(), (Plugin) this);
		kits.registerEvents((Listener) new Stomper(), (Plugin) this);
		kits.registerEvents((Listener) new Thor(), (Plugin) this);
		kits.registerEvents((Listener) new Teleporter(), (Plugin) this);
		kits.registerEvents((Listener) new Gaara(), (Plugin) this);
		kits.registerEvents((Listener) new Infernor(), (Plugin) this);
		kits.registerEvents((Listener) new Poseidon(), (Plugin) this);
		kits.registerEvents((Listener) new Trader(), (Plugin) this);
		kits.registerEvents((Listener) new IronMan(), (Plugin) this);
		kits.registerEvents((Listener) new Phantom(), (Plugin) this);
		kits.registerEvents((Listener) new C4(), (Plugin) this);
		kits.registerEvents((Listener) new Viking(), (Plugin) this);
		kits.registerEvents((Listener) new Gun(), (Plugin) this);
		kits.registerEvents((Listener) new Terrorista(), (Plugin) this);
		kits.registerEvents((Listener) new Deshzin(), (Plugin) this);
		kits.registerEvents((Listener) new Flash(), (Plugin) this);
		kits.registerEvents((Listener) new Rain(), (Plugin) this);
		kits.registerEvents((Listener) new Rusher(), (Plugin) this);
		kits.registerEvents((Listener) new Hack(), (Plugin) this);
		kits.registerEvents((Listener) new FlashBack(), (Plugin) this);
		kits.registerEvents((Listener) new Switcher(), (Plugin) this);
		kits.registerEvents((Listener) new Subzero(), (Plugin) this);
		kits.registerEvents((Listener) new Vacuum(), (Plugin) this);
		kits.registerEvents((Listener) new Turtle(), (Plugin) this);
		kits.registerEvents((Listener) new Ajnin(), (Plugin) this);
		kits.registerEvents((Listener) new Pyro(), (Plugin) this);
		kits.registerEvents((Listener) new Resouper(), (Plugin) this);
		kits.registerEvents((Listener) new NoFall(), (Plugin) this);
		kits.registerEvents((Listener) new Viper_Snail(), (Plugin) this);
		kits.registerEvents((Listener) new Hulk(), (Plugin) this);
		kits.registerEvents((Listener) new DeshIce_DeshFire(), (Plugin) this);
		kits.registerEvents((Listener) new Hercules(), (Plugin) this);
	}

	public void Guis() {
		final PluginManager guis = Bukkit.getPluginManager();
		guis.registerEvents((Listener) new EventosGuis(), (Plugin) this);
		guis.registerEvents((Listener) new GuiKits(), (Plugin) this);
		guis.registerEvents((Listener) new GuiKits2(), (Plugin) this);
		guis.registerEvents((Listener) new GuiWarps(), (Plugin) this);
		guis.registerEvents((Listener) new GuiRank(), (Plugin) this);
		guis.registerEvents((Listener) new GuiCaixa(), (Plugin) this);
	}

	public static Plugin getPlugin() {
		return Main.plugin;
	}

	public static Main getInstance() {
		return Main.instance;
	}

	public void save() {
		try {
			this.status.save(this.statusfile);
			this.warps.save(this.warpsfile);
			this.arenas.save(this.arenasfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
