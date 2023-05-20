import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Painel extends JPanel {

    //private ArrayList<Meteoro> meteoros;

    public Painel(int width, int height){
        super();
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.black);
        Meteoro met1 = new Meteoro();


    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }



}
