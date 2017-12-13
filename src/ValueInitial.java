
public class ValueInitial {
	
	private static MainGame game;
	private static Surface surface;
	/**
	 * save and create the initial value
	 * @return 	take and active this value
	 */
	public static void getValue(){
		game.setInialmoney1(1500); // set tiền của mình
		game.setInialmoney2(1500); // set tiền của máy
		game.setLocationPlayer(0);// set location of player ban đầu
		game.setPrision2(0);// set điều kiện vào tù của máy
		game.setPrision1(0); // set điều kiện vào tù của ng choi
		game.setLocationComputer(0); // set location of computer ban đầu
		game.setSum(0);		
		game.setPlayer1(1);
		surface.setXplayer(871);
		surface.setYplayer(590);
		surface.setXa(1); 
		surface.setXa1(1); 
		surface.setXcomputer(871);
		surface.setYcomputer(590);
		for(int i=1;i<=2;i++)
		{
			for(int j=0;j<=40;j++)
				BuyHouse.getBuy()[i][j]=0;
		}
	}
}
