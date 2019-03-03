package com.model.service;



public class FactoryCreate {

/** Pattern Fabric Method to create  new objects*/

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