

import java.awt.Color;

public class Place {
	public int locate,priceini;
	public static int price1;
	public static int price2;
	public static int price3;
	public static int villa;
	public int nameplace;
	private Color color;
	public void setLocate(int locate) {
		this.locate = locate;
	}
	public int getNameplace() {
		return nameplace;
	}
	public int getPriceini() {
		return priceini;
	}
	public int getPrice1() {
		return price1;
	}
	public int getPrice2() {
		return price2;
	}
	public int getPrice3() {
		return price3;
	}
	public int getVilla() {
		return villa;
	}

	public int getLocate() {
		return locate;
	}
	public void work()
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	

}
