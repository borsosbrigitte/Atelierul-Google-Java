//Borsos Brigitte GI1 EVH


package lab8.composite;

import lab8.Plant;

import java.util.ArrayList;
import java.util.List;

public class Forest implements Plant {

    private List<Plant> forest =  new ArrayList<>();

    @Override
    public double getOxigenAmountPerYear() {
        double oxygen = 0 ;
        for(Plant p : forest){
            oxygen = oxygen + p.getOxigenAmountPerYear();
        }

        return oxygen;
    }

    @Override
    public int getLifeTime() {
        int year, max = 0;
        for(Plant p: forest){
            year = p.getLifeTime();
            if (year > max)
                max = year;
        }

        return max;
    }

    @Override
    public String getRepresentation() {
        StringBuilder repr = new StringBuilder("{");
        for(Plant p: forest){
            repr.append(p.getRepresentation() + ", ");
        }
        repr.setCharAt(repr.length() - 2, '}');

        return repr.toString().substring(0, repr.length() - 1);
    }

    public void add(Plant add){
        forest.add(add);
    }

    public void remove(Plant remove){
        forest.remove(remove);
    }
}
