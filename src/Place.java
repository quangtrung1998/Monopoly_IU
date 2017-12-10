

import java.awt.Color;

public class Place {
	private static int locate;
	private static int priceini;
	private static int price1;
	private static int price2;
	private static int price3;
	private static int villa;
	private int nameplace;
	private Color color;
	public void setLocate(int locate) {
		Place.locate = locate;
	}
	/**
	 * get value nameplace
	 * @return 	take value nameplace
	 */
	public int getNameplace() {
		return nameplace;
	}
	/**
	 * get value priceini
	 * @return 	take value priceini
	 */
	public static int  getPriceini() {
		return priceini;
	}
	/**
	 * get value price1
	 * @return 	take value price1
	 */
	public static int getPrice1() {
		return price1;
	}
	/**
	 * get value price2
	 * @return 	take value price2
	 */
	public static int getPrice2() {
		return price2;
	}
	/**
	 * get value price3
	 * @return 	take value price3
	 */
	public static int getPrice3() {
		return price3;
	}
	/**
	 * get value villa
	 * @return 	take value villa
	 */
	public static int getVilla() {
		return villa;
	}

	public int getLocate() {
		return locate;
	}
	/**
	 * get value from information of place
	 * @return 	Color,priceini,price1,price2,price3,villa color,initial price,price when you buy 1 house,price when you buy 2
	  house,price when you buy 3 house,price when you buy villa of place 
	 */
	public synchronized void work()
	{
		if(locate==1||locate==3)
		{
			setColor(Color.GRAY);
			priceini=60;
			price1=40;
			price2=120;
			price3=180;
			villa=300;
			
		}
		else if(locate==5||locate==15||locate==25||locate==35)
		{
			setColor(Color.BLACK);
			priceini=200;
			price1=100;
			price2=150;
			price3=200;
			villa=300;
			
		}
		else if(locate==6||locate==8||locate==9)
		{
			setColor(Color.cyan);
			priceini=80;
			price1=60;
			price2=160;
			price3=240;
			villa=400;
		}
		else if(locate==11||locate==13||locate==14)
		{
			setColor(Color.pink);
			priceini=120;
			price1=100;
			price2=240;
			price3=360;
			villa=600;
		}
		else if(locate==16||locate==18||locate==19)
		{
			setColor(Color.orange);
			priceini=140;
			price1=120;
			price2=280;
			price3=420;
			villa=700;
		}
		else if(locate==21||locate==23||locate==24)
		{
			setColor(Color.red);
			priceini=180;
			price1=160;
			price2=360;
			price3=540;
			villa=900;
		}
		else if(locate==26||locate==27||locate==29)
		{
			setColor(Color.yellow);
			priceini=200;
			price1=180;
			price2=400;
			price3=600;
			villa=1000;
		}
		else if(locate==31||locate==32||locate==34)
		{
			setColor(Color.green);
			priceini=240;
			price1=220;
			price2=480;
			price3=720;
			villa=1200;
		}
		else if(locate==37||locate==39)
		{
			setColor(Color.blue);
			priceini=260;
			price1=240;
			price2=520;
			price3=780;
			villa=1300;
		}
	}
	/**
	 * get value color
	 * @return 	take value color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * set value color
	 * @param   color was given
	 * @return 	change value of color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	

}
