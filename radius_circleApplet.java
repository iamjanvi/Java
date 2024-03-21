import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class radius_circleApplet extends Applet
{

public void paint(Graphics g)
{
 Dimension d = getSize();
 int xc = d.width/2;
 int yc=d.width/2;
 String str1;
 int r1;
 str1=getParameter("radius");
 r1=Integer.parseInt(str1);
 g.setColor(Color.cyan);
 g.fillOval(xc-r1,yc-r1,2*r1,2*r1);
}
}
