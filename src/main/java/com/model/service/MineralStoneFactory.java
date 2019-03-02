package com.model.service;

import com.model.entities.MineralStone;
import com.model.entities.Stone;

public class MineralStoneFactory implements StoneFactory {
    @Override
    public Stone createStone() {
        return new MineralStone();
    }
}
