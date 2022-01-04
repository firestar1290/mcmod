package fak.mc.mcmod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fak.mc.mcmod.setup.ClientSetup;
import fak.mc.mcmod.setup.ModSetup;
import fak.mc.mcmod.setup.registration;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mcmod")
public class mcmod {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID="mcmod";

    public mcmod() {
        // register the registry
        registration.init();
        // register modloading setup
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
