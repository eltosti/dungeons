package net.dungeons;


import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;


public class Dungeons implements ModInitializer {


    public static final WallBlock brickwall = new BrickWall();
    public static final WallBlock jailbars = new Jailbars();
    public static final WallBlock acasiawall = new WoodWalls();
    public static final WallBlock birchwall = new WoodWalls();
    public static final WallBlock darkoakwall = new WoodWalls();
    public static final WallBlock oakwall = new WoodWalls();
    public static final WallBlock sprucewall = new WoodWalls();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("dungeons","brickwall"),brickwall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","brickwall"), new BlockItem(brickwall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK,new Identifier("dungeons", "jailbars"), jailbars);
        Registry.register(Registry.ITEM,new Identifier("dungeons","jailbars"), new BlockItem(jailbars, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("dungeons","acasiawall"),acasiawall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","acasiawall"), new BlockItem(acasiawall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("dungeons","birchwall"),birchwall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","birchwall"), new BlockItem(birchwall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("dungeons","darkoakwall"),darkoakwall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","darkoakwall"), new BlockItem(darkoakwall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("dungeons","oakwall"),oakwall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","oakwall"), new BlockItem(oakwall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("dungeons","sprucewall"),sprucewall);
        Registry.register(Registry.ITEM,new Identifier("dungeons","sprucewall"), new BlockItem(sprucewall, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
