//Borsos Brigitte GI1 EVH


package lab8.simple;

import lab8.Plant;

public class Grass implements Plant {
    @Override
    public double getOxigenAmountPerYear() {
        return 200;
    }

    @Override
    public int getLifeTime() {
        return 5;
    }

    @Override
    public String getRepresentation() {
        return "G";
    }
}
