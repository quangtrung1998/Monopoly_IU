import java.awt.Color;

import javax.swing.JOptionPane;

public class BuyHouse extends Place{ //HouseOperation
	public static int buy[][]=new int[4][1000];
	private static MainGame game;
	 public static void house(int a,int player)
	 {
		 int check ;
		 if(player==1)
			 check=2;
		 else
			 check=1;
		 if(a==2||a==4||a==7||a==10||a==17||a==22||a==33||a==36||a==38|a==40||a==0||a==20||a==30)
		 {
				
		 }
		 else if(buy[player][a]==0&&buy[check][a]!=0)
		 {
			 Object[] options = {"Pay","Bankrupt"};
			 if(buy[check][a]==1)
			 {
				 int n = JOptionPane.showOptionDialog(game,"It was bought you must pay "+price1+"$","NOTIFICATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 if(player==1&&n==JOptionPane.YES_OPTION)
				 {
					 game.inialmoney1+=price1;
					 game.inialmoney2-=price1;
				 }
				 else if(player==1&&n==JOptionPane.NO_OPTION)
				 {
					 game.inialmoney1+=price1;
					 game.inialmoney2 =0;
				 }
				 else if(player==2&&n==JOptionPane.YES_OPTION)
				 {
					 game.inialmoney2+=price1;
					 game.inialmoney1-=price1;
				 }
				 else if(player==2&&n==JOptionPane.NO_OPTION)
				 {
					 game.inialmoney2+=price1;
					 game.inialmoney1 =0;
				 }
			 }
			 else if(buy[check][a]==2)
			 {
				 int n = JOptionPane.showOptionDialog(game,"It was bought you must pay "+price2+"$","NOTIFICATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 if(player==1&&n==JOptionPane.YES_OPTION)
				 {
					 game.inialmoney1+=price2;
					 game.inialmoney2-=price2;
				 }
				 else if(player==1&&n==JOptionPane.NO_OPTION)
				 {
					 game.inialmoney1+=price2;
					 game.inialmoney2 =0;
				 }
				 else if(player==2&&n==JOptionPane.YES_OPTION)
				 {
					 game.inialmoney2+=price2;
					 game.inialmoney1-=price2;
				 }
				 else if(player==2&&n==JOptionPane.NO_OPTION)
				 {
					 game.inialmoney2+=price2;
					 game.inialmoney1 =0;
				 }
			 }
		 }
}
