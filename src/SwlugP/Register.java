package SwlugP;

import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Register extends myFrame implements ActionListener{
	
	Button btn1;
	Label lb1, lb2, lb3;
	TextField tf1, tf2, tf3;
	JLabel lb4;
	Image image;
	
	private String id;
	private String passwd;
	private String phonenumber;
	
	memberDAO mem=new memberDAO();
	
	Var var=new Var();

	
	public void registerRun() {
		
		try {
			File sourceimage=new File("�׸�111.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� ������ �����ϴ�.");
		}
	
		lb4=new JLabel(new ImageIcon(image));
		lb4.setSize(200,100);
		lb4.setLocation(100,20);
		add(lb4);
		
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
		lb2.setLocation(80,195);
		add(lb2);

		tf2=new TextField();
		tf2.setSize(100,25);
		tf2.setLocation(190,210);
		add(tf2);
		
		lb3=new Label("�޴��� ��ȣ : ");
		lb3.setSize(100,50);
		lb3.setLocation(80,260);
		add(lb3);
		
		tf3=new TextField();
		tf3.setSize(100,25);
		tf3.setLocation(190,275);
		add(tf3);
				
		btn1=new Button("����");
		btn1.setSize(100,50);
		btn1.setLocation(150,330);
		add(btn1);
		btn1.setBackground(Color.ORANGE);
		
		setVisible(true);
		
		btn1.addActionListener(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String name;
		name=ae.getActionCommand();

		Login login=new Login();
		
		memberDAO mem=new memberDAO();


		if(name.equals("����")) {
			id=tf1.getText();
			passwd=tf2.getText();
			phonenumber=tf3.getText();
			
			var.setId(id);
			var.setPassWd(passwd);
			var.setPhoneNumber(phonenumber);
			if(id.equals("admin")) {
				JOptionPane.showMessageDialog(null,"������ �������δ� ������ �Ұ��մϴ�.");
			}else if(mem.checkid(id)){
				JOptionPane.showMessageDialog(null,"�̹� �����ϴ� ���̵��Դϴ�.");
			}else {
				mem.add();
			
				JOptionPane.showMessageDialog(null,"���� �Ǿ����ϴ�.");
				login.run();
				dispose();
			}

		}
	}

}
