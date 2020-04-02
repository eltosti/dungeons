package net.dungeons;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class BrickWall extends Block{
    public BrickWall() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.METAL).build());
    }
}
