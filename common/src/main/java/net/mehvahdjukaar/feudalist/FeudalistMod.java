package net.mehvahdjukaar.feudalist;


import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;


public class FeudalistMod {

    public static final String MOD_ID = "feudalist";
    public static final Logger LOGGER = LogManager.getLogger("Feudalist");

    public static ResourceLocation res(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static final Supplier<Block> FANCY_STONE = RegHelper.registerBlockWithItem(
            res("fancy_stone"), () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                            .destroyTime(2)
            )
    );


    public static void init() {

    }

}
