package net.naran.lifeless;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.naran.lifeless.block.ModBlocks;
import net.naran.lifeless.item.Moditems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(craftthisthing.MOD_ID)
public class craftthisthing
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "craftedbynaran";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public craftthisthing()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



        //Calling the files and codes of the items and blocks file and defining them as a mod event bus in this function and keyword below
        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }



    //Setting up the final FMLCommon SeupEvent function and defining it in the function written below as a private void function
    private void commonSetup(final FMLCommonSetupEvent event)
    {  }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {


        //Event Case for adding items to the game using this condition as fetch them in ingredients as other items.
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){

            //Added the first item having Alexandrite for the learning purpose and it is an item and it looks like a gem like a diamond or something
            event.accept(Moditems.ALEXANDRITE);

            //Adding a new item to the minecraft game and it is to signify the raw condition of the previous gen I added named Alexandrite
            event.accept(Moditems.RAW_ALEXANDRITE);

            //Added a new item to my minecraft game to make it personalized and make the gameplay interesting and make good
            event.accept(Moditems.LOVE);

            //Added a new iem to the minecraft and it signifies the contribution of HackClub in our Developer Community and this item has a bckground removed image of the hack club flag  and its contribution for student and teen developers
            event.accept(Moditems.HACK);

            //Added aN ICECREAM to the minecraft in this mod to signify the SWIRL workshop that Night Owls Completed with 6 members and 6 perfect projects.
            event.accept(Moditems.ICECREAM);
        }



//Event Case for adding a block to the minecraft using this mod and this condition helps to get the work done to add the blocks to the game and use it as regular blocks
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){

            //Adding a new block that represents the Alexandrite block added to the minecraft and it is quite good
            event.accept(ModBlocks.ALEXANDRITE_BLOCK);

            //Adding a minecraft block that has my image in it and it is quite funny and interesting but yeah its working and good to go
            event.accept(ModBlocks.NARAN_BLOCK);

            //Adding a 3d cube block to the minecraft and it has just orange colored all over its all sides and it is quite good
            event.accept(ModBlocks.ORANGE_BLOCK);

            //Adding a cubical block to signify and represent the community in which I am a founder and moderator and which is helping all enthusiast developers to take part in these type of workshops in collaboration with Hack Club.
            event.accept(ModBlocks.NIGHTOWLS_BLOCK);

            //Added a new minecraft block wit love heart emoji all over its all sides and it can be use d for some pretty specific cases and it has a greeny type of texture
            event.accept(ModBlocks.LOVE_BLOCK);
        }


    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent


        //defining the client setup public static main function
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code

        }
    }
}
