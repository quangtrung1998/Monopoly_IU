import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CameraShowComputer extends JPanel implements Image{
	private static int changeimage;
	private static BuyHouse buyhouse;
	/**
	 * Change
	 * @return 	data change and paint again
	 */
	public CameraShowComputer() {
		repaint();
	}
	/**
	 * Change
	 * @param   changeimage : value input 
	 * @return 	data change
	 */
	public void change(int changeimage) {
		CameraShowComputer.changeimage=changeimage;
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
	public void paint1(Graphics g,String path,int x,int y,int width,int height) {
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	/**
	 * 	Draw Image
	 * @param 	Graphics g 
	 * @return 	show the image in the frame
	 */
	@SuppressWarnings("static-access")
	@Override
	public void paint(Graphics g)
    {
		paint1(g,changeimage+".jpg",0,0,340,310);
		if(buyhouse.getBuy()[1][changeimage]==1) {
			paint1(g,"house.png",120, 120,60,60);
			
		}
		else if(buyhouse.getBuy()[1][changeimage]==2) {
			paint1(g,"house.png",90, 120,60,60);
			paint1(g,"house.png",150, 120,60,60);
		}
		else if(buyhouse.getBuy()[1][changeimage]==3) {
			paint1(g,"house.png",90, 120,60,60);
			paint1(g,"house.png",150, 120,60,60);
			paint1(g,"house.png",210, 120,60,60);
		}
		else if(buyhouse.getBuy()[1][changeimage]==4) {
			paint1(g,"hotel.png",120, 120,60,60);
		}
		else if(buyhouse.getBuy()[2][changeimage]==1) {
			paint1(g,"housecomputer.png",120, 120,60,60);
		}
		else if(buyhouse.getBuy()[2][changeimage]==2) {
			paint1(g,"housecomputer.png",90, 120,60,60);
			paint1(g,"housecomputer.png",150, 120,60,60);
		}
		else if(buyhouse.getBuy()[2][changeimage]==3) {
			paint1(g,"housecomputer.png",90, 120,60,60);
			paint1(g,"housecomputer.png",150, 120,60,60);
			paint1(g,"housecomputer.png",210, 120,60,60);
		}
		else if(buyhouse.getBuy()[2][changeimage]==4) {
			paint1(g,"hotelcomputer.png",120, 120,60,60);
		}
    }
}