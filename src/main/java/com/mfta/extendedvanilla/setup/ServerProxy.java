package com.mfta.extendedvanilla.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Method only to be run on client!");
    }
}
