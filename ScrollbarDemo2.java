import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ScrollbarDemo2.class" width=500 height=500>
</applet>
*/
public class ScrollbarDemo2 extends Applet implements AdjustmentListener
{
	Scrollbar sbr,sbg,sbb;
	TextField t;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,30,50));
		sbr=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sbg=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sbb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		t=new TextField(20);
		add(t);
		sbr.addAdjustmentListener(this);
		sbg.addAdjustmentListener(this);
		sbb.addAdjustmentListener(this);
		add(sbr);
		add(sbg);
		add(sbb);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		t.setText(String.valueOf(sbr.getValue()));
		repaint();
	}
	public void paint(Graphics g)
	{
		Color mix=new              Color(sbr.getValue(),sbg.getValue(),sbb.getValue());
		setBackground(mix);
		
	}
}





	
	