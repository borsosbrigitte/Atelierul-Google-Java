//Borsos Brigitte GI1 EVH


package lab8.simple;

import lab8.Plant;

public class PineTree implements Plant {
    @Override
    public double getOxigenAmountPerYear() {
        return 250;
    }

    @Override
    public int getLifeTime() {
        return 10;
    }

    @Override
    public String getRepresentation() {
        return "P";
    }
}
