import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Marks1 extends Applet implements ActionListener {
    TextField txt1 = new TextField(10);
    TextField txt2 = new TextField(10);
    TextField txt3 = new TextField(10);
    TextField txt4 = new TextField(10);
    TextField txt5 = new TextField(10);
    TextField txt6 = new TextField(10);
    Label n1 = new Label("FIRST Mark:");
    Label n2 = new Label("SECOND Mark:");
    Label n3 = new Label("Third Mark");
    Label n4 = new Label("Fourth Mark");
    Label n5 = new Label("Fifth Mark");
    Label n6 = new Label("Percentage");
    Button btn = new Button("calculate percentage");

    public void init() {
        add(n1);
        add(txt1);
        add(n2);
        add(txt2);
        add(n3);
        add(txt3);
        add(n4);
        add(txt4);
        add(n5);
        add(txt5);
        add(n6);
        add(txt6);
        add(btn);

        a.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            int m1 = Integer.parseInt(txt1.getText());
            int m2 = Integer.parseInt(txt2.getText());
            int m3 = Integer.parseInt(txt3.getText());
            int m4 = Integer.parseInt(txt4.getText());
            int m5 = Integer.parseInt(txt5.getText());
            int total = m1 + m2 + m3 + m4 + m5;
            double percentage = total / 5.0;
            txt6.setText(" " + percentage);

           
            Graphics g = getGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());

            if (per > 50) {
                
                g.setColor(Color.YELLOW);
                g.fillOval(50, 50, 100, 100); 
                g.setColor(Color.BLACK);
                g.fillOval(70, 80, 15, 15); 
                g.fillOval(115, 80, 15, 15); 
                g.drawArc(70, 90, 60, 40, 180, 180); 
            } else {
                
                g.setColor(Color.YELLOW);
                g.fillOval(50, 50, 100, 100); 
                g.setColor(Color.BLACK);
                g.fillOval(70, 80, 15, 15); 
                g.fillOval(115, 80, 15, 15); 
                g.drawArc(70, 110, 60, 40, 0, 180); 
            }
        }
    }
}
