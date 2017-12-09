import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private static int f=1;
	
	private static MenuGame menugame ;
	public static void main(String[] args) throws InterruptedException  {
		while(true) {
			if(f==1) {
			    menugame = new MenuGame();
				menugame.shown();
				f++;
			}
			else if(Test.getA()==2)
			{	
				ValueInitial.getValue();
				MainGame.run();
				f=1;
				Test.setA(1);
			}
			if(Test.getA()!=2) {
				MenuGame.getBtnDice().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						Test.setA(2);
						menugame.dispose();
				}
			});
				
				
			}
		}
		
	}
	

}
