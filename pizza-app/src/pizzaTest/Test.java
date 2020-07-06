//Borsos Brigitte GI1 EVH

package pizzaTest;

import java.awt.Graphics;

import javax.swing.JPanel;

import pizzaBase.Pizza;

public class Test extends JPanel{

    private static final long serialVersionUID = 1L;
    private Pizza pizza;

    public Test(Pizza pizza){
        this.pizza = pizza;
    }

    public void setPizza (Pizza pizza) {
        this.pizza = pizza;
        bake();
    }

    public void bake(){
        repaint();
    }

    @Override
    public void paint(Graphics g){
        pizza.bake(g);
    }

}
