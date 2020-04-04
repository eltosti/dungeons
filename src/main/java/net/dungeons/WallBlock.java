package net.dungeons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.EntityContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;




public class WallBlock extends HorizontalFacingBlock {

    public static final DirectionProperty FACING;

    public WallBlock(Settings settings)
    {
        super(settings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ctx){
        switch (state.get(FACING)){
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.0f, 0.125f);
            case SOUTH:
                return VoxelShapes.cuboid(0f, 0f, 0.875f, 1f, 1.0f, 1f);
            case WEST:
                return VoxelShapes.cuboid(0f, 0f, 0.0f, 0.125f, 1.0f, 1f);
            case EAST:
                return VoxelShapes.cuboid(0.875f, 0f, 0.0f, 1f, 1.0f, 1f);
        }
        return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.0f, 0.125f);
    }

}
