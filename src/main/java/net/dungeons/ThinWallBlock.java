package net.dungeons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;




public class ThinWallBlock extends Block {

    public static final DirectionProperty FACING;

    protected ThinWallBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }
    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }

    static {
        FACING = Properties.HORIZONTAL_FACING;
    }


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
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
