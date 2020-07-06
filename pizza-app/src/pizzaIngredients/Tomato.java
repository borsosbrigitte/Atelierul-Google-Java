//Borsos Brigitte GI1 EVH

package pizzaIngredients;

import pizzaBase.Pizza;
import pizzaBase.PizzaIngredients;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tomato extends PizzaIngredients {
    private BufferedImage img;
    private int price;
    private String ingredients;


    public Tomato(Pizza pizza) {
        super(pizza);
        this.price=6;
        this.ingredients=", tomato";

        try{
            img= ImageIO.read(new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\pizzaIngredients\\tomato.png"));
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void bake(Graphics g) {
        super.bake(g);
        g.drawImage(img,0,0,null);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+this.price;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+this.ingredients;
    }

    public void addTomato(Graphics g){
        this.price = this.price + 6;
        Integer x = this.price / 6;

        this.ingredients = this.ingredients + "x" + x.toString();

        g.drawImage(img, 0, 0, null);
    }
}
