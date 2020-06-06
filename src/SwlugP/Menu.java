package SwlugP;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Menu extends myFrame implements ActionListener{

	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
	Label lb1;
	Order order=new Order();
	JLabel lb2, lb3;
	Image image;

	
	public void menurun() {
		
		try {
			File sourceimage=new File("Ãò¹ä·Î°í1.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ÀÌ¹ÌÁö ÆÄÀÏÀÌ ¾ø½À´Ï´Ù.");
		}
	
		lb2=new JLabel(new ImageIcon(image));
		lb2.setSize(60,60);
		lb2.setLocation(50,30);
		add(lb2);
		
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(60,60);
		lb3.setLocation(300,30);
		add(lb3);
		
		lb1=new Label("<¸Þ´º ¾È³»>",Label.CENTER);
		lb1.setSize(100,50);
		lb1.setLocation(150,30);
		lb1.setBackground(Color.white);
		
		btn1=new Button("Ä¡»ï");
		btn1.setSize(100,50);
		btn1.setLocation(75,100);
		btn1.setBackground((new Color(103,190,99)));
		
		btn2=new Button("°öÃ¢");
		btn2.setSize(100,50);
		btn2.setLocation(225,100);
		btn2.setBackground((new Color(103,190,99)));
		
		btn3=new Button("Á¦À°ººÀ½");
		btn3.setSize(100,50);
		btn3.setLocation(75,170);
		btn3.setBackground((new Color(103,190,99)));

		btn4=new Button("ÂüÄ¡¸¶¿ä");
		btn4.setSize(100,50);
		btn4.setLocation(225,170);
		btn4.setBackground((new Color(103,190,99)));

		btn5=new Button("»õ¿ìÇÜ±èÄ¡");
		btn5.setSize(100,50);
		btn5.setLocation(75,240);
		btn5.setBackground((new Color(103,190,99)));

		btn6=new Button("¾ç³ä°¥ºñ");
		btn6.setSize(100,50);
		btn6.setLocation(225,240);
		btn6.setBackground((new Color(103,190,99)));
		
		btn7=new Button("·Î±×¾Æ¿ô");
		btn7.setSize(100,30);
		btn7.setLocation(150,310);
		btn7.setBackground((new Color(240,64,49)));

		
		add(lb1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Login login=new Login();
		Var var=new Var();
		
		String name;
		name=ae.getActionCommand();
		
		if(name.equals("Ä¡»ï")) {
			order.chi();
			var.setMainMenu(name);
			dispose();
		}else if (name.equals("°öÃ¢")) {
			order.Gob();
			var.setMainMenu(name);
			dispose();
		}else if (name.equals("Á¦À°ººÀ½")) {
			order.Je();
			var.setMainMenu(name);
			dispose();
		}else if(name.equals("ÂüÄ¡¸¶¿ä")) {
			order.Cham();
			var.setMainMenu(name);
			dispose();
		}else if (name.equals("»õ¿ìÇÜ±èÄ¡")) {
			order.Sae();
			var.setMainMenu(name);
			dispose();
		}else if (name.equals("¾ç³ä°¥ºñ")) {
			order.Yang();
			var.setMainMenu(name);
			dispose();
		}else {
			login.run();
			dispose();
		}
	}

}
