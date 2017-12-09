
public class ValueInitial {

	/**
	 * save and create the initial value
	 * @return 	take and active this value
	 */
	public static void getValue(){
		MainGame.setInialmoney1(1500);
		MainGame.setInialmoney2(1500);
		MainGame.setLocationPlayer(0);
		MainGame.setPrision2(0);
		MainGame.setPrision1(0);
		MainGame.setLocationComputer(0);
		MainGame.setSum(0);
		MainGame.setPlayer1(1);
		Surface.setXplayer(871);
		Surface.setYplayer(590);
		Surface.setXa(1); 
		Surface.setXa1(1); 
		Surface.setYa(1); 
		Surface.setXcomputer(871);
		Surface.setYcomputer(590);
		Surface.setYa1(1); 
		
		for(int i=1;i<=2;i++)
		{
			for(int j=0;j<=40;j++)
				BuyHouse.getBuy()[i][j]=0;
		}
	}
}
