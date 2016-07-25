import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ListApp.class" width=400 height=450>
</applet>
*/
public class ListApp extends Applet implements ItemListener,ActionListener
{
	List os1,os2;
	Button b1,b2,b3,b4;
	String msg;
	public void init()
	{	setBackground(new Color(0,0,0));
		Font f=new Font("Dialog",Font.BOLD|Font.ITALIC,12);
		setFont(f);
		setLayout(null);

		os1=new List(4,true);
		os2=new List(4,true);

		b1=new Button(" <");
		b2=new Button(" <<");
		b3=new Button(" >");
		b4=new Button(" >>");
		
		os1.add("Windows 98");
		os1.add("Windows NT");
		os1.add("Windows 2000");
		os1.add("Linux ");
		os1.add("Windows Me");

		os1.setBounds(20,90,100,130);
		os2.setBounds(260,90,100,130);
		
		b1.setBounds(140,80,100,30);
		b2.setBounds(140,120,100,30);							b3.setBounds(140,160,100,30);
		b4.setBounds(140,200,100,30);

		b1.setBackground(new Color(255,120,0));
		b2.setBackground(new Color(255,120,0));
		b3.setBackground(new Color(255,120,0));
		b4.setBackground(new Color(255,120,0));

		os1.setBackground(new Color(255,120,0));
		os2.setBackground(new Color(255,120,0));
		setForeground(new Color(255,120,0));

		add(os1);
		add(os2);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		os1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	      {
	 	repaint();
	       }
	
        public void paint(Graphics g)
	  {
	      int y=290;
	      String item[]=os1.getSelectedItems();
		setForeground(new Color(255,120,0));
	      g.drawString(" Available Items :" ,20,60);
	      g.drawString(" Selected Items :" ,260,60);	
	      g.drawString(" You Selected following :" ,30,260);
		for(int i=0;i<item.length;i++)
	        { 
		  g.drawString(item[i],30,y);
		   y+=30;
	        }
	  }
        public void actionPerformed(ActionEvent ae)
            {  String item[]=os1.getSelectedItems();
		if(ae.getSource()==b4)
		  {
		    for(int i=0;i<item.length;i++)
	               {  
		          os2.add(item[i],i);
			  os1.remove(item[i]);
	                 }
		   }
	     }

}
	
		
	
	