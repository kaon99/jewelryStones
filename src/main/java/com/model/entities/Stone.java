package com.model.entities;

import com.model.constants.Constant;
import com.model.service.FactoryCreate;
import com.model.types.Color;
import com.model.types.Name;

public abstract class Stone {
    private Name name;
    private Color color;
    private int cost;
    private int transparency;
    private int weight;


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTransparency() {
        return transparency;
    }


    public void setTransparency(int transparency) {

        this.transparency = transparency;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Stone{" +
                "name=" + name +
                ", color=" + color +
                ", cost=" + cost +
                ", transparency=" + transparency +
                ", weight=" + weight +
                '}' + "\n";
    }


    public abstract void used();

    /***
     * Pattern Builder create to initialise stones in one string .
     *
     * */
   public class Builder {

        public Builder() {
        }

        public Builder setName(Name name) {
            Stone.this.setName(name);
            return this;
        }

        public Builder setCost(int cost) {
            Stone.this.setCost(cost);
            return this;
        }

        public Builder setColor(Color color) {
            Stone.this.color = color;
            return this;
        }

        public Builder setTransparency(int transparency) {

            Stone.this.transparency = transparency;
            return this;
        }

        public Builder setWeight(int weight) {
            Stone.this.weight = weight;
            return this;
        }

    }
}

