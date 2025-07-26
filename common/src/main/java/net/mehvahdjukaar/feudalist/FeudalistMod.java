package net.mehvahdjukaar.feudalist;


import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;


public class FeudalistMod {

    public static final String MOD_ID = "map_atlases";
    public static final Logger LOGGER = LogManager.getLogger("Map Atlases");

    public static ResourceLocation res(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static final Supplier<Block> DUMB_BLOCK = RegHelper.registerBlockWithItem(
            res("empty_maps"), () -> new Block(
                    BlockBehaviour.Properties.of()
                            .noCollission()
                            .instabreak()
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)
            )
    );


    public static void init() {

    }

}
