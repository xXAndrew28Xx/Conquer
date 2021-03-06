package me.andrew28.addons.conquer;

import me.andrew28.addons.conquer.api.FactionsPlugin;
import me.andrew28.addons.conquer.impl.factionsone.FOPlugin;
import me.andrew28.addons.conquer.impl.factionsuuid.FUPlugin;
import me.andrew28.addons.conquer.impl.legacyfactions.LFPlugin;
import me.andrew28.addons.conquer.impl.mfactions.MSPlugin;
import me.andrew28.addons.conquer.impl.savagefactions.SFPlugin;

/**
 * @author Andrew Tran
 */
public enum DefaultFactionPlugins {
    FACTIONS_UUID(FUPlugin.class),
    MASSIVE_FACTIONS(MSPlugin.class),
    FACTIONS_ONE(FOPlugin.class),
    LEGACY_FACTIONS(LFPlugin.class),
    SAVAGE_FACTIONS(SFPlugin.class);

    private Class<? extends FactionsPlugin> implClass;
    DefaultFactionPlugins(Class<? extends FactionsPlugin> implClass) {
        this.implClass = implClass;
    }

    public Class<? extends FactionsPlugin> getImplClass() {
        return implClass;
    }
}
