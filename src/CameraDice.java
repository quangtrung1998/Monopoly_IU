import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CameraDice extends JFrame implements ShowCamera{
	@Override
	public void change(int data) {
		repaint();
	}

	@Override
	public void shown() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
		setBounds(800, 343, 340, 342);
		setResizable(false);
		setTitle("DICE");
		CameraShowDice camerashowdice = new CameraShowDice();
		add(camerashowdice);
		setVisible(false);

	}

}
