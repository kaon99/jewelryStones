package com.model.service;

import com.model.entities.Stone;
import com.model.entities.SyntheticStone;

public class SyntheticStoneFactory implements  StoneFactory {
    @Override
    public Stone createStone() {
        return new SyntheticStone();
    }
}
