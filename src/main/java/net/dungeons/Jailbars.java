package net.dungeons;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class Jailbars extends WallBlock{
    public Jailbars(){
        super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).build());
    }
}
