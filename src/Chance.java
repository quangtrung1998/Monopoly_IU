import java.util.Random;

import javax.swing.JFrame;

public class Chance extends JFrame{
	private ImageChance imagechance;
	public Chance() {
		
		repaint();
	}
	/**
	 * Change
	 * @param   data was put 
	 * @return 	data change
	 */
	public void change(int b) {
		if(b!=0)
		{int a = rand(41,56);
		imagechance.change(a);}
		else
		{imagechance.change(7);
		repaint();}
	}
	/**
	 * compute the random number
	 * @param   min value minimum 
	 * @param   max value minimum
	 * @return 	random number from minimum to minimum
	 */
	private static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
	/**
	 * Show the frame and image in the frame
	 * @return 	the frame and image in the frame
	 */
	public void Show() throws InterruptedException {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
		setBounds(22, 173, 340, 342);
		setResizable(false);
		setTitle("CHANCE");
		imagechance = new ImageChance();
		add(imagechance);
		setVisible(true);
	}
}
