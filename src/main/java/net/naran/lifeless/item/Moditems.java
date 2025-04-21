package net.naran.lifeless.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.naran.lifeless.craftthisthing;

public class Moditems {
public static final DeferredRegister<Item> ITEMS=
        DeferredRegister.create(ForgeRegistries.ITEMS, craftthisthing.MOD_ID);


//Adding the Alexanderite item to the minecraft inventory

public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite" ,
            () -> new Item(new Item.Properties()));


//Adding the Raw Alexendarite Item to the minecraft rather than the Alexandarite item the item has a background as white and thats why this item is considered as raw alexanderite item and it represents the raw form of the alexanderite.
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite" ,
            () -> new Item(new Item.Properties()));



//Adding the love item in the minecraft thing
    public static final RegistryObject<Item> LOVE = ITEMS.register("love" ,
            () -> new Item(new Item.Properties()));


    //Adding a new item having a pixeleted image of the hackclub flag which is background free but a little bit unclear due to which  it doesnt seem good and visually appealing but take it please >3 Narayan Bhusal    -> ->
  public static final RegistryObject<Item> HACK = ITEMS.register("hack",
            () -> new Item(new Item.Properties()));






  //I was just wondering what to do and what to add as an item to the minecraft and I remembered our Swirl workshop so I am addin an icecream as it
    public static final RegistryObject<Item> ICECREAM = ITEMS.register("icecream",
          () -> new Item(new Item.Properties()));

    // Registers the items to the event bus for proper initialization during mod loading.
public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}


}





// Marey gulati hai maura jiya mari kalai na xodo piya
// tori kalai na xodengey ham
// tere bin adhurey hai ham ram kasam

// Kalko keshma relimai badheko riban
// timlai herdai relimai bitaula jiban
// gailai gotha relimain ghda lai tabela
// jala joban relimai nagar abela

// Lol yaar mero halat kk lekhixarxu bey yaar yesto halat ta kasaiko nahos yaar
// life damage bhaxa yaar mero ta yo project le garda yaar yesto jheu lagexa ni j paye tei lekhna pariraxa yaar aara bahut exhaustion huni haixa yaar yesta yesti garera