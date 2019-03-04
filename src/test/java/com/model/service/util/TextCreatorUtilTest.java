package com.model.service.util;

import com.model.entities.Necklace;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextCreatorUtilTest {

Necklace necklace = new Necklace();
void initialiseneckLace (){
    necklace.makeNecklace();
}
    @Test
    public void printer() {
    initialiseneckLace();

        assertEquals("<ui><li>Stone{name=DIAMOND, color=COLORLESS, cost=120, transparency=0, weight=16}\n" +
                "</li><li>Stone{name=EMERALD, color=GREEN, cost=200, transparency=10, weight=10}\n" +
                "</li><li>Stone{name=RUBIN, color=RED, cost=150, transparency=10, weight=10}\n" +
                "</li><li>Stone{name=EMERALD, color=YELLOW, cost=140, transparency=20, weight=15}\n" +
                "</li></ui>" ,TextCreatorUtil.printer(necklace.getNecklace()));
    }
}