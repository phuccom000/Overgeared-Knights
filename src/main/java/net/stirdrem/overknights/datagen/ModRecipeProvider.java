package net.stirdrem.overknights.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.stirdrem.overgeared.AnvilTier;
import net.stirdrem.overgeared.OvergearedMod;
import net.stirdrem.overgeared.block.ModBlocks;
import net.stirdrem.overgeared.datagen.FletchingRecipeBuilder;
import net.stirdrem.overgeared.datagen.OvergearedShapelessRecipeBuilder;
import net.stirdrem.overgeared.datagen.ShapedForgingRecipeBuilder;
import net.stirdrem.overgeared.item.ModItems;
import net.stirdrem.overgeared.item.ToolType;
import net.stirdrem.overgeared.util.ModTags;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> STEEL_SMELTABLES = List.of(
            ModItems.CRUDE_STEEL.get()
    );

    private static final List<ItemLike> COPPER_SMELTABLES = List.of(
            Items.COPPER_INGOT
    );
    private static final List<ItemLike> IRON_SMELTABLES = List.of(
            Items.IRON_INGOT
    );

    private static final List<ItemLike> IRON_SOURCE = List.of(
            Items.RAW_IRON,
            Blocks.DEEPSLATE_IRON_ORE,
            Blocks.IRON_ORE
    );

    private static final List<ItemLike> COPPER_SOURCE = List.of(
            Items.RAW_COPPER,
            Blocks.DEEPSLATE_COPPER_ORE,
            Blocks.COPPER_ORE
    );

    private static final List<ItemLike> IRON_HEADS = List.of(
            ModItems.IRON_HOE_HEAD.get(),
            ModItems.IRON_PICKAXE_HEAD.get(),
            ModItems.IRON_SWORD_BLADE.get(),
            ModItems.IRON_AXE_HEAD.get(),
            ModItems.IRON_SHOVEL_HEAD.get(),
            ModItems.IRON_ARROW_HEAD.get()

    );
    private static final List<ItemLike> STEEL_HEADS = List.of(
            ModItems.STEEL_HOE_HEAD.get(),
            ModItems.STEEL_PICKAXE_HEAD.get(),
            ModItems.STEEL_SWORD_BLADE.get(),
            ModItems.STEEL_AXE_HEAD.get(),
            ModItems.STEEL_SHOVEL_HEAD.get(),
            ModItems.STEEL_HOE.get(),
            ModItems.STEEL_PICKAXE.get(),
            ModItems.STEEL_SWORD.get(),
            ModItems.STEEL_AXE.get(),
            ModItems.STEEL_SHOVEL.get(),
            ModItems.STEEL_HELMET.get(),
            ModItems.STEEL_CHESTPLATE.get(),
            ModItems.STEEL_LEGGINGS.get(),
            ModItems.STEEL_BOOTS.get(),
            ModItems.STEEL_ARROW_HEAD.get()
    );

    private static final List<ItemLike> COPPER_HEADS = List.of(
            ModItems.COPPER_HOE_HEAD.get(),
            ModItems.COPPER_PICKAXE_HEAD.get(),
            ModItems.COPPER_SWORD_BLADE.get(),
            ModItems.COPPER_AXE_HEAD.get(),
            ModItems.COPPER_SHOVEL_HEAD.get(),
            ModItems.COPPER_HOE.get(),
            ModItems.COPPER_PICKAXE.get(),
            ModItems.COPPER_SWORD.get(),
            ModItems.COPPER_AXE.get(),
            ModItems.COPPER_SHOVEL.get(),
            ModItems.COPPER_HELMET.get(),
            ModItems.COPPER_CHESTPLATE.get(),
            ModItems.COPPER_LEGGINGS.get(),
            ModItems.COPPER_BOOTS.get()

    );
    private static final List<ItemLike> GOLDEN_HEADS = List.of(
            ModItems.GOLDEN_HOE_HEAD.get(),
            ModItems.GOLDEN_PICKAXE_HEAD.get(),
            ModItems.GOLDEN_SWORD_BLADE.get(),
            ModItems.GOLDEN_AXE_HEAD.get(),
            ModItems.GOLDEN_SHOVEL_HEAD.get()

    );


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter){

    }

    /*protected static void oreSmelting(Consumer<FinishedRecipe> consumer, List<ItemLike> ingredients, @Nullable CompoundTag nbt,
                                      RecipeCategory category, ItemLike result, float experience,
                                      int cookingTime, String group) {
        oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, ingredients, category, result, nbt, experience, cookingTime, group, "_from_smelting");

    }

    protected static void oreBlasting(Consumer<FinishedRecipe> consumer, List<ItemLike> ingredients, @Nullable CompoundTag nbt,
                                      RecipeCategory category, ItemLike result, float experience,
                                      int cookingTime, String group) {
        oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, ingredients, category, result, nbt, experience, cookingTime, group, "_from_blasting");
    }


    protected static void oreCooking(Consumer<FinishedRecipe> consumer, RecipeSerializer<? extends AbstractCookingRecipe> serializer,
                                     List<ItemLike> ingredients, RecipeCategory category, ItemLike result,
                                     @Nullable CompoundTag resultNbt, float experience, int cookingTime,
                                     String group, String recipeName) {
        for (ItemLike itemlike : ingredients) {
            CustomCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, resultNbt, result,
                            experience, cookingTime, serializer)
                    .group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(consumer, OvergearedMod.MOD_ID + ":" + getItemName(result) + recipeName + "_" + getItemName(itemlike));
        }
    }*/

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, @Nullable String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreCampfire(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, @Nullable String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_campfire");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, @Nullable String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, OvergearedMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }


}
