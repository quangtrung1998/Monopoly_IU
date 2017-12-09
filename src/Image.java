import java.awt.Graphics;
public interface Image {
	/**
	 * Change
	 * @param   data was put 
	 * @return 	data change
	 */
	 void change(int changeimage);
	/**
	 * 	Draw Image
	 * @param 	Graphics g , address image, location horizontal , location vertical , width , height 
	 * @return 	show the image in the frame
	 */
	 void paint1(Graphics g,String path,int x,int y,int width,int height);
	/**
	 * 	Draw Image
	 * @param 	Graphics g 
	 * @return 	show the image in the frame
	 */
	 void paint(Graphics g);
}
