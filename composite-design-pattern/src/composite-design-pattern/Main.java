//Borsos Brigitte GI1 EVH


package lab8;

import lab8.simple.*;
import lab8.composite.*;

public class Main {
    public static void main(String[] args) {
        //  {[G, F], [M, M], P, O}

        Grass grass = new Grass();
        Flower flower = new Flower();
        Mushroom mushroom1 = new Mushroom();
        Mushroom mushroom2 = new Mushroom();
        PineTree pineTree = new PineTree();
        OakTree oakTree = new OakTree();

        Field field1 = new Field();
        field1.add(grass);
        field1.add(flower);

        Field field2 = new Field();
        field2.add(mushroom1);
        field2.add(mushroom2);

        Forest forest = new Forest();
        forest.add(field1);
        forest.add(field2);
        forest.add(pineTree);
        forest.add(oakTree);

        System.out.println("Forest representation:" + forest.getRepresentation());
        System.out.println("Forest oxygen production: " + forest.getOxigenAmountPerYear());
        System.out.println("Forest life time: " + forest.getLifeTime());

        System.out.println("First field oxygen production: " + field1.getOxigenAmountPerYear());
        System.out.println("First field life time: " + field1.getLifeTime());
        System.out.println("Second field oxygen production: " + field2.getOxigenAmountPerYear());
        System.out.println("Second field life time: " + field2.getLifeTime());
    }
}
