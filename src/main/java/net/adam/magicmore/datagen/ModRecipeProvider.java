package net.adam.magicmore.datagen;

import net.adam.magicmore.block.ModBlocks;
import net.adam.magicmore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerCompactingRecipe(consumer, RecipeCategory.MISC, Items.BRICK, ModItems.DENSE_BRICK);
        offerCompactingRecipe(consumer, RecipeCategory.MISC, ModItems.DENSE_BRICK, ModItems.DENSER_BRICK);
        offerCompactingRecipe(consumer, RecipeCategory.MISC, ModItems.DENSER_BRICK, ModItems.SUPERDENSE_BRICK);
        offerCompactingRecipe(consumer, RecipeCategory.COMBAT, ModItems.SUPERDENSE_BRICK, ModItems.BOB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUMPER_BLOCK, 3)
                .pattern("#X#")
                .pattern("XXX")
                .pattern("#X#")
                .input('#', ModItems.PHANTASIUM_INGOT)
                .input('X', Items.SLIME_BALL)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .criterion(hasItem(ModItems.PHANTASIUM_INGOT), conditionsFromItem(ModItems.PHANTASIUM_INGOT))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.JUMPER_BLOCK)));
    }
}
