/*Create a simple java Applet that shows the mouse moving and dragging position on the status bar of the Applet window ucing MouseMotionListener interface*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseMovingPositionStatusBar" width=300 height=100>
</applet>
*/
public class MouseMovingPositionStatusBar extends Applet implements MouseMotionListener
{
    public void init()
    {
        addMouseMotionListener(this);
    }
    // Handle mouse dragged.
    public void mouseDragged(MouseEvent me)
    {
        showStatus("Dragging mouse at " + me.getX() + ", " + me.getY());
        repaint();
    }
    // Handle mouse moved.
    public void mouseMoved(MouseEvent me)
    {
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
      repaint();
   }

}
