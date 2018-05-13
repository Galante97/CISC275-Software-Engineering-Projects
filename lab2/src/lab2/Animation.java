package lab2;


// JAMES GALANTE && OLIVIA LIEPA

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Animation extends JPanel {

	final int frameCount = 10;
	int picNum = 0;
	BufferedImage[][] pics;
	int xloc = 0;
	int yloc = 0;
	int xIncr = 13;
	int yIncr = 7;
	final static int frameWidth = 500;
	final static int frameHeight = 300;
	final static int imgWidth = 165;
	final static int imgHeight = 165;
	
	public static final int SOUTHEAST = 0;
	public static final int SOUTHWEST = 1;
	public static final int NORTHEAST = 2;
	public static final int NORTHWEST = 3;
	public static final int EAST = 4;
	public static final int WEST = 5;
	public static final int NORTH = 6;
	public static final int SOUTH = 7;
	
	public static final int totalDirections = 8;
	
	static int direction;
	
	
	
	// Override this JPanel's paint method to cycle through picture array and draw
	// images
	public void paint(Graphics g) {
		
		// 4 different cases for the 4 possible directions
		if(xloc + imgWidth > frameWidth) {
			if(yIncr > 0) {
				direction = SOUTHWEST;			
			}
			else {
				direction = NORTHWEST;
			}
			xIncr *= -1;
		}
		else if(xloc < 0) {
			if (yIncr > 0) {
				direction = SOUTHEAST;
			}
			else {
				direction = NORTHEAST;
			}
			xIncr *= -1;
		}
		if(yloc +imgHeight > frameHeight) {
			if(xIncr > 0) {
				direction = NORTHEAST;		
			}
			else {
				direction = NORTHWEST;			
			}
			yIncr *= -1;
		}
		else if(yloc < 0) {
			if(xIncr > 0) {
				direction = SOUTHEAST;		
			}
			else {
				direction = SOUTHWEST;
				
			}
			yIncr *= -1;
		}
		picNum = (picNum + 1) % frameCount;
		g.drawImage(pics[direction][picNum], xloc += xIncr, yloc += yIncr, Color.gray, this);

	}

	// Make frame, loop on repaint and wait
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Component movingAnimation = new Animation();
		
		frame.getContentPane().add(movingAnimation);
		frame.setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frameWidth, frameHeight);
		frame.setVisible(true);
		
		for (int i = 0; i < 1000; i++) {
			frame.repaint();
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

	// Constructor: get image, segment and store in array
			public Animation() {
				BufferedImage[] img = new BufferedImage[totalDirections]; //makes array of the images of each direction
				String[] files = {"orc_forward_southeast.png","orc_forward_southwest.png","orc_forward_northeast.png","orc_forward_northwest.png","orc_forward_east.png","orc_forward_west.png","orc_forward_north.png","orc_forward_south.png",};
				
				for(int i = 0; i < totalDirections; i++) {
					img[i] = createImage(files[i]);
				}
				
				pics = new BufferedImage[totalDirections][10]; //makes matrix of images of each direction and subimages
				for(int i = 0; i < 8; i++) { //amount of pictures in img array
					for (int j = 0; j < frameCount; j++) { //amount of subimages
						pics[i][j] = img[i].getSubimage(imgWidth * j, 0, imgWidth, imgHeight);
						//imgs aligned with their subimages
						}	
					}
			}
	

	// Read image from file and return
	  private BufferedImage createImage(String s){
	    	BufferedImage bufferedImage;
	    	try {
	    		bufferedImage = ImageIO.read(new File(s));
	    		return bufferedImage;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	return null;
	    }
	}
