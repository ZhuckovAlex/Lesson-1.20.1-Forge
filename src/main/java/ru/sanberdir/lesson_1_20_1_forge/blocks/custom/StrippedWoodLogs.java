package ru.sanberdir.lesson_1_20_1_forge.blocks.custom;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;
import ru.sanberdir.lesson_1_20_1_forge.blocks.InitBlocks;

public class StrippedWoodLogs extends RotatedPillarBlock {
    public StrippedWoodLogs(Properties properties) {
        super(properties);
    }
    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(InitBlocks.USUAL_LOG.get())) {
                return InitBlocks.STRIPPED_USUAL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(InitBlocks.USUAL_WOOD.get())) {
                return InitBlocks.STRIPPED_USUAL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
