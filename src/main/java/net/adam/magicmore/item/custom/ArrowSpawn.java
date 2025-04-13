package net.adam.magicmore.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class ArrowSpawn extends Item {
    public ArrowSpawn(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if( !world.isClient() ) {

            Vec3d vo = clipVoDistance(user, 0.5d);
            ArmorStandEntity chick = new ArmorStandEntity(EntityType.ARMOR_STAND, world  );
            chick.setPosition(vo);
            chick.bodyYaw = user.headYaw;
            chick.headYaw = user.headYaw;
            world.spawnEntity(chick);

        }

        return TypedActionResult.success(stack);
    }

    public static @NotNull Vec3d clipVoDistance(@NotNull LivingEntity player, double clipDistance) {
        double vecX = Math.sin(-player.getYaw() * (Math.PI / 180.0) - Math.PI) * -Math.cos(-player.getPitch() * (Math.PI / 180.0));
        double vecY = Math.sin(-player.getPitch() * (Math.PI / 180.0));
        double vecZ = Math.cos(-player.getYaw() * (Math.PI / 180.0) - Math.PI) * -Math.cos(-player.getPitch() * (Math.PI / 180.0));
        return player.getEyePos().add(vecX * clipDistance, vecY * clipDistance, vecZ * clipDistance);
    }
}
