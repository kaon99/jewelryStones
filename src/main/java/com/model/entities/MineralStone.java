package com.model.entities;

import com.model.constants.Text;

public class MineralStone  extends  Stone {

    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void used() {
        System.out.println(Text.JEWERLY);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
