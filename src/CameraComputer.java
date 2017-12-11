import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CameraComputer extends JFrame implements ShowCamera{
	private CameraShowComputer camerashowcomputer;
	/**
	 * 	Paint again
	 * @param 	
	 * @return 	clear table and paint again
	 */
		public CameraComputer() {
			repaint();
		}
		/**
		 * Change
		 * @param   data was put 
		 * @return 	data change and paint again
		 */
		@Override
		public void change(int a) {
			camerashowcomputer.change(a);
			repaint();
		}
		/**
		 * Show the frame and image in the frame
		 * @return 	the frame and image in the frame
		 */
		@Override
		public void shown(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(800, 343, 340, 342);
			setResizable(false);// Đặt JFrame có được thay đổi kích thước hay không
			setTitle("COMPUTER");
			camerashowcomputer = new CameraShowComputer();
			add(camerashowcomputer);
			setVisible(false);//Đặt JFrame ẩn/hiện
		}
}

