import javax.swing.*;

public class Frame extends JFrame {
    public Frame(JPanel panel){
        super();
        this.setTitle("SpaceWar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
