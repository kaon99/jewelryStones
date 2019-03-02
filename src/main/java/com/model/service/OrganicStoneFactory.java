package com.model.service;

import com.model.entities.OrganicStone;
import com.model.entities.Stone;

public class OrganicStoneFactory implements StoneFactory {
    @Override
    public Stone createStone() {
        return new OrganicStone();
    }
}
