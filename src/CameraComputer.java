import javax.swing.JFrame;

public class CameraComputer extends JFrame {
	private CameraShowComputer camerashowcomputer;
		public CameraComputer() {
			repaint();
		}
		/**
		 * Change
		 * @param   data was put 
		 * @return 	data change and paint again
		 */
		public void change(int a) {
			camerashowcomputer.change(a);
			repaint();
		}
		/**
		 * Show the frame and image in the frame
		 * @return 	the frame and image in the frame
		 */
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

