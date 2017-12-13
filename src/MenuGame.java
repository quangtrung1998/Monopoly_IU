

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuGame  extends JFrame implements ShowCamera{
		private static JButton btnDice;
		private static JButton btnDice1;
		public static JButton getBtnDice() {
		return btnDice;
		}
		public static JButton getBtnDice1() {
			return btnDice1;
		}
		@Override
		public void shown(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 173, 800, 800);
			setLocationRelativeTo(null);
			setResizable(false);
			setTitle("MENU");
			btnDice = new JButton();
			btnDice1 = new JButton();
			btnDice.setIcon(new ImageIcon("QWERTY.png"));
			btnDice1.setIcon(new ImageIcon("exitgame.png"));
			btnDice.setEnabled(true);
			btnDice1.setEnabled(true);
			btnDice.setBounds(280, 500, 235, 58);
			btnDice1.setBounds(280, 580, 235, 58);
			add(btnDice);
			add(btnDice1);
			BackgroundMenugame backgroundmenugame = new BackgroundMenugame();
			add(backgroundmenugame);
			setVisible(true);
		}
		@Override
		public void change(int data) {}

}
