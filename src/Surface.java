
import java.awt.Graphics;


import javax.swing.ImageIcon;

import javax.swing.JPanel;

class Surface extends JPanel {

	private static final long serialVersionUID = -5843034358426716656L;
	private static int xplayer = 871;
	private static int yplayer = 590;
	private static int xa = 1;
	private static int xa1=1;
	private static int ya = 1;
	private static int xcomputer=871;
	private static int ycomputer=590;
	public static void setXplayer(int xplayer) {
		Surface.xplayer = xplayer;
	}
	public static void setYplayer(int yplayer) {
		Surface.yplayer = yplayer;
	}
	public static void setXa(int xa) {
		Surface.xa = xa;
	}
	public static void setXa1(int xa1) {
		Surface.xa1 = xa1;
	}
	public static void setYa(int ya) {
		Surface.ya = ya;
	}
	public static void setXcomputer(int xcomputer) {
		Surface.xcomputer = xcomputer;
	}
	public static void setYcomputer(int ycomputer) {
		Surface.ycomputer = ycomputer;
	}
	public static void setYa1(int ya1) {
		Surface.ya1 = ya1;
	}
	private static int ya1=1;
	/**
	 * Change the location of vertical and horizontal of player in the board
	 * @return 	Change the location of vertical and horizontal
	 */
	public void movePlayer() {
		if(yplayer==590&&xplayer>385)
		{
		xplayer-=54;//a*9/200
		xa1=1;
		}
		else if(xplayer==385)
		xplayer-=60; // a/20
		else if(xplayer==325&&yplayer==590)
		{
			yplayer-=72; //b*72/695
			xa1=2;
		}
		else if(xplayer==325&&yplayer>86)
		yplayer-=54;
		else if(xplayer==325&&yplayer==86)
		yplayer-=72;
		else if(yplayer==14&&xplayer<811)
		{
			xplayer+=54;
			xa1=3;
		}
		else if(yplayer==14&&xplayer==811)
		xplayer+=60;
		else if(xplayer==871&&yplayer==14)
		yplayer+=72;
		else if(xplayer==871&&yplayer<518)
		{
			yplayer+=54;
			xa1=4;
		}
		else if(xplayer==871&&yplayer==518)
		{
			yplayer+=72;
			xa1=1;
		}
	}
	/**
	 * Change the location of vertical and horizontal of computer in the board
	 * @return 	Change the location of vertical and horizontal
	 */
	public void moveComputer() {
		if(ycomputer==590&&xcomputer>385)
		{
			xcomputer-=54;
			xa=1;
		}
		else if(xcomputer==385)
			xcomputer-=60;
		else if(xcomputer==325&&ycomputer==590)
		{
			ycomputer-=72;
			xa=2;
		}
		else if(xcomputer==325&&ycomputer>86)
			ycomputer-=54;
		else if(xcomputer==325&&ycomputer==86)
			ycomputer-=72;
		else if(ycomputer==14&&xcomputer<811)
		{
			xcomputer+=54;
			xa=3;
		}
		else if(ycomputer==14&&xcomputer==811)
			xcomputer+=60;
		else if(xcomputer==871&&ycomputer==14)
			ycomputer+=72;
		else if(xcomputer==871&&ycomputer<518)
		{
			ycomputer+=54;
			xa=4;
		}
		else if(xcomputer==871&&ycomputer==518)
			{
			ycomputer+=72;
			xa=1;
			}
		}
	public Surface(MainGame game) { // MainGame game có hay không không quan trọng cho lắm cần coi kĩ khúc này
		repaint();// vẽ lại hình ảnh Nếu chỉ muốn vẽ lại 1 phần ta sử dụng phương thức:	repaint ( int x, int y,i nt width, int height )
	}
	/**
	 * Change
	 * @param   data was put 
	 * @return 	the change of camera show 
	 */
	@Override
    public void paint(Graphics g)
    {	g.drawImage(new ImageIcon("background1.png").getImage(),0, 0, 1200, 695,null);
		g.drawImage(new ImageIcon("car4.png").getImage(),970, 20,40,40,null);
		g.drawImage(new ImageIcon("xe4.png").getImage(),970, 300,40,40,null);
    	g.drawImage(new ImageIcon("board.jpg").getImage(),300, 0,1200*11/20,660,null);
    	g.drawImage(new ImageIcon("car"+xa1+".png").getImage(), xplayer, yplayer, 60,60,null);
    	g.drawImage(new ImageIcon("xe"+xa+".png").getImage(), xcomputer, ycomputer, 50,50,null);
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