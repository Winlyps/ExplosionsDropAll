package winlyps.explosionsDropAll

import org.bukkit.plugin.java.JavaPlugin

class ExplosionsDropAll : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("blockExplosionDropDecay", "false")
            world.setGameRuleValue("mobExplosionDropDecay", "false")

        }
        logger.info("ExplosionsDropAll plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("ExplosionsDropAll plugin has been disabled.")
    }
}