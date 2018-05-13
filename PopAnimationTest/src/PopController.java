import javax.swing.JFrame;

public class PopController {
	
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PopModel model = new PopModel();// will ask for difficulty
		PopView view = new PopView(frame); // creates the window

		
		//view.draw();
		view.setVisible(true);
	}

}
