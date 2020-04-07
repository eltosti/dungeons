package net.dungeons;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;




public class BrickThinWall extends ThinWallBlock {
    public BrickThinWall() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.METAL).build());
    }
}
