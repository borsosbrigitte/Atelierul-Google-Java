//Borsos Brigitte GI1 EVH

package pizzaBase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PizzaBase implements Pizza {
    private BufferedImage img;

    public PizzaBase() {
        try{
            img= ImageIO.read(new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\pizzaBase\\pizza_base.png"));
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void bake(Graphics g) {
        g.drawImage(img,5,25,null);
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "Pizza Base";
    }
}
