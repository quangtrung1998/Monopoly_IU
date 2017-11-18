import java.util.Random;

import javax.swing.JFrame;

public class Chance extends JFrame{
	private ImageChance imagechance;
	public Chance() {
		
		repaint();
	}
	public void change(int b) {
		if(b!=0)
		{int a = rand(41,56);
		imagechance.change(a);}
		else
		{imagechance.change(7);
		repaint();}
	}
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
	
}
