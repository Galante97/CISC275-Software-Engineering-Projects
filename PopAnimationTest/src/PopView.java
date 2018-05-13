import javax.swing.JFrame;

public class PopView extends JFrame {
	JFrame frame;

	public PopView(JFrame f) {
		this.frame = f;
		initUI();
	}

	private void initUI() {

		add(new Bubble());
	
		setTitle("test");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	
	

	
}
