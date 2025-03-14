package com.autovw.burgermod.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Author: Autovw
 */
public class Config {
    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonConfig = commonConfigPair.getRight();
        COMMON = commonConfigPair.getLeft();
    }
    // Everything above this line is needed to register the main config.

    public static class Common {
        public final EffectsConfig effectsConfig;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("common");
            {
                this.effectsConfig = new EffectsConfig(builder);
            }
            builder.pop();
        }
    }
    // Stuff above this line is needed to register the common config.

    /*
     * This is the EffectsConfig.
     * In this config are some effects properties stored which are utilized in the ModEffects class.
     */
    public static class EffectsConfig {
        public static ForgeConfigSpec.ConfigValue<Integer> rawEggEffectDuration;
        public static ForgeConfigSpec.ConfigValue<Integer> rawEggEffectAmplifier;
        public static ForgeConfigSpec.ConfigValue<Integer> rawChampignonEffectDuration;
        public static ForgeConfigSpec.ConfigValue<Integer> rawChampignonEffectAmplifier;
        public static ForgeConfigSpec.ConfigValue<Integer> goldenBurgerRegenDuration;
        public static ForgeConfigSpec.ConfigValue<Integer> goldenBurgerRegenAmplifier;
        public static ForgeConfigSpec.ConfigValue<Integer> goldenBurgerAbsorptionDuration;
        public static ForgeConfigSpec.ConfigValue<Integer> goldenBurgerAbsorptionAmplifier;

        public EffectsConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Effects Config").push("effects_config");
            {
                rawEggEffectDuration = builder
                        .comment("Adjust the effect duration in ticks here. 20 ticks = 1 second, 200 ticks = 10 seconds etc.")
                        .define("rawEggEffectDuration", 200);
                rawEggEffectAmplifier = builder
                        .comment("Adjust the effect level here. 0 = level 1, 1 = level 2 etc.")
                        .define("rawEggEffectAmplifier", 0);
                rawChampignonEffectDuration = builder
                        .comment("Adjust the effect duration in ticks here. 20 ticks = 1 second, 200 ticks = 10 seconds etc.")
                        .define("rawChampignonEffectDuration", 600);
                rawChampignonEffectAmplifier = builder
                        .comment("Adjust the effect level here. 0 = level 1, 1 = level 2 etc.")
                        .define("rawChampignonEffectAmplifier", 1);
                goldenBurgerRegenDuration = builder
                        .comment("Adjust the regeneration effect duration in ticks here. 20 ticks = 1 second, 200 ticks = 10 seconds etc.")
                        .define("goldenBurgerRegenDuration", 100);
                goldenBurgerRegenAmplifier = builder
                        .comment("Adjust the regeneration effect level here. 0 = level 1, 1 = level 2 etc.")
                        .define("goldenBurgerRegenAmplifier", 1);
                goldenBurgerAbsorptionDuration = builder
                        .comment("Adjust the absorption effect duration in ticks here. 20 ticks = 1 second, 200 ticks = 10 seconds etc.")
                        .define("goldenBurgerAbsorptionDuration", 1200);
                goldenBurgerAbsorptionAmplifier = builder
                        .comment("Adjust the absorption effect level here. 0 = level 1, 1 = level 2 etc.")
                        .define("goldenBurgerAbsorptionAmplifier", 0);
            }
            builder.pop();
        }
    }
}
