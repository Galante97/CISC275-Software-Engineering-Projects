
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    private Image bardejov;

    public Board() {

        initBoard();
        System.out.println("board Constructor");

    }
    
    private void initBoard() {

        loadImage();
        
        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadImage() {
    		System.out.println("loadImage");
        ImageIcon ii = new ImageIcon("blueBubble.png");
        bardejov = ii.getImage();        
    }

    @Override
    public void paintComponent(Graphics g) {
    	System.out.println("paintComponent");
        g.drawImage(bardejov, 0, 0, null);
    }
}