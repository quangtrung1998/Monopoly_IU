import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private static int f=1;
	private static MenuGame menugame ;
	private static  ValueInitial valueinitial;
	private static  MainGame maingame;
	private static Test test;
	
	public static void main(String[] args) throws InterruptedException  {
		while(true) {
			if(f==1) {
			    menugame = new MenuGame();
				menugame.shown();
				f++;
			}
			else if(test.getA()==2)
			{	
				valueinitial.getValue();
				maingame.runPlay();
				f=1;
				test.setA(1);
			}
			else if(test.getA()==3)
			{
				break;
			}
			if(test.getA()!=2) {
				menugame.getBtnDice().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						test.setA(2);
						menugame.dispose();
				}
			});
				menugame.getBtnDice1().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						test.setA(3);
						menugame.dispose();
				}
			});
				
				
			}
		}
		
	}
	

}
