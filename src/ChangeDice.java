
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


	public static void setDiceleft(int diceleft) {
		if(diceleft==0)
			ChangeDice.diceleft=0;
		else
		ChangeDice.diceleft = rand(1,6);
	}
	public static int getDiceright() {
		return diceright;
	}

	public static void setDiceright(int c) {
		if(c==0)
			ChangeDice.diceright=0;
		else 
			ChangeDice.diceright = rand(1,6);
	}
}


