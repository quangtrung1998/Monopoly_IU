import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

<<<<<<< HEAD
@SuppressWarnings("serial")
=======
>>>>>>> df75969e9ed26b45e4aea928ecd9515086f867cd
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
		paint1(g,"menugame2.jpg",0,0,800,800);
		
    }
	@Override
	public void change(int changeimage) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
		
>>>>>>> df75969e9ed26b45e4aea928ecd9515086f867cd
	}
}
