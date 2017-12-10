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
	private static Surface s;
	private static JButton button;
	private static int sum;
	private static int locationPlayer;
	private static int prision1;
	private static int prision2;
	private static int locationComputer;
	private static int inialmoney1 = 1500;
	private static int inialmoney2 = 1500;
	private static boolean conditionMove ;
	private static DefaultComboBoxModel<Object> mode;
	private static JComboBox<Object> comboBox;
	private static int player1, sav;
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
		namePrice = new JLabel();
		namePrice.setOpaque(true);
		namePrice.setBounds(25, 65, 240, 36);
		panel_1.add(namePrice);
		priceini = new JLabel();
		priceini.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		priceini.setBounds(30, 95, 240, 50);
		panel_1.add(priceini);
		price1 = new JLabel();
		price1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price1.setBounds(30, 131, 240, 50);
		panel_1.add(price1);
		price2 = new JLabel();
		price2.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price2.setBounds(30, 163, 240, 50);
		panel_1.add(price2);
		price3 = new JLabel();
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
		namePrice1 = new JLabel();
		namePrice1.setOpaque(true);
		namePrice1.setBounds(25, 65, 240, 36);
		panel_2.add(namePrice1);
		priceini1 = new JLabel();
		priceini1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		priceini1.setBounds(30, 95, 240, 50);
		panel_2.add(priceini1);
		price11 = new JLabel();
		price11.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price11.setBounds(30, 131, 240, 50);
		panel_2.add(price11);
		price21 = new JLabel();
		price21.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price21.setBounds(30, 163, 240, 50);
		panel_2.add(price21);
		price31 = new JLabel();
		price31.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		price31.setBounds(30, 196, 240, 50);
		panel_2.add(price31);
		villa1 = new JLabel();
		villa1.setFont(new Font(STRINGFONT, Font.PLAIN, 20));
		villa1.setBounds(30, 234, 240, 50);
		panel_2.add(villa1);
		nameplayer = new JLabel();
		nameplayer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		nameplayer.setBounds(1020, 30, 400, 28);
		add(nameplayer);
		namecomputer = new JLabel();
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
	public static boolean isConditionMove() {
		return conditionMove;
	}
	public static void setConditionMove(boolean conditionMove) {
		MainGame.conditionMove = conditionMove;
	}
	public static DefaultComboBoxModel<Object> getMode() {
		return mode;
	}
	public static void setMode(DefaultComboBoxModel<Object> mode) {
		MainGame.mode = mode;
	}
	public static JComboBox<Object> getComboBox() {
		return comboBox;
	}
	public static void setComboBox(JComboBox<Object> comboBox) {
		MainGame.comboBox = comboBox;
	}
	public static int getPlayer1() {
		return player1;
	}
	public static void setPlayer1(int player1) {
		MainGame.player1 = player1;
	}
	public static int getSum() {
		return sum;
	}
	public static void setSum(int sum) {
		MainGame.sum = sum;
	}
	public static int getPrision1() {
		return prision1;
	}
	public static void setPrision1(int prision1) {
		MainGame.prision1 = prision1;
	}
	public static int getPrision2() {
		return prision2;
	}
	public static void setPrision2(int prision2) {
		MainGame.prision2 = prision2;
	}
	public static int getInialmoney1() {
		return inialmoney1;
	}
	public static void setInialmoney1(int inialmoney1) {
		MainGame.inialmoney1 = inialmoney1;
	}
	public static int getInialmoney2() {
		return inialmoney2;
	}
	public static void setInialmoney2(int inialmoney2) {
		MainGame.inialmoney2 = inialmoney2;
	}
	public static int getLocationPlayer() {
		return locationPlayer;
	}
	public static void setLocationPlayer(int locationPlayer) {
		MainGame.locationPlayer = locationPlayer;
	}
	public static int getLocationComputer() {
		return locationComputer;
	}
	public static void setLocationComputer(int locationComputer) {
		MainGame.locationComputer = locationComputer;
	}
	public void house(int a)
	{
		Place place = new Place();
		place.setLocate(a);
		place.work();
		Color col = place.getColor();
		namePrice.setBackground(col);
		if (a == 5 || a == 15 || a == 25 || a == 35) {
			int pr = Place.getPriceini();
			priceini.setText(INITIALPRICE + pr);
			int pr1 = Place.getPrice1();
			price1.setText(1 + STRINGPRICE2 + pr1);
			int pr2 = Place.getPrice2();
			price2.setText(2 + STRINGPRICE2 + pr2);
			int pr3 = Place.getPrice3();
			price3.setText(3 + STRINGPRICE2 + pr3);
			int vil = Place.getVilla();
			villa.setText(4 + STRINGPRICE2 + vil);
		}
		else
		{
			int pr = Place.getPriceini();
			priceini.setText(INITIALPRICE + pr);
			int pr1 = Place.getPrice1();
			price1.setText(1 + STRINGPRICE1 + pr1);
			int pr2 = Place.getPrice2();
			price2.setText(2 + STRINGPRICE1 + pr2);
			int pr3 = Place.getPrice3();
			price3.setText(3 + STRINGPRICE1 + pr3);
			int vil = Place.getVilla();
			villa.setText(STRINGPRICE3 + vil);
		}
	}
	public void houseBought(int a)
	{
		Place place = new Place();
		place.setLocate(a);
		place.work();
		Color col1 = place.getColor();
		namePrice1.setBackground(col1);
		if (a == 5 || a == 15 || a == 25 || a == 35) {
			int pr1 = Place.getPriceini();
			priceini1.setText(INITIALPRICE + pr1);
			int pr11 = Place.getPrice1();
			price11.setText(1 + STRINGPRICE2 + pr11);
			int pr21 = Place.getPrice2();
			price21.setText(2 + STRINGPRICE2 + pr21);
			int pr31 = Place.getPrice3();
			price31.setText(3 + STRINGPRICE2 + pr31);
			int vil1 = Place.getVilla();
			villa1.setText(4 + STRINGPRICE2 + vil1);
		}
		else
		{
			int pr1 = Place.getPriceini();
			priceini1.setText(INITIALPRICE + pr1);
			int pr11 = Place.getPrice1();
			price11.setText(1 + STRINGPRICE1 + pr11);
			int pr21 = Place.getPrice2();
			price21.setText(2 + STRINGPRICE1 + pr21);
			int pr31 = Place.getPrice3();
			price31.setText(3 + STRINGPRICE1 + pr31);
			int vil1 = Place.getVilla();
			villa1.setText(STRINGPRICE3 + vil1);
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
		s.movePlayer();
	}
	/**
	* 	Move computer
	* @return 	change location computer and repaint
	*/
	private void move1() {
		s.moveComputer();
	}
	public static void run() throws InterruptedException {
		MainGame game = new MainGame();
		CameraComputer cameracomputer = new CameraComputer();
		Camera camera = new Camera();
		camera.shown();
		cameracomputer.shown();
		Chance chance = new Chance();
		chance.shown();
		CommunityChest communitychest = new CommunityChest();
		communitychest.shown();
		CameraDice cameradice = new CameraDice();
		cameradice.shown();
		while (inialmoney1 >= 0 && inialmoney2 >= 0)
		{
			nameplayer.setText("Your money : $" + inialmoney1);
			namecomputer.setText("Com's money : $" + inialmoney2);
			if (player1 == 1 && prision1 == 0)
			{
				sum = 0;
				sav = 0;
				setConditionMove(false);
				ChangeDice.setDiceleft(0);
				ChangeDice.setDiceright(0);
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					sav = 2;
					player1 = 2;
				}
				});
				comboBox.addItemListener(new ItemListener(){
					public void itemStateChanged(ItemEvent arg0) {
					if (comboBox.getSelectedIndex() == 0)
						game.house(0);
					else {
						int a = (int)comboBox.getSelectedItem();
						game.houseBought(a);

					}
				}
				});
				if (sav != 0)
				{
					setConditionMove(true);
					cameradice.setVisible(true);
					for (int i = 0; i<1000; i++) {
						ChangeDice.setDiceleft(2);
						ChangeDice.setDiceright(2);
						cameradice.change(2);
						game.repaint();
						Thread.sleep(2);
					}
					ChangeDice.setDiceleft(2);
					ChangeDice.setDiceright(2);
					sum = ChangeDice.getDiceleft() + ChangeDice.getDiceright();
					cameradice.change(2);
					game.repaint();
					Thread.sleep(3000);
					cameradice.setVisible(false);
				}
				while (sum != 0)
				{
					locationPlayer++;
					game.house(locationPlayer);
					camera.setVisible(true);
					game.move();
					camera.change(locationPlayer);
					game.repaint();
					Thread.sleep(200);
					sum--;
					if (locationPlayer >= 40)
					{
						locationPlayer -= 40;
						inialmoney1 += 200;// add condition because locationComputer >=40 show false image
					}
				}
				chance.change(0);
				communitychest.change(0);
				if (isConditionMove()==true) {
					if (locationPlayer >= 40)
					{
						locationPlayer -= 40;
						inialmoney1 += 200;
					}
					else if (locationPlayer == 7 || locationPlayer == 22 || locationPlayer == 36) {

						chance.change(1);
						chance.setVisible(true);
						game.repaint();
						Thread.sleep(200);
						chance.setVisible(false);
					}
					else if (locationPlayer == 2 || locationPlayer == 17 || locationPlayer == 33) {
						communitychest.change(1);
						communitychest.setVisible(true);
						game.repaint();
						Thread.sleep(5000);
						communitychest.setVisible(false);
					}
					else if (locationPlayer == 30)
					{
						JOptionPane.showMessageDialog(game, "You have to go to jail");
						sum = 20;
						while (sum != 0)
						{
							locationPlayer++;
							game.move();
							camera.change(locationPlayer);
							game.repaint();
							Thread.sleep(200);
							sum--;
						}
						locationPlayer = 10;
						prision1 = 3;
					}
					game.house(locationPlayer);
					BuyHouse.house(locationPlayer, 1);
					System.out.println(locationPlayer);
					System.out.println(inialmoney1);
				}
				camera.setVisible(false);
			}
			else if (player1 == 2 && prision2 == 0)
			{
				sum = 0;
				setConditionMove(false);
				cameradice.setVisible(true);
				for (int i = 0; i<1000; i++) {
					ChangeDice.setDiceleft(2);
					ChangeDice.setDiceright(2);
					cameradice.change(2);
					game.repaint();
					Thread.sleep(2);
				}
				ChangeDice.setDiceleft(2);
				ChangeDice.setDiceright(2);
				sum = ChangeDice.getDiceleft() + ChangeDice.getDiceright();
				cameradice.change(2);
				game.repaint();
				Thread.sleep(3000);
				cameradice.setVisible(false);
				if (sum != 0)
					setConditionMove(true);
				while (sum != 0)
				{
					locationComputer++;
					game.house(locationComputer);
					cameracomputer.setVisible(true);
					game.move1();
					cameracomputer.change(locationComputer);
					game.repaint();
					Thread.sleep(200);
					sum--;
					if (locationComputer >= 40)
					{
						locationComputer -= 40;
						inialmoney1 += 200; // add condition because locationComputer >=40 show false image
					}
				}
				chance.change(0);
				communitychest.change(0);
				if (isConditionMove()==true) {
					if (locationComputer >= 40)
					{
						locationComputer -= 40;
						inialmoney2 += 200;
					}
					else if (locationComputer == 7 || locationComputer == 22 || locationComputer == 36) {
						game.house(locationComputer);
						chance.change(1);
						chance.setVisible(true);
						game.repaint();
						Thread.sleep(5000);
						chance.setVisible(false);
					}
					else if (locationComputer == 2 || locationComputer == 17 || locationComputer == 33) {
						communitychest.change(1);
						communitychest.setVisible(true);
						game.repaint();
						Thread.sleep(200);
						communitychest.setVisible(false);
					}
					else if (locationComputer == 30)
					{
						JOptionPane.showMessageDialog(game, "You have to go to jail");
						sum = 20;
						while (sum != 0)
						{
							locationComputer++;
							game.move1();
							cameracomputer.change(locationComputer);
							game.repaint();
							Thread.sleep(200);
							sum--;
						}
						locationComputer = 10;
						prision2 = 3;
					}
					game.house(locationComputer);
					BuyHouse.house(locationComputer, 2);
					System.out.println(locationComputer);
					System.out.println(inialmoney2);
				}
				player1 = 1;
				cameracomputer.setVisible(false);
			}
			if (prision1 != 0 && prision2 != 0)
			{
			
				JOptionPane.showMessageDialog(game, "You has "+prision1+" turn to out prision");
				prision1--;
				Thread.sleep(200);
				JOptionPane.showMessageDialog(game, "You has "+prision2+" turn to out prision");
				prision2--;
			}
			else if (prision1 != 0 && prision2 == 0)
			{
				
				JOptionPane.showMessageDialog(game, "You has "+prision1+" turn to out prision");
				prision1--;
				player1 = 2;
				Thread.sleep(200);
			}
			else if (prision2 != 0 && prision1 == 0)
			{
				JOptionPane.showMessageDialog(game, "You has "+prision2+" turn to out prision");
				prision2--;
				player1 = 1;
				Thread.sleep(200);
			}
		}
		if (inialmoney1 <= 0)
		{
			JOptionPane.showMessageDialog(game, "You Lose");
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
			JOptionPane.showMessageDialog(game, "You Win");
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
