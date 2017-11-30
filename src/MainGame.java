

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class MainGame extends JFrame {
	private static JLabel namePrice;
	private static JLabel priceini;
	private static JLabel price1;
	private static JLabel price2;
	private static JLabel price3;
	private static JLabel villa;
	private static JLabel namePrice1;
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
	protected static int sum;
	protected static int sum1;
	protected static int prision1;
	protected static int prision2;
	protected static int sum2;
	public static int inialmoney1=1000;
	public static int inialmoney2=1000;
	public static DefaultComboBoxModel<Object> mode;
	public static JComboBox<Object> comboBox ;
	protected static int player1 ,sav;
	private static final String INITIALPRICE = " INITIAL PRICE  : ";  
	private static final String STRINGPRICE1 = " House : "; 
	private static final String STRINGPRICE2 = " Station : "; 
	private static final String STRINGPRICE3 = " Villa: ";
	private static final String STRINGFONT = "Bradley Hand ITC";
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
	    namePrice = new JLabel("");
		namePrice.setOpaque(true);
		namePrice.setBounds(25, 65, 240, 36);
		panel_1.add(namePrice);
		priceini = new JLabel("");
		priceini.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		priceini.setBounds(30, 95, 240, 50);
		panel_1.add(priceini);
		price1 = new JLabel("");
		price1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price1.setBounds(30, 131, 240, 50);
		panel_1.add(price1);	
		price2 = new JLabel("");
		price2.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price2.setBounds(30, 163, 240, 50);
		panel_1.add(price2);	
		price3 = new JLabel("");
		price3.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price3.setBounds(30, 196, 240, 50);
		panel_1.add(price3);
		villa = new JLabel("");
		villa.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		villa.setBounds(30, 234, 240, 50);
		panel_1.add(villa);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 40, 250, 400);
		getContentPane().add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
	    namePrice1 = new JLabel("");
		namePrice1.setOpaque(true);
		namePrice1.setBounds(25, 65, 240, 36);
		panel_2.add(namePrice1);
		priceini1 = new JLabel("");
		priceini1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		priceini1.setBounds(30, 95, 240, 50);
		panel_2.add(priceini1);
		price11 = new JLabel("");
		price11.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price11.setBounds(30, 131, 240, 50);
		panel_2.add(price11);	
		price21 = new JLabel("");
		price21.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price21.setBounds(30, 163, 240, 50);
		panel_2.add(price21);	
		price31 = new JLabel("");
		price31.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price31.setBounds(30, 196, 240, 50);
		panel_2.add(price31);
		villa1 = new JLabel("");
		villa1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
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
		comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
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
		 namePrice.setBackground(col);
		if(a==5||a==15||a==25||a==35) {
		     int pr =place.getPriceini();
			 priceini.setText(INITIALPRICE+pr);
			 int pr1=Place.getPrice1();
			 price1.setText(1+STRINGPRICE2+pr1);
			 int pr2=Place.getPrice2();
			 price2.setText(2+STRINGPRICE2+pr2);
			 int pr3=Place.getPrice3();
			 price3.setText(3+STRINGPRICE2+pr3);
			 int vil=Place.getVilla();
			 villa.setText(4+STRINGPRICE2+vil);
		}
		else
		{
			 int pr =place.getPriceini();
			 priceini.setText(INITIALPRICE+pr);
			 int pr1=Place.getPrice1();
			 price1.setText(1+STRINGPRICE1+pr1);
			 int pr2=Place.getPrice2();
			 price2.setText(2+STRINGPRICE1+pr2);
			 int pr3=Place.getPrice3();
			 price3.setText(3+STRINGPRICE1+pr3);
			 int vil=Place.getVilla();
			 villa.setText(STRINGPRICE3+vil);	
		}
	 }
	 public void house1(int a)
	 {
		 Place place = new Place();
		 place.setLocate(a);
		 place.work();
		 Color col1 = place.getColor();
		 namePrice1.setBackground(col1);
		 
		 if(a==5||a==15||a==25||a==35) {
		     int pr1 =place.getPriceini();
			 priceini1.setText(INITIALPRICE+pr1);
			 int pr11=Place.getPrice1();
			 price11.setText(1+STRINGPRICE2+pr11);
			 int pr21=Place.getPrice2();
			 price21.setText(2+STRINGPRICE2+pr21);
			 int pr31=Place.getPrice3();
			 price31.setText(3+STRINGPRICE2+pr31);
			 int vil1=Place.getVilla();
			 villa1.setText(4+STRINGPRICE2+vil1);
		}
		else
		{
			 int pr1 =place.getPriceini();
			 priceini1.setText(INITIALPRICE+pr1);
			 int pr11=Place.getPrice1();
			 price11.setText(1+STRINGPRICE1+pr11);
			 int pr21=Place.getPrice2();
			 price21.setText(2+STRINGPRICE1+pr21);
			 int pr31=Place.getPrice3();
			 price31.setText(3+STRINGPRICE1+pr31);
			 int vil1=Place.getVilla();
			 villa1.setText(STRINGPRICE3+vil1);	
		}
	 }
		/**
		 * Set location frame and add class Surface to frame and show frame
		 * @return 	show frame has surface
		 */
	public void init()
	{
		setLocationRelativeTo(null);
		s = new Surface(this);
		add(s);
		setVisible(true);
	}
	/**
	 * 	Move player
	 * @return 	change location player and repaint
	 */
	private void move() {
		s.move();
		
	}
	/**
	 * 	Move computer
	 * @return 	change location computer and repaint
	 */
	private void move1() {
		s.move1();
	}
	public static void run () throws InterruptedException {
		
		MainGame game = new MainGame();
		CameraComputer cameracomputer = new CameraComputer();// xóa class extend CameraComputer
		Camera camera = new Camera();// xóa class extend Camera
		camera.shown();
		cameracomputer.shown();
		Chance chance = new Chance();// xóa class extend Chance
		chance.shown();
		CommunityChest communitychest = new CommunityChest();// xóa class extend CommunityChest
		communitychest.shown();
		CameraDice cameradice = new CameraDice();  // xóa class extend cameradice
		cameradice.shown();
		while(inialmoney1>=0&&inialmoney2>=0)
		{	nameplayer.setText("Your money : $"+inialmoney1);
			namecomputer.setText("Com's money : $"+inialmoney2);
			
			if(player1==1&&prision1==0)
			{
				sum=0;
				sav=0;
				int b=0;
				ChangeDice.setDiceleft(0);
				ChangeDice.setDiceright(0);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sav=2;
						player1=2;
						
					}
				});
				comboBox.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
					if(comboBox.getSelectedIndex()==0)
						game.house(0);
					else {
					int a = (int) comboBox.getSelectedItem();
					game.house1(a);
					
					}
					}
				});
				
				if(sav!=0)
					{
						b++;
						cameradice.setVisible(true);
						for(int i=0;i<10;i++) {
							ChangeDice.setDiceleft(2);
							ChangeDice.setDiceright(2);
							cameradice.change(2);
							game.repaint();
							Thread.sleep(5);
						}
						ChangeDice.setDiceleft(2);
						ChangeDice.setDiceright(2);
						sum = ChangeDice.getDiceleft()+ChangeDice.getDiceright();
						cameradice.change(2);
						game.repaint();
						Thread.sleep(0);
						cameradice.setVisible(false);
					}
				while(sum!=0)
				{	
					sum1++;
					game.house(sum1);
					camera.setVisible(true);
					game.move();	
					camera.change(sum1);
					game.repaint();
					Thread.sleep(0);
					sum--;
					if(sum1>=40)
					{
						sum1-=40;
						inialmoney1+=200;// add condition because sum2 >=40 show false image
					}
				}
				chance.change(0);
				communitychest.change(0);
				if(b!=0) {	
					if(sum1>=40)
						{
							sum1-=40;
							inialmoney1+=200;
						}
					else if(sum1==7||sum1==22||sum1==36) {
						
						chance.change(1);
						chance.setVisible(true);
						game.repaint();
						Thread.sleep(0);
						chance.setVisible(false);
						}
					else if(sum1==2||sum1==17||sum1==33) {
						communitychest.change(1);
						communitychest.setVisible(true);
						game.repaint();
						Thread.sleep(5000);
						communitychest.setVisible(false);
					}
					else if(sum1==30)
					{	
						JOptionPane.showMessageDialog(game,"You have to go to jail" );
						sum=20;
						while(sum!=0)
						{	sum1++;
							game.move();	
							camera.change(sum1);
							game.repaint();
							Thread.sleep(500);
							sum--;
						}
						sum1=10;
						prision1=3;
					}
					game.house(sum1);
					BuyHouse.house(sum1,1);
					System.out.println(sum1);
					System.out.println(inialmoney1);
					}
				camera.setVisible(false);
				
			}
			else if(player1==2&&prision2==0)
			{
				sum=0;
				int b=0;
				cameradice.setVisible(true);
				for(int i=0;i<10;i++) {
					ChangeDice.setDiceleft(2);
					ChangeDice.setDiceright(2);
					cameradice.change(2);
					game.repaint();
					Thread.sleep(5);
				}
				ChangeDice.setDiceleft(2);
				ChangeDice.setDiceright(2);
				sum = ChangeDice.getDiceleft()+ChangeDice.getDiceright();
				cameradice.change(2);
				game.repaint();
				Thread.sleep(3);
				cameradice.setVisible(false);
				if(sum!=0)
					b++;
				while(sum!=0)
				{	
					sum2++;
					game.house(sum2);
					cameracomputer.setVisible(true);
					game.move1();	
					cameracomputer.change(sum2);
					game.repaint();
					Thread.sleep(0);
					sum--;
					if(sum2>=40)
					{
						sum2-=40;
						inialmoney1+=200; // add condition because sum2 >=40 show false image
					}
				}
				chance.change(0);
				communitychest.change(0);
				if(b!=0) {	
					if(sum2>=40)
						{
							sum2-=40;
							inialmoney2+=200;
						}
					else if(sum2==7||sum2==22||sum2==36) {
					
						game.house(sum2);
						chance.change(1);
						chance.setVisible(true);
						game.repaint();
						Thread.sleep(1000);
						chance.setVisible(false);
					}
					else if(sum2==2||sum2==17||sum2==33) {
						communitychest.change(1);
						communitychest.setVisible(true);
						game.repaint();
						Thread.sleep(500);
						communitychest.setVisible(false);
					}
					else if(sum2==30)
						{	
						JOptionPane.showMessageDialog(game,"You have to go to jail" );
						sum=20;
						while(sum!=0)
						{	sum2++;
							game.move1();	
							cameracomputer.change(sum2);
							game.repaint();
							Thread.sleep(500);
							sum--;
						}
						sum2=10;
						prision2=3;
						}
					game.house(sum2);
					BuyHouse.house(sum2,2);
					System.out.println(sum2);
					System.out.println(inialmoney2);
				}
				player1=1;
			}
			if(prision1!=0&&prision2!=0)
				{
					prision1--;
					prision2--;
				}
			else if(prision1!=0&&prision2==0)
				{
					prision1--;
					player1=2;
					Thread.sleep(100);
	
				}
			else if(prision2!=0&&prision1==0)
				{
					prision2--;
					player1=1;
					Thread.sleep(100);
				}
			cameracomputer.setVisible(false);
			
		}
		if(inialmoney1<=0)
		{
			JOptionPane.showMessageDialog(game,"You Lose" );
			camera.change(0);
			cameracomputer.change(0);
			game.dispose();
			camera.dispose();
			cameracomputer.dispose();
			chance.dispose();
			communitychest.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(game,"You Win" );
			camera.change(0);
			cameracomputer.change(0);
			game.dispose();
			camera.dispose();
			cameracomputer.dispose();
			chance.dispose();
			communitychest.dispose();
		}
		
	}

}
