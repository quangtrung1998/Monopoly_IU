import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImageCommunityChest extends JPanel implements Image{
	private static int changeimage;
	public ImageCommunityChest() {
		repaint();
	}
	/**
	 * Change
	 * @param   data was put 
	 * @return 	the change of camera show 
	 */
	public void change(int changeimage) {	
		ImageCommunityChest.changeimage=changeimage;
	}
	/**
	 * Show the frame and image in the frame
	 * @return 	the frame and image in the frame
	 */
	@Override
	public void paint(Graphics g)
    {
		g.drawImage(new ImageIcon(changeimage+".jpg").getImage(),0, 0,340,310,null);
    }
	@Override
	public void paint1(Graphics g, String path, int x, int y, int width, int height) {
		  throw new UnsupportedOperationException();
	}

}
