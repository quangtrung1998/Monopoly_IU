import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BackgroundMenugame extends JPanel implements Image{
	/**
	 * 	Paint again
	 * @param 	
	 * @return 	clear table and paint again
	 */
	public BackgroundMenugame() {
		repaint();
	}
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
	@Override
	public void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null); // getImage() trả về giá trị của icon 
	}
	/**
	 * 	Draw Image
	 * @param 	Graphics g 
	 * @return 	show the image in the frame
	 */
	@Override
	public void paint(Graphics g)
    {
		paint1(g,"menugame2.jpg",0,0,800,800);
		
    }
	@Override
	public void change(int changeimage) {
	}
}
