
import java.util.Random;


public class ChangeDice {
	private static int diceleft;
	private static int diceright;
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
	            return min + rn.nextInt(range);
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
	 * @param   diceleft : value input
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
	 * @param   diceright : value input
	 * @return 	change value of diceright
	 */
	public static void setDiceright(int c) {
		if(c==0)
			ChangeDice.diceright=0;
		else 
			ChangeDice.diceright = rand(1,6);
	}
}


