

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGame extends JFrame {
	
private JLabel label_2;
	private static JLabel NameAndPrice;
	private static JLabel priceini;
	private static JLabel price1;
	private static JLabel price2;
	private static JLabel price3;
	private static JLabel villa;
	private static JLabel NameAndPrice1;
	private static JLabel priceini1;
	private static JLabel price11;
	private static JLabel price21;
	private static JLabel price31;
	private static JLabel villa1;
	private static JLabel nameplayer;
	private static JLabel namecomputer;
	static BuyHouse byhouse;
	private static Surface s;
	private static JButton button ;
	protected static  int sum;
	protected static  int sum1,prision1,prision2,sum2;
	public static int inialmoney1=1000,inialmoney2=1000;
	 public void house(int a)
	 {
		 Place place = new Place();
		 place.setLocate(a);
		 place.work();
		 Color col = place.getColor();
		 NameAndPrice.setBackground(col);
		if(a==5||a==15||a==25||a==35) {
		     int pr =place.getPriceini();
			 priceini.setText(" INITIAL PRICE : "+pr);
			 int pr1=place.getPrice1();
			 price1.setText("  	1 STATION : "+pr1);
			 int pr2=place.getPrice2();
			 price2.setText("  	2 STATION : "+pr2);
			 int pr3=place.getPrice3();
			 price3.setText("  	3 STATION : "+pr3);
			 int vil=place.getVilla();
			 villa.setText("  4 STATION : "+vil);
		}
	 }
}
