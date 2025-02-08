package ru.sanberdir.lesson_1_20_1_forge.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.sanberdir.lesson_1_20_1_forge.LessonForge1201;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LessonForge1201.MODID);

    public static final RegistryObject<Item> TIGER_STONE = ITEMS.register("tiger_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CALCINE = ITEMS.register("calcine",
            () -> new FlameItem(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F)
                    // meet - можно кормить собак,   alwaysEat -  можно есть всегда, fast - есться быстро
                    .meat().alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 2), 0.1F)
                    .build())));
}