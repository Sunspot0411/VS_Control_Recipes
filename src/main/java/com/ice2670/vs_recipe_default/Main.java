package com.ice2670.vs_recipe_default;

import com.ice2670.vs_recipe_default.proxy.CommonProxy;
import com.ice2670.vs_recipe_default.util.Reference;
import com.ice2670.vs_recipe_default.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Collections;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
        proxy.registerEntityRenders();}
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistries();}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}

}
