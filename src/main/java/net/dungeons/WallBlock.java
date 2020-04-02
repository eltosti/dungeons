package net.dungeons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WallBlock extends Block {
    public WallBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ctx) {
        return VoxelShapes.cuboid(0f, 0f, -0.125f, 1f, 1.0f, 0.125f);
    }

}
