/*Create a simple java Applet that shows the events of MouseListener interface with the mouse icon on Applet window ucing MouseListener interface*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseListeners" width=300 height=100>
</applet>
*/
public class MouseListeners extends Applet implements MouseListener
{
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse
    public void init()
    {
        addMouseListener(this);
    }
    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me)
    {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse clicked.";
        repaint();
    }
    // Handle mouse entered.
    public void mouseEntered(MouseEvent me)
    {
        // save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    }
    // Handle mouse exited.
    public void mouseExited(MouseEvent me)
    {
        // save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }
    // Handle button pressed.
    public void mousePressed(MouseEvent me)
    {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }
    // Handle button released.
    public void mouseReleased(MouseEvent me)
    {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }
    // Display msg in applet window at current X,Y location.
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}