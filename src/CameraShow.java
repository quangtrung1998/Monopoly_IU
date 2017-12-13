import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CameraShow extends JPanel implements Image{
	private static int changeimage;
	private static final String list[] = {"house.png","hotel.png","housecomputer.png","hotelcomputer.png"};
	/**
	 * Change
	 * @return 	data change and paint again
	 */
	public CameraShow() {
		repaint();
	}
	/**
	 * Change
	 * @param   changeimage : value input 
	 * @return 	data change
	 */
	public void change(int changeimage) {	
		CameraShow.changeimage=changeimage;
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
	public void paint1(Graphics g,String path,int x,int y,int width,int height) { // create function to save time 
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}/**
	 * 	Draw Image
	 * @param 	Graphics g 
	 * @return 	show the image in the frame
	 */
	@Override
	public void paint(Graphics g)
    {
		paint1(g,changeimage+".jpg",0,0,340,310);
		if(BuyHouse.getBuy()[1][changeimage]==1) {
			paint1(g,list[0],120, 120,60,60);
			
		}
		else if(BuyHouse.getBuy()[1][changeimage]==2) {
			paint1(g,list[0],90, 120,60,60);
			paint1(g,list[0],150, 120,60,60);
		}
		else if(BuyHouse.getBuy()[1][changeimage]==3) {
			paint1(g,list[0],90, 120,60,60);
			paint1(g,list[0],150, 120,60,60);
			paint1(g,list[0],210, 120,60,60);
		}
		else if(BuyHouse.getBuy()[1][changeimage]==4) {
			paint1(g,list[1],120, 120,60,60);
		}
		else if(BuyHouse.getBuy()[2][changeimage]==1) {
			paint1(g,list[2],120, 120,60,60);
		}
		else if(BuyHouse.getBuy()[2][changeimage]==2) {
			paint1(g,list[2],90, 120,60,60);
			paint1(g,list[2],150, 120,60,60);
		}
		else if(BuyHouse.getBuy()[2][changeimage]==3) {
			paint1(g,list[2],90, 120,60,60);
			paint1(g,list[2],150, 120,60,60);
			paint1(g,list[2],210, 120,60,60);
		}
		else if(BuyHouse.getBuy()[2][changeimage]==4) {
			paint1(g,list[3],120, 120,60,60);
		}
    }
}
