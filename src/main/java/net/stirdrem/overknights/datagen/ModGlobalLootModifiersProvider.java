package net.stirdrem.overknights.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.stirdrem.overgeared.OvergearedMod;
import net.stirdrem.overgeared.item.ModItems;
import net.stirdrem.overgeared.loot.AddItemModifier;
import net.stirdrem.overgeared.loot.QualityLootModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, OvergearedMod.MOD_ID);
    }

    private static final ResourceLocation SIMPLE_DUNGEON = ResourceLocation.tryBuild("minecraft", "chests/simple_dungeon");
    private static final ResourceLocation ABANDONED_MINESHAFT = ResourceLocation.tryBuild("minecraft", "chests/abandoned_mineshaft");
    private static final ResourceLocation STRONGHOLD_CORRIDOR = ResourceLocation.tryBuild("minecraft", "chests/stronghold_corridor");
    private static final ResourceLocation STRONGHOLD_CROSSING = ResourceLocation.tryBuild("minecraft", "chests/stronghold_crossing");
    private static final ResourceLocation STRONGHOLD_LIBRARY = ResourceLocation.tryBuild("minecraft", "chests/stronghold_library");
    private static final ResourceLocation DESERT_PIRAMID = ResourceLocation.tryBuild("minecraft", "chests/desert_piramid");
    private static final ResourceLocation JUNGLE_TEMPLE = ResourceLocation.tryBuild("minecraft", "chests/jungle_temple");
    private static final ResourceLocation SHIPWRECK_TREASURE = ResourceLocation.tryBuild("minecraft", "chests/shipwreck_treasure");
    private static final ResourceLocation WOODLAND_MANSION = ResourceLocation.tryBuild("minecraft", "chests/woodland_mansion");

    @Override
    protected void start() {
    }
}