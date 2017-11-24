import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
	 * @param 	Graphics g , address image, location horizontal , location vertical , width , height 
	 * @return 	show the image in the frame
	 */
	@Override
	public void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
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
		paint1(g,"menugame.jpg",0,0,800,800);
    }
	@Override
	public void change(int changeimage) {
		// TODO Auto-generated method stub
		
	}
}
