package com.mfta.extendedvanilla.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCrystal extends Block {

    public BlockCrystal() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(2.0f)
                .lightValue(14)

        );
        setRegistryName("crystal");
    }
}
