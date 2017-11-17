

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuGame  extends JFrame {
	private BackgroundMenugame backgroundmenugame;
	public static JButton btnDice;
	Main main;
		public MenuGame() {
		
		}
		public void Show(){
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(0, 173, 800, 800);
			setLocationRelativeTo(null);
			setResizable(false);
			setTitle("MENU");
			btnDice = new JButton("DICE");
			btnDice.setIcon(new ImageIcon("menugame.jpg"));
			btnDice.setEnabled(true);
			btnDice.setBounds(304, 373, 200, 60);
			getContentPane().add(btnDice);
			backgroundmenugame = new BackgroundMenugame();
			add(backgroundmenugame);
			setVisible(true);
		}
}
