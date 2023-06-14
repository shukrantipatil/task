
	package shukranti;
	import java.awt.*;
	import java.applet.*;
	public class Applet {
	public void paint ( Graphics g)
	{
		for(int i=0;i<=4;i++) {
			if (i%2==0) {
				g.drawOval(90, i*50+ 10, 50,50);
				
			}
			else
			{
				g.fillOval(90,i*50+10,50,50);
			}
		}
	}


			
		}


