import java.awt.Graphics;
public interface Image {
//	Interface chỉ ra đời vì lý do trong Java ko được thừa kế nhiều lớp. còn implements thì thoải mái. 
	/**
	 * Change
	 * @param   changeimage : value input 
	 * @return 	data change
	 */
	 public void change(int changeimage);
	 /**
		 * 	Draw Image
		 * @param 	g : Graphics g
		 * @param 	path : address image
		 * @param 	x : location horizontal 
		 * @param	y : location vertical 
		 * @param	width : value of width
		 * @param	height : value of height
		 * @return 	show the image in the frame
		 */
	 public void paint1(Graphics g,String path,int x,int y,int width,int height);
	/**
	 * 	Draw Image
	 * @param 	g : Graphis g
	 * @return 	show the image in the frame
	 */
	 public void paint(Graphics g);
}
