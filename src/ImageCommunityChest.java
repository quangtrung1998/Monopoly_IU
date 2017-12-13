import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageCommunityChest extends JPanel implements Image{
	private static int changeimage;
	/**
	 * Change
	 * @return 	data change and paint again
	 */
	public ImageCommunityChest() {
		repaint();
	}
	/**
	 * Change
	 * @param   changeimage : value input 
	 * @return 	the change of camera show 
	 */
	public void change(int changeimage) {	
		ImageCommunityChest.changeimage=changeimage;
	}
	/**
	 * Show the frame and image in the frame
	 * @param g : Graphics g
	 * @return 	the frame and image in the frame
	 */
	@Override
	public void paint(Graphics g)
    {
		g.drawImage(new ImageIcon(changeimage+".jpg").getImage(),0, 0,340,310,null);
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
	public void paint1(Graphics g, String path, int x, int y, int width, int height) {
	}

}
