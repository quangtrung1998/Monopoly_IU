import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Camera extends JFrame {
	public CameraShow camerashow;
	private CameraShowComputer camerashowcomputer;
		public Camera() {
			repaint();
		}
		public void change(int a) {
			camerashow.change(a);
			repaint();
		}
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
}
