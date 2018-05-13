import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Bubble extends JPanel {
	
	 private Image image;

	    public Bubble() {

	        initBoard();
	        System.out.println("board Constructor");

	    }
	    
	    private void initBoard() {

	        loadImage();
	        
	        int w = image.getWidth(this);
	        int h =  image.getHeight(this);
	        setPreferredSize(new Dimension(w, h));        
	    }
	    
	    private void loadImage() {
	    		System.out.println("loadImage");
	        ImageIcon ii = new ImageIcon("src/blueBubble.png");
	        image = ii.getImage();        
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	    	System.out.println("paintComponent");
	        g.drawImage(image, 0, 0, null);
	    }

}
