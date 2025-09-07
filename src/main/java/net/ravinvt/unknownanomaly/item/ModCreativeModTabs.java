package net.ravinvt.unknownanomaly.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ravinvt.unknownanomaly.Unknownanomaly;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Unknownanomaly.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UNKNOWN_TAB = CREATIVE_MODE_TABS.register("unknown_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORE.get()))
                    .title(Component.translatable("tab.unknownanomaly.creative"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CORE.get());
                        output.accept(ModItems.BROKEN_CORE.get());
                        output.accept(ModItems.KEY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
