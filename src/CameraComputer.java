import javax.swing.JFrame;

public class CameraComputer extends JFrame {
	private CameraShowComputer camerashowcomputer;
		public CameraComputer() {
			
			repaint();
		}
		public void change(int a) {
			camerashowcomputer.change(a);
			repaint();
		}
		public void Show(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(1557, 518, 340, 342);
			setResizable(false);
			setTitle("COMPUTER");
			camerashowcomputer = new CameraShowComputer();
			add(camerashowcomputer);
			setVisible(true);
		}
}

