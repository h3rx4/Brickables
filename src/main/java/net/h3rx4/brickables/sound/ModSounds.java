package net.h3rx4.brickables.sound;

import net.h3rx4.brickables.Brickables;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {


    public static final SoundEvent THE_TALE_OF_A_CRUEL_WORLD = registerSoundEvent("the_tale_of_a_cruel_world");
    public static final RegistryKey<JukeboxSong> THE_TALE_OF_A_CRUEL_WORLD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Brickables.MOD_ID, "the_tale_of_a_cruel_world"));

    public static final SoundEvent THE_SPIDERS_INFLUENCE = registerSoundEvent("the_spiders_influence");
    public static final RegistryKey<JukeboxSong> THE_SPIDERS_INFLUENCE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Brickables.MOD_ID, "the_spiders_influence"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Brickables.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Brickables.LOGGER.info("Registering Mod Sounds for " + Brickables.MOD_ID);
    }
}
