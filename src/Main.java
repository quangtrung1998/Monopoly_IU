import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static int f=1,a;
	static MenuGame menugame ;
	static ValueInitial valueinitial;
	public static void main(String[] args) throws InterruptedException  {
	
		while(true) {
			if(f==1) {
			    menugame = new MenuGame();
				BackgroundMenugame backgroundmenugame = new BackgroundMenugame();
				menugame.add(backgroundmenugame);
				menugame.Show();
				f++;
			}
			else if(Test.getA()==2)
			{	valueinitial = new ValueInitial();
				valueinitial.getValue();
				MainGame.run();
				f=1;
				Test.setA(1);
			}
			if(Test.getA()!=2) {
				menugame.btnDice.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						Test.setA(2);
						menugame.dispose();
				}
			});
				
				
			}
		}
		
	}

}
