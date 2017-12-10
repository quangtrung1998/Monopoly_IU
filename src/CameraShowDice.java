import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CameraShowDice extends JPanel implements Image{
	/**
	 * Change
	 * @return 	data change and paint again
	 */
	public CameraShowDice() {
		repaint();
	}
	/**
	 * Change
	 * @param   changeimage : value input 
	 * @return 	data change
	 */
	@Override
	public void change(int changeimage) {
		
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
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	/**
	 * 	Draw Image
	 * @param 	Graphics g 
	 * @return 	show the image in the frame
	 */
	@Override
	public void paint(Graphics g)
    {
		paint1(g,"dice"+ChangeDice.getDiceleft()+".png",0,60,180,180);
		paint1(g,"dice"+ChangeDice.getDiceright()+".png",170,60,180,180);
    }
}
