import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Meteoro  {
    private Painel panel;
    private int id;
    private int x;
    private int y;
    private Random random = new Random();
    public Meteoro(){
        //this.panel = panel;
        this.x = random.nextInt();
        this.y = random.nextInt();

        //paint(this.panel.getGraphics());


    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        g.drawOval(x,y,random.nextInt(30),random.nextInt(40));
        //this.panel.paintComponents(g);
    }

}
