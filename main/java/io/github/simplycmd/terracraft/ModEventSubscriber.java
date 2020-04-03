package io.github.simplycmd.terracraft;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = Main.MODID, /*Tells forge that this class belongs to Terracraft*/ bus = Mod.EventBusSubscriber.Bus.MOD /*This parameter tells Forge that @SubscribeEvent methods in this class should receive events from the MOD event bus.*/)
public class ModEventSubscriber {
    @SubscribeEvent // Tells Forge that this method wants to subscribe to/listen for an event
    public static void onRegisterItems(RegistryEvent.Register<Item> event) { // Tells Forge that you want this method to be called when it is time for your mod to register its items.
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties()), "iron_pickaxe"),
                setup(new Item(new Item.Properties()), "dirt_block"),
                setup(new Item(new Item.Properties()), "stone_block"),
                setup(new Item(new Item.Properties()), "iron_broadsword"),
                setup(new Item(new Item.Properties()), "mushroom"),
                setup(new Item(new Item.Properties()), "iron_shortsword"),
                setup(new Item(new Item.Properties()), "iron_hammer"),
                setup(new Item(new Item.Properties()), "torch"),
                setup(new Item(new Item.Properties()), "wood"),
                setup(new Item(new Item.Properties()), "iron_axe"),
                setup(new Item(new Item.Properties()), "iron_ore"),
                setup(new Item(new Item.Properties()), "copper_ore"),
                setup(new Item(new Item.Properties()), "gold_ore"),
                setup(new Item(new Item.Properties()), "silver_ore"),
                setup(new Item(new Item.Properties()), "copper_watch"),
                setup(new Item(new Item.Properties()), "silver_watch"),
                setup(new Item(new Item.Properties()), "gold_watch"),
                setup(new Item(new Item.Properties()), "depth_meter"),
                setup(new Item(new Item.Properties()), "gold_bar"),
                setup(new Item(new Item.Properties()), "copper_bar"),
                setup(new Item(new Item.Properties()), "silver_bar"),
                setup(new Item(new Item.Properties()), "iron_bar"),
                setup(new Item(new Item.Properties()), "gel"),
                setup(new Item(new Item.Properties()), "wooden_sword"),
                setup(new Item(new Item.Properties()), "wooden_door"),
                setup(new Item(new Item.Properties()), "stone_wall"),
                setup(new Item(new Item.Properties()), "acorn"),
                setup(new Item(new Item.Properties()), "lesser_healing_potion"),
                setup(new Item(new Item.Properties()), "life_crystal"),
                setup(new Item(new Item.Properties()), "dirt_wall"),
                setup(new Item(new Item.Properties()), "bottle"),
                setup(new Item(new Item.Properties()), "wooden_table"),
                setup(new Item(new Item.Properties()), "furnace"),
                setup(new Item(new Item.Properties()), "wooden_chair"),
                setup(new Item(new Item.Properties()), "iron_anvil"),
                setup(new Item(new Item.Properties()), "work_bench"),
                setup(new Item(new Item.Properties()), "goggles"),
                setup(new Item(new Item.Properties()), "lens"),
                setup(new Item(new Item.Properties()), "wooden_bow"),
                setup(new Item(new Item.Properties()), "wooden_arrow"),
                setup(new Item(new Item.Properties()), "flaming_arrow"),
                setup(new Item(new Item.Properties()), "shuriken"),
                setup(new Item(new Item.Properties()), "suspicious_looking_eye"),
                setup(new Item(new Item.Properties()), "demon_bow"),
                setup(new Item(new Item.Properties()), "war_axe_of_the_night"),
                setup(new Item(new Item.Properties()), "lights_bane"),
                setup(new Item(new Item.Properties()), "unholy_arrow"),
                setup(new Item(new Item.Properties()), "chest"),
                setup(new Item(new Item.Properties()), "band_of_regeneration"),
                setup(new Item(new Item.Properties()), "magic_mirror"),
                setup(new Item(new Item.Properties()), "jesters_arrow"),
                setup(new Item(new Item.Properties()), "angel_statue"),
                setup(new Item(new Item.Properties()), "cloud_in_a_bottle"),
                setup(new Item(new Item.Properties()), "hermes_boots"),
                setup(new Item(new Item.Properties()), "enchanted_boomerang"),
                setup(new Item(new Item.Properties()), "demonite_ore"),
                setup(new Item(new Item.Properties()), "demonite_bar"),
                setup(new Item(new Item.Properties()), "heart"),
                setup(new Item(new Item.Properties()), "corrupt_seeds"),
                setup(new Item(new Item.Properties()), "vile_mushroom"),
                setup(new Item(new Item.Properties()), "ebonstone_block"),
                setup(new Item(new Item.Properties()), "grass_seeds"),
                setup(new Item(new Item.Properties()), "sunflower"),
                setup(new Item(new Item.Properties()), "vilethorn"),
                setup(new Item(new Item.Properties()), "starfury"),
                setup(new Item(new Item.Properties()), "purification_powder"),
                setup(new Item(new Item.Properties()), "vile_powder"),
                setup(new Item(new Item.Properties()), "rotten_chunk"),
                setup(new Item(new Item.Properties()), "worm_tooth"),
                setup(new Item(new Item.Properties()), "worm_food"),
                setup(new Item(new Item.Properties()), "copper_coin"),
                setup(new Item(new Item.Properties()), "silver_coin"),
                setup(new Item(new Item.Properties()), "gold_coin"),
                setup(new Item(new Item.Properties()), "platinum_coin"),
                setup(new Item(new Item.Properties()), "fallen_star"),
                setup(new Item(new Item.Properties()), "copper_greaves"),
                setup(new Item(new Item.Properties()), "iron_greaves"),
                setup(new Item(new Item.Properties()), "silver_greaves"),
                setup(new Item(new Item.Properties()), "gold_greaves"),
                setup(new Item(new Item.Properties()), "copper_chainmail"),
                setup(new Item(new Item.Properties()), "iron_chainmail"),
                setup(new Item(new Item.Properties()), "silver_chainmail"),
                setup(new Item(new Item.Properties()), "gold_chainmail"),
                setup(new Item(new Item.Properties()), "grappling_hook"),
                setup(new Item(new Item.Properties()), "chain"),
                setup(new Item(new Item.Properties()), "shadow_scale"),
                setup(new Item(new Item.Properties()), "piggy_bank"),
                setup(new Item(new Item.Properties()), "mining_helmet"),
                setup(new Item(new Item.Properties()), "copper_helmet"),
                setup(new Item(new Item.Properties()), "iron_helmet"),
                setup(new Item(new Item.Properties()), "silver_helmet"),
                setup(new Item(new Item.Properties()), "gold_helmet"),
                setup(new Item(new Item.Properties()), "wood_wall"),
                setup(new Item(new Item.Properties()), "wood_platform"),
                setup(new Item(new Item.Properties()), "flintlock_pistol"),
                setup(new Item(new Item.Properties()), "musket"),
                setup(new Item(new Item.Properties()), "musket_ball"),
                setup(new Item(new Item.Properties()), "minishark"),
                setup(new Item(new Item.Properties()), "iron_bow"),
                setup(new Item(new Item.Properties()), "shadow_greavesz"),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),
                setup(new Item(new Item.Properties()), ""),







                setup(new Item(new Item.Properties()), "testing_dust")
        );
    }


    //----------------------------------------------------------------------------------------------------------------
    //The following code is a very elegant solution to the problem of having very messy and fragile registration code.
    //----------------------------------------------------------------------------------------------------------------
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Main.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
