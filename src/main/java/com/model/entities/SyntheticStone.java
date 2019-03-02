package com.model.entities;

import com.model.constants.Text;

import java.time.LocalDate;

public class SyntheticStone extends Stone {
     private  String Author ;
     private LocalDate localDate;

    @Override
    public void used() {
        System.out.println(Text.INDUSTRY + Text.CREATOR + Author);
    }
}
