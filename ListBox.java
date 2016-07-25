import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="ListBox" width=500 height=500>
</applet>*/
public class ListBox extends Applet implements ActionListener,ItemListener
{
	Label l1,l2,l3;
	List os,s;
	Button b1,b2,b3,b4;
	String msg;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.orange);
		l1=new Label("Operating Systems");
		l2=new Label("Chosen Systems");
		l3=new Label("Selected Systems are:-");
		os=new List(5,true);
		s=new List(5,true);
		setLayout(null);
		os.add("Win 98");
		os.add("Win ME");
		os.add("Win XP");
		os.add("Win Vista");
		os.add("Win 7");
		b1=new Button(">");
		b2=new Button(">>");
		b3=new Button("<");
		b4=new Button("<<");
		l1.setBounds(20,10,100,30);
		l2.setBounds(220,10,100,30);
		os.setBounds(20,60,100,200);
		b1.setBounds(140,60,60,35);
		b2.setBounds(140,115,60,35);		
		b3.setBounds(140,170,60,35);
		b4.setBounds(140,225,60,35);
		s.setBounds(220,60,100,200);
		l3.setBounds(20,280,150,30);
		add(l1);
		add(l2);
		add(l3);
		add(os);
		add(s);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		os.addActionListener(this);
		s.addActionListener(this);
		os.addItemListener(this);
		s.addItemListener(this);
		b1.addActionListener(this);				
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
public void itemStateChanged(ItemEvent i)
{repaint();}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			s.add(os.getSelectedItem());
			os.remove(os.getSelectedIndex());
			
		}
		else if(e.getSource()==b2)
		{
			String a[];
			a=os.getSelectedItems();
			for(int i=0;i<a.length;i++)
			{
				s.add(a[i]);
				os.remove(a[i]);
			}
		    
		}
		else if(e.getSource()==b3)
		{
			os.add(s.getSelectedItem());
			s.remove(s.getSelectedItem());
			
		}
		else if(e.getSource()==b4)
		{
			String x[];
			x=s.getSelectedItems();
			for(int i=0;i<x.length;i++)
			{
				os.add(x[i]);
				s.remove(x[i]);
			}
		   	
		}
		
	}
	public void paint(Graphics g)
	{
		int y[];
		int p=330;
		msg="";
		y=os.getSelectedIndexes();
		for(int i=0;i<y.length;i++)
		{
			msg=os.getItem(y[i]);
			g.drawString(msg,20,p);
			p=p+20;
		}

		y=s.getSelectedIndexes();
		for(int i=0;i<y.length;i++)
		{
			msg=s.getItem(y[i]);
			g.drawString(msg,20,p);
			p=p+20;
		}
	}

}