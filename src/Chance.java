import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Chance extends JFrame implements ShowCamera{
	private ImageChance imagechance;
	/**
	 * Change
	 * @return 	data change and paint again
	 */
	public Chance() {	
		repaint();
	}
	/**
	 * Change
	 * @param   b : value input 
	 * @return 	data change
	 */
	@Override
	public void change(int b) {
		if(b!=0)
		{
			int a = rand(41,56);
			imagechance.change(a);
		}
		else
		{
			imagechance.change(7);
			repaint();
		}
	}
	/**
	 * compute the random number
	 * @param   min : value minimum 
	 * @param   max : value minimum
	 * @return 	random number from minimum to minimum
	 */
	private static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            return (min + rn.nextInt(range));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
	/**
	 * Show the frame and image in the frame
	 * @return 	the frame and image in the frame
	 */
	@Override
	public void shown() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
		setBounds(800, 343, 340, 342);
		setResizable(false);
		setTitle("CHANCE");
		imagechance = new ImageChance();
		add(imagechance);
		setVisible(false);
	}
}
