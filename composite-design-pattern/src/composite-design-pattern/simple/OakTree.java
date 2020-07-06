package lab8.simple;

import lab8.Plant;

public class OakTree implements Plant {
    @Override
    public double getOxigenAmountPerYear() {
        return 350;
    }

    @Override
    public int getLifeTime() {
        return 7;
    }

    @Override
    public String getRepresentation() {
        return "O";
    }
}
