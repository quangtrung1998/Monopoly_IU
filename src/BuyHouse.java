

import javax.swing.JOptionPane;

public class BuyHouse extends Place{ //HouseOperation
	private static int[][] buy= new int[4][1000];
	private static MainGame game;
	private static String[] list = {"It was bought you must pay ","$","NOTIFICATION","Pay","Bankrupt","Yes, please","No, thanks","Would you like to buy it?","Buy 1 house","Buy 2 houses","Buy 3 houses","Buy Later",
			"Buy a villa ","Do you want to update your house","How many houses you want to buy"}; 
	/**
	 * get value buy[][]
	 * @return value buy[][]
	 * 
	 */
	public static int[][] getBuy() {
		return buy;
	}
	/**
	 * Set value buy[][]
	 * @param 	int[][] buy : value for setting
	 * @return 	change value of buy[][]
	 *
	 */
	public static void setBuy(int[][] buy) {
		BuyHouse.buy = buy;
	}
	/**
	 * Buy place and build house
	 * @param 	a : location of player
	 * @param 	player : player or computer
	 * @return 	if house wasn't bought , reduce your money and you have it else house was bought , you must pay money for fee of visiting
	 * 
	 */
	public static void house(int a,int player)
	 {
		 int check;
		 if(player==1)
			 check=2;
		 else
			 check=1;
		 if(a==2||a==4||a==7||a==10||a==17||a==22||a==33||a==36||a==38||a==40||a==0||a==20||a==30)
		 {
				
		 }
		 else if(a==5||a==15||a==25||a==35) {
			 if(player==1) {
				if(buy[1][a]==0) {
					 Object[] options = {list[5],list[6]};
					 int n = JOptionPane.showOptionDialog(game,list[7],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
						 {
						 	MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPriceini());
						 	buy[1][a]=1;
						 }
				}
				else {
					int totalprice=0;
					for(int i=5;i<=35;i+=10) {
						if(buy[2][a]==2)
							totalprice++;
					}
					if(totalprice==1)
						MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
					else if(totalprice==2)
						MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice2());
					else if(totalprice==3)
						MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice3());
					else if(totalprice==4)
						MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getVilla());
				}
			 }
			 else if(player==2) {
				 if(buy[2][a]==0) {
					 if(MainGame.getInialmoney2()>Place.getPriceini()+200)
						 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPriceini());
						 	buy[2][a]=1;
						 }
				}
				else {
					int totalprice=0;
					for(int i=5;i<=35;i+=10) {
						if(buy[1][a]==2)
							totalprice++;
					}
					if(totalprice==1)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
					else if(totalprice==2)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice2());
					else if(totalprice==3)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice3());
					else if(totalprice==4)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getVilla());
				}
			 }
		 }
		 else if(buy[player][a]==0&&buy[check][a]!=0) // nếu tại vi trí này nhà đã bị mua , phải trả tiền
		 {
			 Object[] options = {list[3],list[4]};
			 if(buy[check][a]==1) // mua một nhà
			 {	
				 
				 if(player==1) { // nếu mình vô trừ tiền mình tăng tiền máy
					 int n = JOptionPane.showOptionDialog(game,list[0]+Place.getPrice1()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 // hiển thị hộp thoại xác nhận nếu nhấn yes với yes là trả tiền no là phá sản
					 if(n==JOptionPane.YES_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice1());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) { // nếu máy vô trừ tiền máy tăng tiền mình
					 if(MainGame.getInialmoney2()>=Place.getPrice1())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice1());
					 }
					 else if(MainGame.getInialmoney2()<Place.getPrice1())
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice1());
					 }
				 }
			 }
			 else if(buy[check][a]==2)
			 {
				 if(player==1) {
					 int n = JOptionPane.showOptionDialog(game,list[0]+Place.getPrice2()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice2());
							MainGame.setInialmoney1(MainGame.getInialmoney2()-Place.getPrice2());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice2());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) {
					 if(MainGame.getInialmoney2()>=Place.getPrice2())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice2());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice2());
					 }
					 else if(MainGame.getInialmoney2()<Place.getPrice1())
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice2());
					 }
				 }
			 }
			 else if(buy[check][a]==3)
			 {
				 if(player==1) {
					 int n = JOptionPane.showOptionDialog(game,list[0]+Place.getPrice3()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice3());
							MainGame.setInialmoney1(MainGame.getInialmoney2()-Place.getPrice3());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice3());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) {
					 if(MainGame.getInialmoney2()>=Place.getPrice3())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice3());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice3());
					 }
					 else if(MainGame.getInialmoney2()<Place.getPrice1())
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice3());
					 }
				 }
			 }
			 else
			 {
				 	JOptionPane.showOptionDialog(game,list[0]+Place.getVilla()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 	
			 }
		 }
		 else if(buy[player][a]==0) // nếu tại vi tri này chua mua
		 {
			 if(player==1) {
				 Object[] options = {list[5],list[6]};
				 int n = JOptionPane.showOptionDialog(game,list[7],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 // hỏi muốn mua hay k yes hoac no
				 if(n==JOptionPane.YES_OPTION) // yes
				 {
					
					 	Object[] options1 = {list[8],list[9],list[10]}; // mua 1 nha 2 nhà 3 nhà 
					 	int checkcombo =0;
					 
					 	int n1 = JOptionPane.showOptionDialog(game,list[14],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[2]);
					 	if(n1==JOptionPane.YES_OPTION) // mua 1 nha
					 		{
					 			buy[player][a]=1;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
					 				if(MainGame.getMode().getSize()==1) // kiem tra xem mode cua DefaultComboBoxModel co size == 1 k có thi add vi tri a vao mode
					 					MainGame.getMode().addElement(a);
					 				else // neu khac 1 
					 				{
					 					for(int i=1;i<=MainGame.getMode().getSize();i++) {
					 						checkcombo = (int) MainGame.getMode().getElementAt(i); // lay gia tri mode tai vi tri i va ep kieu int
					 						if(a>checkcombo) // nếu gia tri a lon hon thi insert a tai vi tri i
					 							{
					 								MainGame.getMode().insertElementAt(a, i);
					 								break;
					 							}
					 						else if(i==MainGame.getMode().getSize())
					 							MainGame.getMode().addElement(a);
					 					}
					 				}
					 			
					 		}
					 	else if(n1==JOptionPane.NO_OPTION) // mua 2 nha
					 		{
					 			buy[player][a]=2;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice2());
					 					if(MainGame.getMode().getSize()==1)
						 					MainGame.getMode().addElement(a);
						 				else
						 				{
						 					for(int i=1;i<MainGame.getMode().getSize();i++) {
						 						checkcombo = (int) MainGame.getMode().getElementAt(i);
						 				
						 						if(a>checkcombo)
						 							{
						 								MainGame.getMode().insertElementAt(a, i);
						 								break;
						 							}
						 					}
						 				}
						 			
					 		}
					 	else if(n1==JOptionPane.CANCEL_OPTION) // mua 3 nha
					 		{
					 			buy[player][a]=3;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice3());
					 					if(MainGame.getMode().getSize()==1)
						 					MainGame.getMode().addElement(a);
						 				else
						 				{
						 					for(int i=1;i<MainGame.getMode().getSize();i++) {
						 						checkcombo = (int) MainGame.getMode().getElementAt(i);
						 						
						 						if(a>checkcombo)
						 							{
						 								MainGame.getMode().insertElementAt(a, i);
						 								break;
						 							}
						 					}
						 				}
						 			
					 		}
					 		 				 	
				 }
			 }
			 else if(player==2) {
		 			if(MainGame.getInialmoney2()>Place.getPrice3()+500) { // điều kiên để máy mua nhà 
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice3());
		 				buy[player][a]=3;
		 			}
		 			else if(MainGame.getInialmoney2()>Place.getPrice2()+200) {
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice2());
		 				buy[player][a]=2;
		 			}
		 			else if(MainGame.getInialmoney2()>Place.getPrice1()+100) {
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
		 				buy[player][a]=1;
		 			}
				}
		 }
		 else if(buy[player][a]!=0&&buy[player][a]<=4) { // đã mua nhà và chưa xây villa
			 if(buy[player][a]==1) {
				if(player==1) {
					 Object[] options1 = {list[9],list[10],list[11]};
					 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[2]);
					 	if(n1==JOptionPane.YES_OPTION)
				 		{
				 			buy[player][a]=2;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
				 		}
					 	else if(n1==JOptionPane.NO_OPTION)
				 		{
				 			buy[player][a]=2;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1()*2);
				 		}
				}
				else if(player==2) {
					if(MainGame.getInialmoney2()>Place.getPrice1()*2+500) {
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1()*2);
		 				buy[player][a]=3;
		 			}
		 			else if(MainGame.getInialmoney2()>Place.getPrice1()+200) {
		 				MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
		 				buy[player][a]=2;
		 			}
				}
			 }
			 else if(buy[player][a]==2) {
			if(player==1) {
				 Object[] options1 = {list[10],list[11]};
				 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[1]);
				 	if(n1==JOptionPane.YES_OPTION)
			 		{
			 			buy[player][a]=3;
			 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
			 		}
			}
			else if(player==2) {
				if(MainGame.getInialmoney2()>Place.getPrice1()+200) {
					MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
	 				buy[player][a]=3;
	 			}
			}
		}
			 else {
				if(player==1) {
					 Object[] options1 = {list[12],list[11]};
					 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[1]);
					 	if(n1==JOptionPane.YES_OPTION)
				 		{
				 			buy[player][a]=4;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
				 		}
				}
				else if(player==2) {
					if(MainGame.getInialmoney2()>Place.getPrice1()+200) {
						MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
		 				buy[player][a]=4;
		 			}
				}
			 }
		 }
		
	 }
}
