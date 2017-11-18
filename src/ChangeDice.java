
import java.util.Random;


public class ChangeDice {
	private static int diceleft,diceright;
	
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
	public static int getDiceleft() {
		return diceleft;
	}
}


