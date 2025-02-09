package ru.sanberdir.lesson_1_20_1_forge.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ru.sanberdir.lesson_1_20_1_forge.LessonForge1201;
import ru.sanberdir.lesson_1_20_1_forge.blocks.InitBlocks;
import ru.sanberdir.lesson_1_20_1_forge.items.InitItems;

public class CreativeLessonTab extends CreativeModeTab {

    protected CreativeLessonTab(Builder builder) {
        super(builder);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LessonForge1201.MODID);

    public static final RegistryObject<CreativeModeTab> LESSON_TAB = CREATIVE_MODE_TABS.register("lesson_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(InitItems.TIGER_STONE.get()))
                    .title(Component.translatable("creative_tab.lesson_1_20_1_forge"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks
                        pOutput.accept(InitBlocks.DICE_BLOCK.get());
                        pOutput.accept(InitBlocks.USUAL_PLANKS.get());
                        pOutput.accept(InitBlocks.USUAL_LOG.get());
                        pOutput.accept(InitBlocks.USUAL_WOOD.get());
                        pOutput.accept(InitBlocks.STRIPPED_USUAL_LOG.get());
                        pOutput.accept(InitBlocks.STRIPPED_USUAL_WOOD.get());
                        //Items
                        pOutput.accept(InitItems.USUAL_SAPLING.get());
                        pOutput.accept(InitItems.USUAL_LEAVES.get());
                        pOutput.accept(InitItems.TIGER_STONE.get());
                        pOutput.accept(InitItems.CALCINE.get());

                    })
                    .build());
}