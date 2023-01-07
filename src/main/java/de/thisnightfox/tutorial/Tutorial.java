package de.thisnightfox.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin aktiviert");

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin deaktiviert");
    }
}
