//Defining the packages of the project and connecting the package to the file

package net.naran.lifeless.block;




//Importing different packages to the program and defining the required packages to use different keywords and values
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.naran.lifeless.craftthisthing;
import net.naran.lifeless.item.Moditems;

import java.util.function.Supplier;

//Defining the public main class to the Mod Blocks File as ModBlocks
public class ModBlocks {


    //Defining the BLOCKS value to input the blocks defination
public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, craftthisthing.MOD_ID);


//Adding the new block named Alexandrite and it is 3d cubical and it is the first block i crafted or made in minecraft

public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of()
    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).lightLevel(state -> 15)));

// Using the .lightstate property in the blockProperties to make the block glow in the dark

//Adding a new block name naran_block --this block uses my own pixeleted images as tecture for all sides and it is quite low quality to make it work
    public static final RegistryObject<Block> NARAN_BLOCK = registerBlock("naran_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


    //Adding a new block item orange colored lamp block and in this block its just orange color as texture to make it work for all sides and its requires all sides getting in orange colored texture in a 16*16px of image size
    public static final RegistryObject<Block> ORANGE_BLOCK = registerBlock("orange_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).lightLevel(state -> 20)));



//Adding a new block to the minecraft mod program and it is named as NIGHTOWLS  and this block helps to get the representation of NIghtOwls logo in a pixeleted design image but due to less pixel size and less pixel number the the image quality is quite loe and not so good
    public static final RegistryObject<Block> NIGHTOWLS_BLOCK = registerBlock("nightowls_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


//Adding a block to the minecraft mod and in this block code section the name of block is Love Block and in its all sides it has a love emoji as image with a pixel size of 16*16 pixel and it has a clear greeny background in the love emoji and its pretty good.
    public static final RegistryObject<Block> LOVE_BLOCK = registerBlock("love_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).lightLevel(state -> 17)));




    //Defining the most required components for defining a block in a minecraft mod program
private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {

    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;

}


//Defining the required components fo defining a block in a minecraft program
private static<T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {

    Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

}


//Defining the required components for defining a block in a minecraft mod program
public static void register(IEventBus eventBus) {

    BLOCKS.register(eventBus);
}

}