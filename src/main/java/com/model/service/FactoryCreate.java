package com.model.service;

import com.model.entities.Necklace;
import com.model.entities.Stone;
import com.model.types.Color;
import com.model.types.Name;

public class FactoryCreate {



    public static StoneFactory stoneFactory(String type) {
        if (type.equals("Минерал")) {
            return new MineralStoneFactory();
        }
        if (type.equals("Органика")) {
            return new OrganicStoneFactory();
        }
        if (type.equals("Синтетика")) {
            return new SyntheticStoneFactory();
        } else throw new RuntimeException(" This Factory is not supported " + type);
    }


}