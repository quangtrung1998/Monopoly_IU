
import javax.swing.JFrame;

<<<<<<< HEAD
@SuppressWarnings("serial")
=======
>>>>>>> df75969e9ed26b45e4aea928ecd9515086f867cd
public class Camera extends JFrame implements ShowCamera{
	private CameraShow camerashow;
	public Camera() {
			repaint();
		}
		/**
		 * Change
		 * @param   data was put 
		 * @return 	the change of camera show and paint again
		 */
<<<<<<< HEAD
	@Override
	public void change(int data) {
		camerashow.change(data);
		repaint();
	}
	/**
	 * Show the frame and image in the frame
	 * @return 	the frame and image in the frame
	 */
	@Override
	public void shown(){//EXIT_ON_CLOSE (3) – Đóng toàn bộ các frame liên quan tới nó.
		//DO_NOTHING_ON_CLOSE (0) – không làm gì cả
		// HIDE_ON_CLOSE (1) – Khi đóng frame sẽ bị ẩn đi chứ hoàn toàn không đóng lại.
		//Hàm setVisible đặt chế độ hiển thị cho frame. Nếu không gọi hoặc đặt giá trị false cho hàm này thì frame sẽ không được hiển thị.
		//Hàm setLocation đặt vị trí xuất hiện của frame trên màn hình. Nếu muốn frame xuất hiện chính giữa màn hình ta dùng hàm setLocationRelativeTo(null)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
		setBounds(800, 343, 340, 342);
		setResizable(false);
		setTitle("PLAYER");
		camerashow = new CameraShow();
		add(camerashow);
		setVisible(false);
	}
=======
		@Override
		public void change(int data) {
			camerashow.change(data);
			repaint();
		}
		/**
		 * Show the frame and image in the frame
		 * @return 	the frame and image in the frame
		 */
		@Override
		public void Show(){//EXIT_ON_CLOSE (3) – Đóng toàn bộ các frame liên quan tới nó.
			//DO_NOTHING_ON_CLOSE (0) – không làm gì cả
			// HIDE_ON_CLOSE (1) – Khi đóng frame sẽ bị ẩn đi chứ hoàn toàn không đóng lại.
			//Hàm setVisible đặt chế độ hiển thị cho frame. Nếu không gọi hoặc đặt giá trị false cho hàm này thì frame sẽ không được hiển thị.
			//Hàm setLocation đặt vị trí xuất hiện của frame trên màn hình. Nếu muốn frame xuất hiện chính giữa màn hình ta dùng hàm setLocationRelativeTo(null)
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
			setBounds(1557, 173, 340, 340);
			setResizable(false);
			setTitle("PLAYER");
			camerashow = new CameraShow();
			add(camerashow);
			setVisible(true);
		}
>>>>>>> df75969e9ed26b45e4aea928ecd9515086f867cd
}
