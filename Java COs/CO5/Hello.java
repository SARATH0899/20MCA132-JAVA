import java.applet.Applet;
import java.awt.Graphics;
public class Hello extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 50, 25);
    }
}

/*

<html>

<head>
    <TITLE> A Simple Program </TITLE>
</head>

<body>
    Here is the output of my program:
    <applet code="Hello.class" width="150" height="25"></applet>
</body>

</html>
*/