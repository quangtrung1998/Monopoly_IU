import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CameraShow extends JPanel{
	private static int changeimage;
	public CameraShow() {
		repaint();
	}
	public void change(int changeimage) {	
		this.changeimage=changeimage;
	}
	private void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	public void paint(Graphics g)
    {
		paint1(g,changeimage+".jpg",0,0,340,310);
    }
}
