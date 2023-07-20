import java.applet.Applet;
import java.awt.*;
public class FirstPgm extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawOval(10,10,250,250);
		g.setColor(Color.blue);
		g.fillOval(160,75,50,50);
		g.fillOval(65,75,50,50);
		g.setColor(Color.green);
		g.drawArc(80,130,100,75,200,150);
	}
}

