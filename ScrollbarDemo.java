import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ScrollbarDemo.class" width=350 height=250>
</applet>
*/
public class ScrollbarDemo extends Applet implements AdjustmentListener
{
	Scrollbar sbf;
	TextField t1,t2;
	Label l1,l2;
	public void init()
	{
		setBackground(Color.red);
		sbf=new Scrollbar(Scrollbar.HORIZONTAL,1,1,1,108);
		l1=new Label("Temp in F");	
		l2=new Label("Temp in c");	

	//PG 717 Scrollbar(int style, int initialValue, int thumbSize, int min, int max)
		t1=new TextField(20);
		t2=new TextField(20);
                setLayout(null);
 		l1.setBounds(10,20,150,30);t1.setBounds(180,20,150,30);
 		l2.setBounds(10,80,150,30);t2.setBounds(180,80,150,30);
		sbf.setBounds(75,150,150,30);
		add(t1);add(t2);add(l1);add(l2);add(sbf);
		sbf.addAdjustmentListener(this);
		
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{       double f1,c1;
		f1=sbf.getValue();
		t1.setText(String.valueOf(f1));
		c1=(f1-32)*5/9.0;
		t2.setText(String.valueOf(c1));		
		repaint();
	}
	public void paint(Graphics g)
	{
		
		
	}
}





	
	