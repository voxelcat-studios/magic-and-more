package net.adam.magicmore.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TotemItem extends Item {


    public TotemItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.applyMovementInput(new Vec3d(0f, 100f, 0f), 12);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 60));
            user.getStackInHand(hand).setCount(0);
            //damage(1, user, playerEntity -> playerEntity.sendToolBreakStatus(hand));
        }
        return super.use(world, user, hand);
    }
}
