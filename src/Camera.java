
import javax.swing.JFrame;


public class Camera extends JFrame implements ShowCamera{
	private CameraShow camerashow;
	/**
	 * 	Paint again
	 * @return 	clear table and paint again
	 */
	public Camera() {	
			
		}
		/**
		 * Change
		 * @param   data : value input 
		 * @return 	the change of camera show and paint again
		 */
	@Override
	public void change(int data) {
		camerashow.change(data);
		repaint();// vẽ lại
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
}
