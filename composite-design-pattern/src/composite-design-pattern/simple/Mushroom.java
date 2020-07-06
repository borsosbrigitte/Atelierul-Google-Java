//Borsos Brigitte GI1 EVH


package lab8.simple;

import lab8.Plant;

public class Mushroom implements Plant {
    @Override
    public double getOxigenAmountPerYear() {
        return 50;
    }

    @Override
    public int getLifeTime() {
        return 2;
    }

    @Override
    public String getRepresentation() {
        return "M";
    }
}
