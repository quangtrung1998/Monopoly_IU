

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
	public void move1() {
		if(y1==590&&x1>385)
		{
			x1-=54;
			xa=1;
		}
		else if(x1==385)
			x1-=60;
		else if(x1==325&&y1==590)
		{
			y1-=72;
			xa=2;
		}
		else if(x1==325&&y1>86)
			y1-=54;
		else if(x1==325&&y1==86)
			y1-=72;
		else if(y1==14&&x1<811)
		{
			x1+=54;
			xa=3;
		}
		else if(y1==14&&x1==811)
			x1+=60;
		else if(x1==871&&y1==14)
			y1+=72;
		else if(x1==871&&y1<518)
		{
			y1+=54;
			xa=4;
		}
		else if(x1==871&&y1==518)
			{
			y1+=72;
			xa=1;
			}
		}
	public Surface(MainGame game) { // MainGame game có hay không không quan trọng cho lắm cần coi kĩ khúc này
		this.game= game;
		repaint();// vẽ lại hình ảnh Nếu chỉ muốn vẽ lại 1 phần ta sử dụng phương thức:	repaint ( int x, int y,i nt width, int height )
	}
	/**
	 * Change
	 * @param   data was put 
	 * @return 	the change of camera show 
	 */
	@Override
    public void paint(Graphics g)
    {	
		g.drawImage(new ImageIcon("car4.png").getImage(),970, 20,40,40,null);
		g.drawImage(new ImageIcon("xe4.png").getImage(),970, 300,40,40,null);
    	g.drawImage(new ImageIcon("board.jpg").getImage(),300, 0,660,660,null);
    	g.drawImage(new ImageIcon("dice"+ChangeDice.getDiceleft()+".png").getImage(), 500, 200, 120, 120,null);
    	g.drawImage(new ImageIcon("dice"+ChangeDice.getDiceright()+".png").getImage(), 630, 200, 120, 120,null);
    	g.drawImage(new ImageIcon("car"+xa1+".png").getImage(), x, y, 60,60,null);
    	g.drawImage(new ImageIcon("xe"+xa+".png").getImage(), x1, y1, 50,50,null);
    	ya=ChangeDice.getDiceleft()+ChangeDice.getDiceright();
    	ya1=ChangeDice.getDiceleft()+ChangeDice.getDiceright();
    }
	/**
	 * get value location of player
	 * @return 	take value location of player
	 */
	public static int getYa() {
		return ya;
	}
	/**
	 * get value location of computer
	 * @return 	take value location of computer
	 */
	public static int getYa1() {
		return ya1;
	}
}
