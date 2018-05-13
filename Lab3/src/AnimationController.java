
import java.awt.Image;
import java.awt.image.BufferedImage;

public class AnimationController {
	private AnimationModel model;
	private AnimationView view;

	public AnimationController(AnimationModel model, AnimationView view) {
		this.model = model;
		this.view = view;
	}

	public void updateView() {
		// 4 different cases for the 4 possible directions
		if (getXloc() + getImgWidth() > getFrameWidth()) {

			if (getyIncr() > 0) {
				setDirection(getSOUTHWEST());
			} else {
				setDirection(getNORTHWEST());
			}
			setxIncr(getxIncr() * -1);

		} else if (getXloc() < 0) {
			if (getyIncr() > 0) {
				setDirection(getSOUTHEAST());

			} else {
				setDirection(getNORTHEAST());
			}
			setxIncr(getxIncr() * -1);
		}
		if (getYloc() + getImgHeight() > getFrameHeight()) {
			if (getxIncr() > 0) {
				setDirection(getNORTHEAST());
			} else {
				setDirection(getNORTHWEST());
			}
			setyIncr(getyIncr() * -1);
		} else if (getYloc() < 0) {
			if (getxIncr() > 0) {
				setDirection(getSOUTHEAST());
			} else {
				setDirection(getSOUTHWEST());

			}
			setyIncr(getyIncr() * -1);
		}

		setPicNum((getPicNum() + 1) % getFrameCount());

		setXloc(getXloc() + getxIncr());
		setYloc(getYloc() + getyIncr());
		setPics(getPics());
	}

	public AnimationView getAnimationView() {
		return view;
	}

	public Image getCurrentImage() {
		return model.getCurrentImage();
	}

	public void setCurrentImage(Image currentImage) {
		model.setCurrentImage(currentImage);
	}

	public int getPicNum() {
		return model.getPicNum();
	}

	public void setPicNum(int picNum) {
		model.setPicNum(picNum);
	}

	public BufferedImage[][] getPics() {
		return model.getPics();
	}

	public void setPics(BufferedImage[][] pics) {
		model.setPics(pics);
	}

	public int getXloc() {
		return model.getXloc();
	}

	public void setXloc(int xloc) {
		model.setXloc(xloc);
	}

	public void setxIncr(int xIncr) {
		model.setxIncr(xIncr);
	}

	public void setyIncr(int yIncr) {
		model.setyIncr(yIncr);
	}

	public int getYloc() {
		return model.getYloc();
	}

	public void setYloc(int yloc) {
		model.setYloc(yloc);
	}

	public int getFrameCount() {
		return model.getFrameCount();
	}

	public int getxIncr() {
		return model.getxIncr();
	}

	public int getyIncr() {
		return model.getyIncr();

	}

	public int getFrameWidth() {
		return model.getFramewidth();
	}

	public int getFrameHeight() {
		return model.getFrameheight();
	}

	public int getImgWidth() {
		return model.getImgwidth();
	}

	public int getImgHeight() {
		return model.getImgheight();
	}

	public int getEAST() {
		return model.getEAST();
	}

	public int getWEST() {
		return model.getWEST();
	}

	public int getNORTH() {
		return model.getNORTH();
	}

	public int getSOUTH() {
		return model.getSOUTH();
	}

	public int getNORTHWEST() {
		return model.getNORTHWEST();
	}

	public int getSOUTHEAST() {
		return model.getSOUTHEAST();
	}

	public int getSOUTHWEST() {
		return model.getSOUTHWEST();
	}

	public int getNORTHEAST() {
		return model.getNORTHEAST();
	}

	public int getTotalDirection() {
		return model.getTotalDirection();
	}

	public int getDirection() {
		return model.getDirection();
	}

	public void setDirection(int direction) {
		model.setDirection(direction);
	}

}
