package com.model.service;


import com.model.constants.Text;

public class FactoryCreate {

/** Pattern Fabric Method to create  new objects*/

    public static StoneFactory stoneFactory(String type) {
        if (type.equals(Text.MINERAL)) {
            return new MineralStoneFactory();
        }
        if (type.equals(Text.ORGANIC)) {
            return new OrganicStoneFactory();
        }
        if (type.equals(Text.SYNTHETIC)) {
            return new SyntheticStoneFactory();
        } else throw new RuntimeException(Text.FACTORY_NOT_SUPPORTED + type);
    }


}