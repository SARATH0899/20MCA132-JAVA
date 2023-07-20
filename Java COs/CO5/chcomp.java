import java.applet.*;
import java.awt.*;

public class chcomp extends Applet {
	private Choice ch;
	
    public void init() {
        ch = new Choice();
		
        ch.addItem("Choose Shape");
        ch.addItem("Rectangle");
        ch.addItem("Square");
        ch.addItem("Circle");
        ch.addItem("Triangle");
        add(ch);
	}
	
	public void paint(Graphics g) {
		String n = ch.getSelectedItem();
		g.setColor(Color.GRAY);
		
		if (n.equals("Rectangle")) {
            g.fillRect(50, 50, 200, 100);
        } else if (n.equals("Triangle")) {
            int[] xPoints = {150, 50, 250};
            int[] yPoints = {50, 150, 150};
            g.fillPolygon(xPoints, yPoints, 3);
        } else if (n.equals("Square")) {
            g.fillRect(50, 50, 100, 100);
        } else if (n.equals("Circle")) {
            g.fillOval(50, 50, 100, 100);
        }
	}
}
