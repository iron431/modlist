package io.redspace.ironsspellbooks;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Modlist.MODID)
public class Modlist {
    public static final String MODID = "modlist";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Modlist() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
