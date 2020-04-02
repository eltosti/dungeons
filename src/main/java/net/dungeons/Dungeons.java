package net.dungeons;


import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Dungeons implements ModInitializer {

    public static final Block brickwall = new BrickWall();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("dungeons","brickwall"),brickwall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","brickwall"), new BlockItem(brickwall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
