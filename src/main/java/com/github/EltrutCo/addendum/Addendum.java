package com.github.EltrutCo.addendum;

import com.github.EltrutCo.addendum.registry.AddendumBlocks;
import com.github.EltrutCo.addendum.registry.AddendumItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addendum implements ModInitializer {

	public static final String MODID = "addendum";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

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
