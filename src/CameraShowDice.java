import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CameraShowDice extends JPanel implements Image{

	public CameraShowDice() {
		repaint();
	}
	@Override
	public void change(int changeimage) {
		
	}

	@Override
	public void paint1(Graphics g, String path, int x, int y, int width, int height) {
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
		
	}
	@Override
	public void paint(Graphics g)
    {
		paint1(g,"dice"+ChangeDice.getDiceleft()+".png",0,60,180,180);
		paint1(g,"dice"+ChangeDice.getDiceright()+".png",170,60,180,180);
    }
}
