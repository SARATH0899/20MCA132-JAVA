import java.applet.*;
import java.awt.*;

public class FacePgm extends Applet {
    
    public void paint(Graphics g) {
        // Draw a happy face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 25, 25);
        g.fillOval(175, 100, 25, 25);
        g.drawArc(100, 150, 100, 50, 180, 180);
        
        // Draw a sad face
        g.setColor(Color.YELLOW);
        g.fillOval(300, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(350, 125, 25, 25);
        g.fillOval(425, 125, 25, 25);
        g.drawArc(350, 180, 100, 50, 0, 180);
    }
}