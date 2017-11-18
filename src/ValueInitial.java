
public class ValueInitial {
	public ValueInitial() {
	}
	/**
	 * save and create the initial value
	 * @return 	take and active this value
	 */
	public static void getValue(){
		MainGame.inialmoney1=1000;
		MainGame.inialmoney2=1000;
		MainGame.sum1=0;
		MainGame.prision1=0;
		MainGame.prision2=0;
		MainGame.sum2=0;
		MainGame.sum=0;
		MainGame.player1 = 1;
		Surface.x = 871;Surface.y = 590;
		Surface.xa = 1; 
		Surface.xa1=1;
		Surface.ya = 1;
		Surface.x1=871;
		Surface.y1=590;
		Surface.ya1=1;
		
		for(int i=1;i<=2;i++)
		{
			for(int j=0;j<=40;j++)
				BuyHouse.buy[i][j]=0;
		}
	}
}
