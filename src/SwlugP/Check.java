package SwlugP;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Check extends myFrame implements ActionListener{
	
	Button btn1,btn2;
	Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
	String sidemenu, size;
	int price1=0, price2=0;

	Var var=new Var();
	Menu menu=new Menu();
	Order order=new Order();
	memberDAO mem=new memberDAO();

	public void checkrun() {
		
		lb1=new Label("�ֹ��Ͻ� ������ Ȯ�����ּ���.", Label.CENTER);
		lb1.setSize(200,50);
		lb1.setLocation(100,60);
		lb1.setBackground(Color.pink);
		add(lb1);
		
		lb7=new Label("��", Label.CENTER);
		lb7.setSize(100,50);
		lb7.setLocation(100,130);
		lb7.setBackground((new Color(200,235,255)));
		add(lb7);
		
		lb8=new Label(var.getMainMenu(), Label.CENTER);
		lb8.setSize(100,50);
		lb8.setLocation(180, 130);
		add(lb8);
		
		lb2=new Label(var.getSize(), Label.CENTER);
		lb2.setSize(100,50);
		lb2.setLocation(100,180);
		lb2.setBackground((new Color(200,235,255)));
		add(lb2);
		
		lb3=new Label(var.getSideMenu(), Label.CENTER);
		lb3.setSize(100,50);
		lb3.setLocation(100,230);
		lb3.setBackground((new Color(200,235,255)));
		add(lb3);
		
		btn1=new Button("����");
		btn1.setSize(50,30);
		btn1.setLocation(100,330);
		btn1.setBackground(new Color(202,202,255));
		add(btn1);
		
		btn2=new Button("Ȯ��");
		btn2.setSize(50,30);
		btn2.setLocation(250,330);
		btn2.setBackground(new Color(202,202,255));
		add(btn2);
		
		setVisible(true);
		
		size=var.getSize();
		if(size.equals("���ַ�")) {
			price1=+1700;
		}else if(size.equals("����")) {
			price1=+2200;
		}else price1=+3200;
		
		sidemenu=var.getSideMenu();
		if(sidemenu.equals("��ġ����")) {
			price2=+600;
		}else if(sidemenu.equals("ü��ġ��")) {
			price2=+600;
		}else if(sidemenu.equals("����ġ��")) {
			price2=+1200;
		}else if(sidemenu.equals("����Ķ���")) {
			price2=+600;
		}else if(sidemenu.equals("������ġ")) {
			price2=+600;
		}else price2=+0;
		
		lb4=new Label(Integer.toString(price1)+"��", Label.CENTER);
		lb4.setSize(100,50);
		lb4.setLocation(180,180);
		add(lb4);
		
		lb5=new Label(Integer.toString(price2)+"��", Label.CENTER);
		lb5.setSize(100,50);
		lb5.setLocation(180,230);
		add(lb5);
		
		lb6=new Label("�Ѿ� : "+Integer.toString(price1+price2)+"��", Label.CENTER);
		lb6.setSize(100,50);
		lb6.setLocation(150,280);
		add(lb6);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		var.setPrice(Integer.toString(price1+price2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String name;
		name=ae.getActionCommand();
		
		if(name.equals("����")) {
			if(var.getMainMenu().equals("ġ��")) {
				order.chi();
				dispose();
			}else if(var.getMainMenu().equals("��â")) {
				order.Gob();
				dispose();
			}else if(var.getMainMenu().equals("��������")) {
				order.Je();
				dispose();
			}else if(var.getMainMenu().equals("�����ܱ�ġ")) {
				order.Sae();
				dispose();
			}else if(var.getMainMenu().equals("��ġ����")) {
				order.Cham();
				dispose();
			}else {order.Yang();
				dispose();
			}
		}else {
			JOptionPane.showMessageDialog(null,"�ֹ��Ǿ����ϴ�.");
			mem.menuadd();
			menu.menurun();
			dispose();
		}
		
	}

}
