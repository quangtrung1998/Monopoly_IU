import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundMenugame extends JPanel{
	private static BuyHouse buyhouse;

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
	private void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	/**
	 * 	Draw Image
	 * @param 	Graphics g , address image, location horizontal , location vertical , width , height 
	 * @return 	show the image in the frame
	 */

	public BackgroundMenugame() {
		repaint();
	}
	private void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	public void paint(Graphics g)
    {
		paint1(g,"menugame.jpg",0,0,800,800);
    }
}
