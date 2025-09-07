package net.ravinvt.unknownanomaly.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ravinvt.unknownanomaly.Unknownanomaly;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Unknownanomaly.MOD_ID);

    public static final RegistryObject<Item> CORE = ITEMS.register("core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROKEN_CORE = ITEMS.register("broken_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY = ITEMS.register("key",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
