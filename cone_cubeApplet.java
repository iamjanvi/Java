
import java.applet.Applet;
import java.awt.Graphics;


public class cone_cubeApplet extends Applet
{
public void paint(Graphics g)
{

g.drawString("(a).Cylinder",10,110);
g.drawOval(10,10,50,10);
g.drawOval(10,80,50,10);
g.drawLine(10,15,10,85);
g.drawLine(60,15,60,85);

g.drawString("(b).Cube",95,110);
g.drawRect(80,10,50,50);
g.drawRect(95,25,50,50);
g.drawLine(80,10,95,25);
g.drawLine(103,10,145,25);
g.drawLine(80,60,95,75);
g.drawLine(103,60,145,75);

g.drawString("(C).Cone",200,110);
g.drawRect(200,15,175,85);
g.drawRect(200,15,225,85);
g.drawLine(175,80,50,15);

showStatus("Applet with cone,cylinder and cube");
}
}
