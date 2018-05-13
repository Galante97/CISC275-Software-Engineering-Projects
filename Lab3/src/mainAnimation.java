import java.awt.Color;

import javax.swing.JFrame;

public class mainAnimation {
	public static void main(String[] args) {

		AnimationModel model = new AnimationModel();
		AnimationView view = new AnimationView();

		AnimationController controller = new AnimationController(model, view);

		// layout and components
		JFrame frame = new JFrame();
		frame.getContentPane().add(controller.getAnimationView());
		frame.setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(controller.getFrameWidth(), controller.getFrameHeight());
		frame.setVisible(true);

		for (int i = 0; i < 1000; i++) {

			controller.updateView();
			view.setGraphic(controller.getCurrentImage(), controller.getXloc(), controller.getYloc());
			frame.repaint();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
