package net.adam.magicmore.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderPortBlock extends Block {
    public EnderPortBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(Items.ENDER_PEARL)) {
            //player.sendMessage(Text.literal("ENDER PERAL!!!"));
            player.sendMessage(Text.literal("The Ender Port needs a trapdoor to be attached!"), true);
        }
        //MagicAndMore.LOGGER.info(String.valueOf(player.getStackInHand(hand)));
        return ActionResult.SUCCESS;
    }

}
