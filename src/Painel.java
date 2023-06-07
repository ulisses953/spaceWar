import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Painel extends JPanel {

    //private ArrayList<Meteoro> meteoros;

    public Painel(int width, int height){
        super();
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.black);
    }
    public Painel(){
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.drawRect(10,20,100,50);
    }

    @Override
    public void paintComponent(Graphics g){
        
    }

}
