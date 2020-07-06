//Borsos Brigitte GI1 EVH


package lab8.composite;

import lab8.Plant;

import java.util.HashSet;
import java.util.Set;

public class Field implements Plant {
    private Set<Plant> field = new HashSet<>();

    @Override
    public double getOxigenAmountPerYear() {
        double oxygen = 0 ;
        for(Plant p : field){
            oxygen = oxygen + p.getOxigenAmountPerYear();
        }

        return oxygen;    }

    @Override
    public int getLifeTime() {
        int year, max = 0;
        for(Plant p: field){
            year = p.getLifeTime();
            if (year > max)
                max = year;
        }

        return max;

    }

    public void add(Plant add){
        field.add(add);
    }

    public void remove(Plant remove){
        field.remove(remove);
    }

    @Override
    public String getRepresentation() {
        StringBuilder repr = new StringBuilder("[");
        for(Plant p: field){
            repr.append(p.getRepresentation() + ", ");
        }
        repr.setCharAt(repr.length() - 2, ']');

        return repr.toString().substring(0, repr.length() - 1);
    }
}
