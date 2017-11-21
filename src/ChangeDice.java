
import java.util.Random;


public class ChangeDice {
	private static int diceleft,diceright;
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
	 * get value diceleft
	 * @return 	take value diceleft
	 */
	public static int getDiceleft() {
		return diceleft;
	}
	/**
	 * set value diceleft
	 * @param   diceleft was given
	 * @return 	change value of diceleft
	 */
	public static void setDiceleft(int diceleft) {
		if(diceleft==0)
			ChangeDice.diceleft=0;
		else
		ChangeDice.diceleft = rand(1,6);
	}
	/**
	 * get value diceright
	 * @return 	take value diceright
	 */
	public static int getDiceright() {
		return diceright;
	}
	/**
	 * set value diceright
	 * @param   diceright was given
	 * @return 	change value of diceright
	 */
	public static void setDiceright(int c) {
		if(c==0)
			ChangeDice.diceright=0;
		else 
			ChangeDice.diceright = rand(1,6);
	}
}


