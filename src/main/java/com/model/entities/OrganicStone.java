package com.model.entities;

import com.model.constants.Text;

public class OrganicStone extends Stone {
    private String origin ;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void used() {
        System.out.println(Text.HEALTH + Text.CREATOR + origin);
    }
}
