import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AnimationModel {

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
	Image currentImage;

	// Constructor: get image, segment and store in array
	public AnimationModel() {
		BufferedImage[] img = new BufferedImage[totalDirections]; // makes array of the images of each direction
		String[] files = { "orc_forward_southeast.png", "orc_forward_southwest.png", "orc_forward_northeast.png",
				"orc_forward_northwest.png", "orc_forward_east.png", "orc_forward_west.png", "orc_forward_north.png",
				"orc_forward_south.png", };

		for (int i = 0; i < totalDirections; i++) {
			img[i] = createImage(files[i]);
		}

		pics = new BufferedImage[totalDirections][10]; // makes matrix of images of each direction and subimages
		for (int i = 0; i < 8; i++) { // amount of pictures in img array
			for (int j = 0; j < frameCount; j++) { // amount of subimages
				pics[i][j] = img[i].getSubimage(imgWidth * j, 0, imgWidth, imgHeight);
				// imgs aligned with their subimages
			}
		}
	}

	// Read image from file and return
	private BufferedImage createImage(String s) {
		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(new File(s));
			return bufferedImage;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Image getCurrentImage() {
		currentImage = pics[direction][picNum];
		return currentImage;
	}

	public void setCurrentImage(Image currentImage) {
		this.currentImage = currentImage;
	}

	public int getPicNum() {
		return picNum;
	}

	public void setPicNum(int picNum) {
		this.picNum = picNum;
	}

	public BufferedImage[][] getPics() {
		return pics;
	}

	public void setPics(BufferedImage[][] pics) {
		this.pics = pics;
	}

	public int getXloc() {
		return xloc;
	}

	public void setXloc(int xloc) {
		this.xloc = xloc;
	}

	public int getYloc() {
		return yloc;
	}

	public void setYloc(int yloc) {
		this.yloc = yloc;
	}

	public void setxIncr(int xIncr) {
		this.xIncr = xIncr;
	}

	public void setyIncr(int yIncr) {
		this.yIncr = yIncr;
	}

	public int getFrameCount() {
		return frameCount;
	}

	public int getxIncr() {
		return xIncr;
	}

	public int getyIncr() {
		return yIncr;
	}

	public static int getFramewidth() {
		return frameWidth;
	}

	public static int getFrameheight() {
		return frameHeight;
	}

	public static int getImgwidth() {
		return imgWidth;
	}

	public static int getImgheight() {
		return imgHeight;
	}

	public int getEAST() {
		return EAST;
	}

	public int getWEST() {
		return WEST;
	}

	public int getNORTH() {
		return NORTH;
	}

	public int getSOUTH() {
		return SOUTH;
	}

	public int getNORTHWEST() {
		return NORTHWEST;
	}

	public int getSOUTHEAST() {
		return SOUTHEAST;
	}

	public int getSOUTHWEST() {
		return SOUTHWEST;
	}

	public int getNORTHEAST() {
		return NORTHEAST;
	}

	public int getTotalDirection() {
		return totalDirections;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
