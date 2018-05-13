import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class AnimationView extends JPanel {
	Image image;
	int xloc;
	int yloc;

	public void paint(Graphics g) {
		g.drawImage(image, xloc, yloc, Color.gray, this);

	}

	public void setGraphic(Image image, int xloc, int yloc) {
		this.image = image;
		this.xloc = xloc;
		this.yloc = yloc;
	}

}
