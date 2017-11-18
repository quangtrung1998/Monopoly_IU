
import java.awt.Graphics;






import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;




class Surface extends JPanel {

	
	private static final long serialVersionUID = -5843034358426716656L;
	public static int x = 871, y = 590,xa = 1, xa1=1, ya = 1,x1=871,y1=590,ya1=1;
	private MainGame game;
	public void move() {
		if(y==590&&x>385)
		{
			x-=54;
			xa1=1;
		}
		else if(x==385)
		x-=60;
		else if(x==325&&y==590)
		{
			y-=72;
			xa1=2;
		}
		else if(x==325&&y>86)
		y-=54;
		else if(x==325&&y==86)
		y-=72;
		else if(y==14&&x<811)
		{
			x+=54;
			xa1=3;
		}
		else if(y==14&&x==811)
		x+=60;
		else if(x==871&&y==14)
		y+=72;
		else if(x==871&&y<518)
		{
			y+=54;
			xa1=4;
		}
		else if(x==871&&y==518)
		{
			y+=72;
			xa1=1;
		}
	}
}
