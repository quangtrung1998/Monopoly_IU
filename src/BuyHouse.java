

import javax.swing.JOptionPane;

public class BuyHouse extends Place{ //HouseOperation
	private static int[][] buy= new int[4][1000]; 
	private static MainGame game;
	private static final String[] list = {"It was bought you must pay ","$","NOTIFICATION","Pay","Bankrupt","Yes, please","No, thanks","Would you like to buy it?","Buy 1 house","Buy 2 houses","Buy 3 houses","Buy Later",
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
	private static void addElementToMode(int element) {
		int checkcombo;
		if(MainGame.getMode().getSize()==1) // kiem tra xem mode cua DefaultComboBoxModel co size == 1 k có thi add vi tri a vao mode
				MainGame.getMode().addElement(element); // Thêm phần tử đã cho tới cuối của Vector này, tăng kích cỡ nó thêm 1
			else // neu khac 1 
			{
				for(int i=1;i<MainGame.getMode().getSize();i++) {
					checkcombo = (int) MainGame.getMode().getElementAt(i); // lay gia tri mode tai vi tri i va ep kieu int
					if(element>checkcombo) // nếu gia tri a lon hon thi insert a tai vi tri i
						{
							MainGame.getMode().insertElementAt(element, i); // Chèn đối tượng đã cho như là một phần tử vào Vector này tại index đã cho
							break;
						}
					else if(i==MainGame.getMode().getSize()-1)
						MainGame.getMode().addElement(element); 
				}
			}
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
		 else if(a==5||a==15||a==25||a==35) { // mua bến xe tại 4 vi trí có bến xe
			 
			 if(player==1) {
				if(buy[1][a]==0) {
					 Object[] options = {list[5],list[6]};
					 int n = JOptionPane.showOptionDialog(game,list[7],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION) // mua
						 {
						 	MainGame.setInialmoney1(MainGame.getInialmoney1()-getPriceini()); // set lai gia trị tiền của người chơi
						 	buy[1][a]=1;
						 	addElementToMode(a);
						 }
		 				
				}
				else { // nếu mua rùi
					int totalprice=0;
					for(int i=5;i<=35;i+=10) {
						if(buy[2][a]==1)
							totalprice++;
					} // bước for kiểm tra xem thằng máy tính mua được mấy bên xe
					if(totalprice==1) // mua dc một bến trừ tiền 1 bến 
						MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
					else if(totalprice==2)// 2 bến trừ tiền 2 bến 
						MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice2());
					else if(totalprice==3)// 3 bến trừ tiền 3 bến
						MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice3());
					else if(totalprice==4)// 4 bến trừ tiền 4 bến
						MainGame.setInialmoney1(MainGame.getInialmoney1()-getVilla());
				}
			 }
			 else if(player==2) { // máy chơi
				 if(buy[2][a]==0) {// nếu mình chưa mua máy sẽ kiểm tra xem mình đủ tiền mua không ?
					 if(MainGame.getInialmoney2()>getPriceini()+200) // đủ thì máy mua tư tưởng là lấy tiên hiện tại của minh so với giá đất +200
						 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()-getPriceini());
						 	buy[2][a]=1;
						 }
				}
				else {
					int totalprice=0;
					for(int i=5;i<=35;i+=10) {
						if(buy[1][a]==1)
							totalprice++;
					}
					if(totalprice==1)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1());
					else if(totalprice==2)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice2());
					else if(totalprice==3)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice3());
					else if(totalprice==4)
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getVilla());
				}
			 }
		 }
		 else if(buy[player][a]==0&&buy[check][a]!=0) // nếu tại vi trí này nhà đã bị mua , phải trả tiền nếu player =1 thì check =2 1 là minh 2 là máy
		 {
			 Object[] options = {list[3],list[4]};
			 if(buy[check][a]==1) // mua một nhà
			 {	
				 
				 if(player==1) { // nếu mình vô trừ tiền mình tăng tiền máy
					 int n = JOptionPane.showOptionDialog(game,list[0]+getPrice1()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 // hiển thị hộp thoại xác nhận nếu nhấn yes với yes là trả tiền no là phá sản
					 if(n==JOptionPane.YES_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice1());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) { // nếu máy vô trừ tiền máy tăng tiền mình
					 if(MainGame.getInialmoney2()>=getPrice1())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice1());
					 }
					 else if(MainGame.getInialmoney2()<getPrice1()) // nếu k đủ tiền phá sản
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice1());
					 }
				 }
			 }
			 else if(buy[check][a]==2) // nếu đã mua được 2 căn
			 {
				 if(player==1) { // nếu mình vô trừ tiền mình tăng tiền máy
					 int n = JOptionPane.showOptionDialog(game,list[0]+getPrice2()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice2());
							MainGame.setInialmoney1(MainGame.getInialmoney2()-getPrice2());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice2());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) {// nếu máy vô trừ tiền máy tăng tiền mình
					 if(MainGame.getInialmoney2()>=getPrice2())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice2());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice2());
					 }
					 else if(MainGame.getInialmoney2()<getPrice1())
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice2());
					 }
				 }
			 }
			 else if(buy[check][a]==3)
			 {
				 if(player==1) {
					 int n = JOptionPane.showOptionDialog(game,list[0]+getPrice3()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					 if(n==JOptionPane.YES_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice3());
							MainGame.setInialmoney1(MainGame.getInialmoney2()-getPrice3());
					 }
					 else if(n==JOptionPane.NO_OPTION)
					 {
						 MainGame.setInialmoney2(MainGame.getInialmoney2()+getPrice3());
							MainGame.setInialmoney1(0);
					 }
				 }
				 if(player==2) {
					 if(MainGame.getInialmoney2()>=getPrice3())
					 {
							MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice3());
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice3());
					 }
					 else if(MainGame.getInialmoney2()<getPrice1())
					 {
							MainGame.setInialmoney2(0);
							MainGame.setInialmoney1(MainGame.getInialmoney1()+getPrice3());
					 }
				 }
			 }
			 else
			 {
				 	JOptionPane.showOptionDialog(game,list[0]+getVilla()+list[1],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 	
			 }
		 }
		 else if(buy[player][a]==0) // nếu tại vi tri này chua mua có nghĩa là mình và máy chưa mua và chỉ vô duy nhất một lần vì mua xong sẽ chỉ cần nâng cấp nhà
		 {
			 if(player==1) { // player =1 là mình
				 Object[] options = {list[5],list[6]};
				 int n = JOptionPane.showOptionDialog(game,list[7],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
				 // hỏi muốn mua hay k yes hoac no
				 if(n==JOptionPane.YES_OPTION) // yes
				 {
					
					 	Object[] options1 = {list[8],list[9],list[10]}; // mua 1 nha 2 nhà 3 nhà 
					 	
					 
					 	int n1 = JOptionPane.showOptionDialog(game,list[14],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[2]);
					 	if(n1==JOptionPane.YES_OPTION) // mua 1 nha
					 		{
					 			buy[player][a]=1;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
					 			addElementToMode(a);
					 			
					 		}
					 	else if(n1==JOptionPane.NO_OPTION) // mua 2 nha
					 		{
					 			buy[player][a]=2;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice2());
					 			addElementToMode(a);
						 			
					 		}
					 	else if(n1==JOptionPane.CANCEL_OPTION) // mua 3 nha
					 		{
					 			buy[player][a]=3;
					 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice3());
					 			addElementToMode(a);
					 		}
					 		 				 	
				 }
			 }
			 else if(player==2) {
		 			if(MainGame.getInialmoney2()>getPrice3()+500) { // điều kiên để máy mua nhà 
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice3());
		 				buy[player][a]=3;
		 			}
		 			else if(MainGame.getInialmoney2()>getPrice2()+200) {
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice2());
		 				buy[player][a]=2;
		 			}
		 			else if(MainGame.getInialmoney2()>getPrice1()+100) {
		 				MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1());
		 				buy[player][a]=1;
		 			}
				}
		 }
		 else if(buy[player][a]!=0&&buy[player][a]<=4) { // đã mua nhà và chưa xây villa
			 if(buy[player][a]==1) {
				if(player==1) {
					 Object[] options1 = {list[9],list[10],list[11]};
					 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[2]);
					 	if(n1==JOptionPane.YES_OPTION) // xay từ nha 1 len nha 2 
				 		{
				 			buy[player][a]=2;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
				 		}
					 	else if(n1==JOptionPane.NO_OPTION) // xây từ nhà 2 len nhà 3
				 		{
				 			buy[player][a]=3;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1()*2);
				 		}
				}
				else if(player==2) { // với máy xét từ trên xuống dưới nếu đủ tiền mua luôn nhà 3 thì mua khong mua nha 2 không thì skip
					if(MainGame.getInialmoney2()>getPrice1()*2+500) { // xay từ nhà 1 len nha 3
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1()*2);
		 				buy[player][a]=3;
		 			}
		 			else if(MainGame.getInialmoney2()>getPrice1()+200) {// xay tu nha 1 len nha 2
		 				MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
		 				buy[player][a]=2;
		 			}
				}
			 }
			 else if(buy[player][a]==2) { // nếu đã có 2 nhà chỉ cần xây them nha 3
			if(player==1) {
				 Object[] options1 = {list[10],list[11]};
				 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[1]);
				 	if(n1==JOptionPane.YES_OPTION)
			 		{
			 			buy[player][a]=3;
			 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
			 		}
			}
			else if(player==2) { 
				if(MainGame.getInialmoney2()>getPrice1()+200) {
					MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1());
	 				buy[player][a]=3;
	 			}
			}
		}
			 else { 	// xay nha 3 rùi
				if(player==1) {
					 Object[] options1 = {list[12],list[11]};
					 	int n1 = JOptionPane.showOptionDialog(game,list[13],list[2],JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options1[1]);
					 	if(n1==JOptionPane.YES_OPTION) // xay villa
				 		{
				 			buy[player][a]=4;
				 			MainGame.setInialmoney1(MainGame.getInialmoney1()-getPrice1());
				 		}
				}
				else if(player==2) {
					if(MainGame.getInialmoney2()>getPrice1()+200) {
						MainGame.setInialmoney2(MainGame.getInialmoney2()-getPrice1());
		 				buy[player][a]=4;
		 			}
				}
			 }
		 }
		
	 }
}
