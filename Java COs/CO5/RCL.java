import java.applet.Applet;
import java.awt.*;

public class RCL extends Applet {
    public void paint(Graphics g) {
        
        g.setColor(Color.PINK);
        g.fillOval(50, 50, 100, 100);

        g.setColor(Color.GRAY);
        g.fillRect(200, 50, 150, 100);

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 350, 200);
    }
}
