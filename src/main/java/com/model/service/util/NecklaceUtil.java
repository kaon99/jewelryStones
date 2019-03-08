package com.model.service.util;

import com.model.constants.Text;
import com.model.entities.Necklace;
import com.model.entities.Stone;
import com.model.service.FactoryCreate;
import com.model.service.StoneFactory;
import com.model.types.Color;
import com.model.types.Name;

public class NecklaceUtil {
    public static void addToNecklace(Stone stone) {
        if (stone.getCost() >= 100 && stone.getWeight() <= 20) {
            Necklace.getInstance().getNecklace().add(stone);
            System.out.println(Text.ADD_TO_NECKLAKE + stone.getName());

        }
    }

    /**
     * Create some objects to add their in ArrayList
     *
     * */
    public static void makeNecklace() {
        StoneFactory mineral = FactoryCreate.stoneFactory(Text.MINERAL);
        StoneFactory organic = FactoryCreate.stoneFactory(Text.ORGANIC);
        StoneFactory synthetic = FactoryCreate.stoneFactory(Text.SYNTHETIC);


        Stone stone = mineral.createStone();
        stone.newBuilder().setCost(120).setColor(Color.COLORLESS).setName(Name.DIAMOND).setWeight(16).setTransparency(0);

        addToNecklace(stone);

        Stone stone1 = organic.createStone();
        stone1.newBuilder().setCost(200).setColor(Color.GREEN).setName(Name.EMERALD).setWeight(10).setTransparency(10);
        addToNecklace(stone1);

        Stone stone2 = synthetic.createStone();
        stone2.newBuilder().setCost(150).setColor(Color.RED).setName(Name.RUBIN).setWeight(10).setTransparency(10);
        addToNecklace(stone2);

        Stone stone3 = mineral.createStone();
        stone3.newBuilder().setCost(140).setColor(Color.YELLOW).setName(Name.EMERALD).setWeight(15).setTransparency(20);
        addToNecklace(stone3);

        Stone stone4 = organic.createStone();
        stone4.newBuilder().setCost(500).setColor(Color.BLACK).setName(Name.TOPAZ).setWeight(30).setTransparency(50);
        addToNecklace(stone4);

    }
}
