package gay.pridecraft.joy.block.custom;

import gay.pridecraft.joy.Joy;
import net.minecraft.block.AbstractBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class EstrogenBlock {

	public static Block register(Block block, String name, boolean shouldRegisterItem) {
		// Register the block and its item.
		Identifier id = Identifier.of(Joy.EstrogenBlock, name);

		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

}