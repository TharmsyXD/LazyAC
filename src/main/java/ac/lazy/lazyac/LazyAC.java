package ac.lazy.lazyac;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class LazyAC extends JavaPlugin {

    private Logger logger;
    @Override
    public void onEnable() {
        // Logger
        logger = this.getLogger();

        logger.info("LazyAC Enabled 1 checks Enabled");
        ;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("Disabling LazyAC");
    }
}
