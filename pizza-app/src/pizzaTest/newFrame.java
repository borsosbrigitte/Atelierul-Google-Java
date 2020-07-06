//Borsos Brigitte GI1 EVH

package pizzaTest;

import pizzaBase.Pizza;
import pizzaBase.PizzaBase;
import pizzaIngredients.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;


public class newFrame {

    private JMenuBar menuBar;
    JPanel receptes;
    private Pizza recept;

    public newFrame() {
        Pizza p1 = new PizzaBase();

        Pizza pizza1 = new Olive(new PizzaBase());
        Pizza pizza2 = new Corn(new Salami(new PizzaBase()));
        Pizza pizza3 = new Salami(new Tomato(new Olive(new PizzaBase())));
        Pizza pizza4= new Corn(new Tomato(new Salami(new Olive(new PizzaBase()))));
        recept= p1;

        receptes = new Test(p1);

        JFrame frame = new JFrame("Papa`s pizza");

        menuBar = new JMenuBar();

        JMenu choose = new JMenu("Menu");
        //choose.setMnemonic(KeyEvent.VK_F);
        menuBar.add(choose);

        JMenuItem fileLoad = new JMenuItem("Load");
        JMenuItem fileSave = new JMenuItem("Save");

        fileLoad.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\savedPizza\\Pizza1");
                JFileChooser fileChooser = new JFileChooser("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\savedPizza");
                fileChooser.showOpenDialog(null);
                File selectedFile = fileChooser.getSelectedFile();
                if (selectedFile.getName().equals("Pizza3")) {
                    file = new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\savedPizza\\Pizza3");
                    recept = pizza3;
                    System.out.println(selectedFile.getName());
                } else if (selectedFile.getName().equals("Pizza1")){
                    file = new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\savedPizza\\Pizza1");
                    System.out.println(selectedFile.getName());
                    recept = pizza1;
                }
                else if (selectedFile.getName().equals("Pizza2")) {
                    file = new File("C:\\Users\\brine\\Desktop\\Java Hw\\L12_test\\src\\savedPizza\\Pizza2");
                    System.out.println(selectedFile.getName());
                    recept = pizza2;
                }
                else if(selectedFile.getName().equals("Pizza4")){
                    file= new File("savedPizza/Pizza4");
                    System.out.println(selectedFile.getName());
                    recept = pizza4;
                }

                List<String> list = new ArrayList<String>();
                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader(file));
                    String text = null;
                    //temp = null;

                    while ((text = reader.readLine()) != null) {
                        list.add(text);
                    }
                } catch (FileNotFoundException d) {
                    d.printStackTrace();
                } catch (IOException f) {
                    f.printStackTrace();
                } finally {
                    try {
                        if (reader != null) {
                            reader.close();
                        }
                    } catch (IOException g) {
                    }
                }

                System.out.println(list);




                ((Test) receptes).setPizza(recept);
            }


        });

        fileSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JFileChooser fileChooser = new JFileChooser("savedPizza");

                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    byte data[] = recept.getIngredients().getBytes();

                    Path p = Paths.get("savedPizza" + selectedFile.getName());

                    try (OutputStream out = new BufferedOutputStream(
                            Files.newOutputStream(p, CREATE, APPEND))) {
                        out.write(data, 0, data.length);
                    } catch (IOException x) {
                        System.err.println(x);
                    }
                }
            }
        });

        choose.add(fileLoad);
        choose.add(fileSave);

        frame.setJMenuBar(menuBar);

        frame.add(receptes, BorderLayout.CENTER);
        frame.setBounds(10, 10, 600, 600);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new newFrame();
    }
}

