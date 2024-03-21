import java.applet.Applet;
import java.awt.Graphics;

public class divideRect_Applet extends Applet
{

public void paint(Graphics g)
{
g.drawRect(100,100,180,100);
g.drawLine(100,120,280,120);
g.drawLine(100,140,280,140);
g.drawLine(100,160,280,160);
g.drawLine(100,180,280,180);

showStatus("Applet with rectangle");
}
}
