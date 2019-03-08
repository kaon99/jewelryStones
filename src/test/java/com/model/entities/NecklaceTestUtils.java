package com.model.entities;

import com.model.service.FactoryCreate;
import com.model.service.MineralStoneFactory;
import com.model.service.StoneFactory;
import com.model.service.util.NecklaceUtil;
import com.model.types.Color;
import com.model.types.Name;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class NecklaceTestUtils {
    Necklace necklace = new Necklace();
    StoneFactory mineral = FactoryCreate.stoneFactory("Минерал");
    Stone stone = mineral.createStone();


   @Ignore
   @Test
    public void addToNecklace()  {
       stone.newBuilder().setCost(120).setColor(Color.COLORLESS).setName(Name.DIAMOND).setWeight(16).setTransparency(0);
       NecklaceUtil.addToNecklace(stone);
        if (stone.equals(necklace.getNecklace().get(0))){
            Assert.assertTrue(true);
        }
    }
@Ignore
    @Test
    public void makeNecklace() {
        NecklaceUtil.makeNecklace();
       if ( necklace.getNecklace().isEmpty()){
           fail();
       }
    }
}