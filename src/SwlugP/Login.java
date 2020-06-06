package SwlugP;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login extends myFrame implements ActionListener{	
	
	Button btn1, btn3;
	Menu menu=new Menu();
	TextField tf1, tf2;
	Label lb1, lb2;
	JLabel lb3;
	Image image=null;

	
	Management management=new Management();
	Register register=new Register();
	memberDAO mem=new memberDAO();
	
	Var var=new Var();
	
	public void run() {
		
		try {
			File sourceimage=new File("�׸�111.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� ������ �����ϴ�.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(200,100);
		lb3.setLocation(100,20);
		add(lb3);
		
		lb1=new Label("���̵� : ");
		lb1.setSize(50,50);
		lb1.setLocation(80,130);
		add(lb1);
		
		tf1=new TextField();
		tf1.setSize(100,25);
		tf1.setLocation(190,145);
		add(tf1);
		
		lb2=new Label("��й�ȣ : ");
		lb2.setSize(100,50);
		lb2.setLocation(80,210);
		add(lb2);

		tf2=new TextField();
		tf2.setSize(100,25);
		tf2.setLocation(190,225);
		add(tf2);
		
		btn1=new Button("�α���");
		btn1.setSize(100,50);
		btn1.setLocation(50,300);
		btn1.setBackground(Color.orange);
		
		btn3=new Button("ȸ������");
		btn3.setSize(100,50);
		btn3.setLocation(250, 300);
		btn3.setBackground(Color.orange);
		
		add(btn1);
		add(btn3);
		
		setVisible(true);
		
		btn1.addActionListener(this);
		btn3.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String name;
		name=ae.getActionCommand();

		if(name.equals("�α���")) {
			
			String id=tf1.getText();
			String passwd=tf2.getText();
			var.setId(id);
			var.setPassWd(passwd);
			if(mem.login(id, passwd)) {
				if(id.equals("admin")) {
					management.managementrun();
					dispose();
				}else {
					menu.menurun();
					dispose();
				}
			}else {
				JOptionPane.showMessageDialog(null,"���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
			}
		}else {
			register.registerRun();
			dispose();
		}
	}

}
