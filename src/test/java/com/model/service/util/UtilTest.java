package com.model.service.util;

import com.model.entities.Necklace;
import com.model.entities.Stone;
import com.model.service.FactoryCreate;
import com.model.service.StoneFactory;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UtilTest {
    Necklace necklace = new Necklace();

    StoneFactory mineral = FactoryCreate.stoneFactory("Минерал");

    Util util = new Util();
    Stone stone1 = mineral.createStone();
    Stone stone2 = mineral.createStone();

    public void inizialise() {
        stone1.setCost(100);
        stone2.setCost(100);
        stone1.setWeight(15);
        stone2.setWeight(20);
    }


    @Test
    public void sortByCost() {
        necklace.makeNecklace();
        List<Stone> sortByCost = util.sortByCost(necklace.getNecklace());
        for (int i = 0; i < sortByCost.size() - 1; i++) {
            if (sortByCost.get(i).getCost() > sortByCost.get(i + 1).getCost()) {

                fail();
            }

        }

    }

    @Test
    public void findStonesTransparencyInRange() {
        inizialise();
        stone1.setTransparency(10);
        stone2.setTransparency(30);
        necklace.addToNecklace(stone1);
        necklace.addToNecklace(stone2);
        int min = 0;
        int max = 30;
        for (Stone stone : util.findStonesTransparencyInRange(min,max,necklace.getNecklace())){
            System.out.println(stone);
           if (stone.getTransparency()< min && stone.getTransparency()> max){
               fail();
            }
        }


    }

    @Test
    public void sumOfCost() {
        stone1.setCost(100);
        stone2.setCost(100);
        necklace.addToNecklace(stone1);
        necklace.addToNecklace(stone2);

        assertEquals(200, util.sumOfCost(necklace.getNecklace()));
    }

    @Test
    public void sumOfWeight() {
        stone1.setWeight(15);
        stone2.setWeight(10);
        inizialise();
        necklace.addToNecklace(stone1);
        necklace.addToNecklace(stone2);
        System.out.println(necklace.getNecklace());
        assertEquals(25, util.sumOfWeight(necklace.getNecklace()));
    }
}