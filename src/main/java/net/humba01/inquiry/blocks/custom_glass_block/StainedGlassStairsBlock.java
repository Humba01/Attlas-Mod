package net.humba01.inquiry.blocks.custom_glass_block;

import net.minecraft.block.BlockState;
import net.minecraft.util.DyeColor;

public abstract class StainedGlassStairsBlock extends net.minecraft.block.Block implements net.minecraft.block.Stainable, net.minecraft.block.Waterloggable {

  private static net.minecraft.util.DyeColor color;
  
  public StainedGlassStairsBlock(DyeColor color, BlockState baseBlockState, Settings settings) {
    super(settings);
    // TODO Auto-generated constructor stub
  }

  // Stairs Type Config
  public static net.minecraft.state.property.DirectionProperty FACING;

  public static net.minecraft.state.property.EnumProperty<net.minecraft.block.enums.BlockHalf> HALF;

  public static net.minecraft.state.property.EnumProperty<net.minecraft.block.enums.StairShape> SHAPE;

  public static net.minecraft.state.property.BooleanProperty WATERLOGGED;

  protected static net.minecraft.util.shape.VoxelShape TOP_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape BOTTOM_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape BOTTOM_NORTH_WEST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape BOTTOM_SOUTH_WEST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape TOP_NORTH_WEST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape TOP_SOUTH_WEST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape BOTTOM_NORTH_EAST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape BOTTOM_SOUTH_EAST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape TOP_NORTH_EAST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape TOP_SOUTH_EAST_CORNER_SHAPE;

  protected static net.minecraft.util.shape.VoxelShape[] TOP_SHAPES;

  protected static net.minecraft.util.shape.VoxelShape[] BOTTOM_SHAPES;

  private static int[] SHAPE_INDICES;
    
  private static net.minecraft.block.Block baseBlock;
  
  private static net.minecraft.block.BlockState baseBlockState;
  
  private static net.minecraft.util.shape.VoxelShape composeShape(int i, net.minecraft.util.shape.VoxelShape base, net.minecraft.util.shape.VoxelShape northWest, net.minecraft.util.shape.VoxelShape northEast, net.minecraft.util.shape.VoxelShape southWest, net.minecraft.util.shape.VoxelShape southEast) {
    return null;
  }
  
  public boolean hasSidedTransparency(net.minecraft.block.BlockState state) {
    return false;
  }
  
  public net.minecraft.util.shape.VoxelShape getOutlineShape(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.ShapeContext context) {
    return null;
  }
  
  private int getShapeIndexIndex(net.minecraft.block.BlockState state) {
    return 0;
  }
  
  public void randomDisplayTick(net.minecraft.block.BlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, java.util.Random random) {
  }
  
  public void onBlockBreakStart(net.minecraft.block.BlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.player.PlayerEntity player) {
  }
  
  public void onBroken(net.minecraft.world.WorldAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state) {
  }
  
  public float getBlastResistance() {
    return 0;
  }
  
  public void onBlockAdded(net.minecraft.block.BlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState oldState, boolean notify) {
  }
  
  public void onStateReplaced(net.minecraft.block.BlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState newState, boolean moved) {
  }
  
  public void onSteppedOn(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.Entity entity) {
  }
  
  public boolean hasRandomTicks(net.minecraft.block.BlockState state) {
    return false;
  }
  
  public void randomTick(net.minecraft.block.BlockState state, net.minecraft.server.world.ServerWorld world, net.minecraft.util.math.BlockPos pos, java.util.Random random) {
  }
  
  public void scheduledTick(net.minecraft.block.BlockState state, net.minecraft.server.world.ServerWorld world, net.minecraft.util.math.BlockPos pos, java.util.Random random) {
  }
  
  public net.minecraft.util.ActionResult onUse(net.minecraft.block.BlockState state, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.player.PlayerEntity player, net.minecraft.util.Hand hand, net.minecraft.util.hit.BlockHitResult hit) {
    return null;
  }
  
  public void onDestroyedByExplosion(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.world.explosion.Explosion explosion) {
  }
  
  public net.minecraft.block.BlockState getPlacementState(net.minecraft.item.ItemPlacementContext ctx) {
    return null;
  }
  
  public net.minecraft.block.BlockState getStateForNeighborUpdate(net.minecraft.block.BlockState state, net.minecraft.util.math.Direction direction, net.minecraft.block.BlockState newState, net.minecraft.world.WorldAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.math.BlockPos posFrom) {
    return null;
  }
  
  private static net.minecraft.block.enums.StairShape getStairShape(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos) {
    return null;
  }
  
  private static boolean method_10678(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.math.Direction dir) {
    return false;
  }
  
  public static boolean isStairs(net.minecraft.block.BlockState state) {
    return false;
  }
  
  public net.minecraft.block.BlockState rotate(net.minecraft.block.BlockState state, net.minecraft.util.BlockRotation rotation) {
    return null;
  }
  
  public net.minecraft.block.BlockState mirror(net.minecraft.block.BlockState state, net.minecraft.util.BlockMirror mirror) {
    return null;
  }
  
  protected  void appendProperties(net.minecraft.state.StateManager.Builder<net.minecraft.block.Block,net.minecraft.block.BlockState> builder) {
  }
  
  public net.minecraft.fluid.FluidState getFluidState(net.minecraft.block.BlockState state) {
    return null;
  }
  
  public boolean canPathfindThrough(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.ai.pathing.NavigationType type) {
    return false;
  }
  
  private static net.minecraft.util.shape.VoxelShape[] method_10677(int i) {
    return null;
  }
  
  private static net.minecraft.util.shape.VoxelShape method_10674(net.minecraft.util.shape.VoxelShape voxelShape, net.minecraft.util.shape.VoxelShape voxelShape2, net.minecraft.util.shape.VoxelShape voxelShape3, net.minecraft.util.shape.VoxelShape voxelShape4, net.minecraft.util.shape.VoxelShape voxelShape5, int i) {
    return null;
  }
  
  static {} {
  }

  // Glass Type Config
  public boolean isSideInvisible(net.minecraft.block.BlockState state, net.minecraft.block.BlockState stateFrom,
      net.minecraft.util.math.Direction direction) {
    return false;
  }

  public net.minecraft.util.shape.VoxelShape getVisualShape(net.minecraft.block.BlockState state,
      net.minecraft.world.BlockView world, net.minecraft.util.math.BlockPos pos,
      net.minecraft.block.ShapeContext context) {
    return null;
  }

  public float getAmbientOcclusionLightLevel(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world,
      net.minecraft.util.math.BlockPos pos) {
    return 0;
  }

  public boolean isTranslucent(net.minecraft.block.BlockState state, net.minecraft.world.BlockView world,
      net.minecraft.util.math.BlockPos pos) {
    return false;
  }
  
}
