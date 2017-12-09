

import javax.swing.JOptionPane;

public class BuyHouse extends Place{ //HouseOperation
	private static int[][] buy= new int[4][1000];
	public static int[][] getBuy() {
		return buy;
	}
	public static void setBuy(int[][] buy) {
		BuyHouse.buy = buy;
	}
	private static MainGame game;
	private static final String[] list = {"It was bought you must pay ","$","NOTIFICATION","Pay","Bankrupt","Yes, please","No, thanks","Would you like to buy it?","Buy 1 house","Buy 2 houses","Buy 3 houses","Buy Later",
			"Buy a villa ","Do you want to update your house","How many houses you want to buy"}; 
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
		 else if(buy[player][a]==0&&buy[check][a]!=0)
		 {
			 Object[] options = {list[3],list[4]};
			 if(buy[check][a]==1)
			 {	
				 
				 if(player==1) {
					 int n = JOptionPane.showOptionDialog(game,list[0]+Place.getPrice1()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney2()-Place.getPrice1());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+Place.getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
					 }
				 }
				 if(player==2) {
					 if(MainGame.getInialmoney2()>=Place.getPrice1())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice1());
					 }
					 else if(MainGame.getInialmoney2()<Place.getPrice1())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice1());
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
							MainGame.setInialmoney1(MainGame.getInialmoney2()-Place.getPrice2());
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
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice2());
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
							MainGame.setInialmoney1(MainGame.getInialmoney2()-Place.getPrice3());
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
							MainGame.setInialmoney2(MainGame.getInialmoney2()-Place.getPrice3());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+Place.getPrice3());
					 }
				 }
			 }
			 else
			 {
				 	JOptionPane.showOptionDialog(game,list[0]+Place.getVilla()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 	
			 }
		 }
		 else if(buy[player][a]==0)
		 {
			 if(player==1) {
				 Object[] options = {list[5],list[6]};
				 int n = JOptionPane.showOptionDialog(game,list[7],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 if(n==JOptionPane.YES_OPTION)
				 {
					
					 	Object[] options1 = {list[8],list[9],list[10]};
					 	int checkcombo =0;
					 	if(buy[player][a]!=3)
					 	{
					 	int n1 = JOptionPane.showOptionDialog(game,list[14],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[2]);
					 	if(n1==JOptionPane.YES_OPTION)
					 		{
					 			buy[player][a]=1;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice1());
					 				if(MainGame.getMode().getSize()==1)
					 					MainGame.getMode().addElement(a);
					 				else
					 				{
					 					for(int i=1;i<MainGame.getMode().getSize();i++) {
					 						checkcombo = (int) MainGame.getMode().getElementAt(i);
					 						if(a==checkcombo)
					 							break;
					 						if(a>checkcombo)
					 							{
					 								MainGame.getMode().insertElementAt(a, i);
					 								break;
					 							}
					 					}
					 				}
					 			
					 		}
					 	else if(n1==JOptionPane.NO_OPTION)
					 		{
					 			buy[player][a]=2;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice2());
					 					if(MainGame.getMode().getSize()==1)
						 					MainGame.getMode().addElement(a);
						 				else
						 				{
						 					for(int i=1;i<MainGame.getMode().getSize();i++) {
						 						checkcombo = (int) MainGame.getMode().getElementAt(i);
						 						if(a==checkcombo)
						 							break;
						 						if(a>checkcombo)
						 							{
						 								MainGame.getMode().insertElementAt(a, i);
						 								break;
						 							}
						 					}
						 				}
						 			
					 		}
					 	else if(n1==JOptionPane.CANCEL_OPTION)
					 		{
					 			buy[player][a]=3;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-Place.getPrice3());
					 					if(MainGame.getMode().getSize()==1)
						 					MainGame.getMode().addElement(a);
						 				else
						 				{
						 					for(int i=1;i<MainGame.getMode().getSize();i++) {
						 						checkcombo = (int) MainGame.getMode().getElementAt(i);
						 						if(a==checkcombo)
						 							break;
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
			 }
			 else if(player==2) {
		 			if(MainGame.getInialmoney2()>Place.getPrice3()+500) {
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
		 else if(buy[player][a]!=0&&buy[player][a]<=4) {
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
					 	else if(n1==JOptionPane.CANCEL_OPTION)
				 		{
				 			
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
				 	else if(n1==JOptionPane.CANCEL_OPTION)
			 		{
			 			
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
					 	else if(n1==JOptionPane.CANCEL_OPTION)
				 		{
				 			
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
