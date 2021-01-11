package com.github.EltrutCo.addendum.config;

import com.github.EltrutCo.addendum.Addendum;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigManager;
import me.sargunvohra.mcmods.autoconfig1u.serializer.ConfigSerializer;

public class ConfigUtils {

    private ConfigUtils() {
        // NO-OP
    }

    public static void serializeConfig() {
        try {
            ((ConfigManager<ModConfig>) AutoConfig.getConfigHolder(ModConfig.class)).getSerializer().serialize(Addendum.CONFIG);
        } catch (ConfigSerializer.SerializationException serializeException) {
            Addendum.LOGGER.error("Failed to serialize " + Addendum.LOGGER.getName() + "'s config!", serializeException);
        }
    }
}
