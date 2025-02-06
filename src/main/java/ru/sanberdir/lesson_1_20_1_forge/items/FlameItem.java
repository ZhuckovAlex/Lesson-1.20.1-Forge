package ru.sanberdir.lesson_1_20_1_forge.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import org.jetbrains.annotations.Nullable;

public class FlameItem extends Item {
    public FlameItem(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 600;
    }
}