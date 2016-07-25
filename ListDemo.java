
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ListDemo" width=300 height=180>
</applet>
*/
public class ListDemo extends Applet implements ItemListener
 {
	List os;
	String msg = "";
	public void init() 
	{
	  os = new List(4, true);
	  setLayout(null);
          os.setBounds(10,10,200,100);		
	  // add items to os list
          os.add("Windows 98/XP");
	  os.add("Windows NT/2000");
	  os.add("Solaris");
	  os.add("MacOS");
	  os.select(2);
	  // add lists to window
	  add(os);
	  os.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ae) 
	{
	   repaint();
	}

	public void paint(Graphics g) 
	{
	  int idx[];
	  msg = "Current OS: ";
	  idx = os.getSelectedIndexes();
	  for(int i=0; i<idx.length; i++)
             msg += os.getItem(idx[i]) + " ";

	g.drawString(msg, 6, 120);
	}
}