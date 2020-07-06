//Borsos Brigitte GI1 EVH

package pizzaIngredients;

import pizzaBase.Pizza;
import pizzaBase.PizzaIngredients;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Olive extends PizzaIngredients{
    private BufferedImage img;
    private int price;
    private String ingredients;

    public Olive(Pizza pizza) {
        super(pizza);

        this.price=4;
        this.ingredients=", olive";

        try{
            img= ImageIO.read(new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\pizzaIngredients\\olive.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void bake(Graphics g) {
        super.bake(g);
        g.drawImage(img,0,20,null);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+this.price;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+this.ingredients;
    }

    public void addOlive(Graphics g){
        this.price=this.price+4;
        Integer x=this.price/4;

        this.ingredients=this.ingredients+"x"+x.toString();

        g.drawImage(img,0,0,null);
    }
}
