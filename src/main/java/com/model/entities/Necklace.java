package com.model.entities;

import com.model.constants.Text;
import com.model.service.FactoryCreate;
import com.model.service.StoneFactory;
import com.model.types.Color;
import com.model.types.Name;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
private static Necklace instance = new Necklace();

/***
 *
 * Realise Pattern Singleton
 *
 * */
    public static Necklace getInstance() {

        return instance;
    }

    protected List<Stone> necklace = new ArrayList<>();

    public List<Stone> getNecklace() {
        return necklace;
    }




    @Override
    public String toString() {
        return "Necklace{" +
                "necklace=" + necklace +
                '}' ;
    }
}