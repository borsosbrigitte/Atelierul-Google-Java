//Borsos Brigitte GI1 EVH


package lab8.simple;

import lab8.Plant;

public class Flower implements Plant {
    @Override
    public double getOxigenAmountPerYear() {
        return 100;
    }

    @Override
    public int getLifeTime() {
        return 3;
    }

    @Override
    public String getRepresentation() {
        return "F";
    }
}
