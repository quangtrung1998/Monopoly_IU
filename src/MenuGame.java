

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MenuGame  extends JFrame implements ShowCamera{
	private static JButton btnDice;
		public static JButton getBtnDice() {
		return btnDice;
	}
	
		@Override
		public void shown(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 173, 800, 800);
			setLocationRelativeTo(null);
			setResizable(false);
			setTitle("MENU");
			btnDice = new JButton();
			btnDice.setIcon(new ImageIcon("QWERTY.png"));
			btnDice.setEnabled(true);
			btnDice.setBounds(280, 500, 240, 60);
			add(btnDice);
			BackgroundMenugame backgroundmenugame = new BackgroundMenugame();
			add(backgroundmenugame);
			setVisible(true);
		}
		@Override
		public void change(int data) {
			// TODO Auto-generated method stub
			
		}

}
