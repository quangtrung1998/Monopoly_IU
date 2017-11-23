

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
	public MainGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 140, 1200, 695);
		setResizable(false);
		setTitle("MonopolyGame");
	    button = new JButton("ROLL DICE");
	    button.setBounds(595, 320, 75, 70);
		getContentPane().add(button);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 360, 250, 400);
		panel_1.setOpaque(false);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
	    NameAndPrice = new JLabel("");
		NameAndPrice.setOpaque(true);
		NameAndPrice.setBounds(25, 65, 240, 36);
		panel_1.add(NameAndPrice);
		priceini = new JLabel("");
		priceini.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		priceini.setBounds(30, 95, 240, 50);
		panel_1.add(priceini);
		price1 = new JLabel("");
		price1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price1.setBounds(30, 131, 240, 50);
		panel_1.add(price1);	
		price2 = new JLabel("");
		price2.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price2.setBounds(30, 163, 240, 50);
		panel_1.add(price2);	
		price3 = new JLabel("");
		price3.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price3.setBounds(30, 196, 240, 50);
		panel_1.add(price3);
		villa = new JLabel("");
		villa.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		villa.setBounds(30, 234, 240, 50);
		panel_1.add(villa);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 40, 250, 400);
		getContentPane().add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
	    NameAndPrice1 = new JLabel("");
		NameAndPrice1.setOpaque(true);
		NameAndPrice1.setBounds(25, 65, 240, 36);
		panel_2.add(NameAndPrice1);
		priceini1 = new JLabel("");
		priceini1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		priceini1.setBounds(30, 95, 240, 50);
		panel_2.add(priceini1);
		price11 = new JLabel("");
		price11.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price11.setBounds(30, 131, 240, 50);
		panel_2.add(price11);	
		price21 = new JLabel("");
		price21.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price21.setBounds(30, 163, 240, 50);
		panel_2.add(price21);	
		price31 = new JLabel("");
		price31.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		price31.setBounds(30, 196, 240, 50);
		panel_2.add(price31);
		villa1 = new JLabel("");
		villa1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		villa1.setBounds(30, 234, 240, 50);
		panel_2.add(villa1);
		nameplayer = new JLabel("");
		nameplayer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		nameplayer.setBounds(1020, 30, 400, 28);
		add(nameplayer);
		namecomputer = new JLabel("");
		namecomputer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		namecomputer.setBounds(1010, 310, 400, 28);
		add(namecomputer);
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		mode = new DefaultComboBoxModel<>();
		mode.addElement("     House was bought");
		comboBox.setModel(mode);
		comboBox.setBounds(0, 0, 300, 40);
		add(comboBox);
		init();
	}
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

		else
		{
			 int pr =place.getPriceini();
			 priceini.setText(" INITIAL PRICE : "+pr);
			 int pr1=place.getPrice1();
			 price1.setText("  	1 HOUSE : "+pr1);
			 int pr2=place.getPrice2();
			 price2.setText("  	2 HOUSE : "+pr2);
			 int pr3=place.getPrice3();
			 price3.setText("  	3 HOUSE : "+pr3);
			 int vil=place.getVilla();
			 villa.setText("  VILLA : "+vil);	
		}
	 }
}
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
		else
		{
			 int pr =place.getPriceini();
			 priceini.setText(" INITIAL PRICE : "+pr);
			 int pr1=place.getPrice1();
			 price1.setText("  	1 HOUSE : "+pr1);
			 int pr2=place.getPrice2();
			 price2.setText("  	2 HOUSE : "+pr2);
			 int pr3=place.getPrice3();
			 price3.setText("  	3 HOUSE : "+pr3);
			 int vil=place.getVilla();
			 villa.setText("  VILLA : "+vil);	
		}
	 }
	 public void house1(int a)
	 {
		 Place place = new Place();
		 place.setLocate(a);
		 place.work();
		 Color col1 = place.getColor();
		 NameAndPrice1.setBackground(col1);
		 
		 if(a==5||a==15||a==25||a==35) {
			 int pr01 =place.getPriceini();
			 priceini1.setText(" INITIAL PRICE : "+pr01);
			 int pr11=place.getPrice1();
			 price11.setText("  	1 STATION : "+pr11);
			 int pr21=place.getPrice2();
			 price21.setText("  	2 STATION : "+pr21);
			 int pr31=place.getPrice3();
			 price31.setText("  	3 STATION : "+pr31);
			 int vil1=place.getVilla();
			 villa1.setText("  4 STATION : "+vil1);	
		}


		 	else
		{
			int pr01 =place.getPriceini();
			 priceini1.setText(" INITIAL PRICE : "+pr01);
			 int pr11=place.getPrice1();
			 price11.setText("  	1 HOUSE : "+pr11);
			 int pr21=place.getPrice2();
			 price21.setText("  	2 HOUSE : "+pr21);
			 int pr31=place.getPrice3();
			 price31.setText("  	3 HOUSE : "+pr31);
			 int vil1=place.getVilla();
			 villa1.setText("  VILLA : "+vil1);	
		}
	 }
