package com.github.EltrutCo.addendum;

import com.github.EltrutCo.addendum.registry.AddendumBlocks;
import com.github.EltrutCo.addendum.registry.AddendumItems;
import com.github.EltrutCo.addendum.config.ModConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addendum implements ModInitializer {

	public static final String MODID = "addendum";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {
		AddendumItems.RegisterAddendumItems();
		AddendumBlocks.RegisterAddendumBlocks();
		new AddendumItems();
		new AddendumBlocks();
	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
