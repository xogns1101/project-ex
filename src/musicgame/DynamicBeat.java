package musicgame;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {

    private Image screenImage;
    private Graphics screenGraphics;

    private Image introBackground;

    public DynamicBeat() {
        setTitle("musicgame.DynamicBeat");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg.jpeg")).getImage();

    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        screenGraphics = screenImage.getGraphics();
        screenDraw(screenGraphics);
        g.drawImage(screenImage,0,0,null);

    }

    private void screenDraw(Graphics g) {
        g.drawImage(introBackground,0,0,null);
        this.repaint();
    }

}
