package SwlugP;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Order extends myFrame implements ActionListener, ItemListener{
	
	JLabel lb1,lb3;
	Image image=null;
	Choice cho,cho2;
	Button btn1,btn2;
	Label lb2,lb4,lb5;
	TextField tf1;
	

	public void chi() {
		
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("chi.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);

		setVisible(true);
		
	}
	
	public void Gob() {
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("chi.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);
		
		setVisible(true);
	}
	
	public void Je() {
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("Je.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);
		
		setVisible(true);
	}
	
	public void Cham() {
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("cham.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);
		
		setVisible(true);
	}
	
	public void Sae() {
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("chi.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);
		
		setVisible(true);
	}
	
	public void Yang() {
		lb4=new Label("사이즈와 토핑을 선택해주세요!", Label.CENTER);
		lb4.setSize(350,20);
		lb4.setLocation(25,40);
		add(lb4);
		lb4.setBackground(new Color(173,221,83));
		
		try {
			File sourceimage=new File("Yang.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb1=new JLabel(new ImageIcon(image));
		lb1.setSize(180,160);
		lb1.setLocation(100,50);
		add(lb1);
		
		try {
			File sourceimage=new File("요정.PNG");
			image=ImageIO.read(sourceimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 파일이 없습니다.");
		}
	
		lb3=new JLabel(new ImageIcon(image));
		lb3.setSize(150,150);
		lb3.setLocation(50,190);
		add(lb3);
		
		cho=new Choice();
		add(cho);
		
		cho.add("사이즈 선택");
		cho.add("레귤러");
		cho.add("빅츄");
		cho.add("슈퍼더블빅");
		cho.setLocation(250,220);
		
		cho2=new Choice();
		add(cho2);
		
		cho2.add("토핑 추가");
		cho2.add("참치마요");
		cho2.add("체다치즈");
		cho2.add("피자치즈");
		cho2.add("계란후라이");
		cho2.add("볶음김치");
		cho2.add("추가없음");
		cho2.setLocation(250,270);

		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,350);
		btn1.setBackground(new Color(173,221,83));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,350);
		btn2.setBackground(new Color(173,221,83));
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		cho.addItemListener(this);
		cho2.addItemListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		String name;
		name=ae.getActionCommand();
		
		Menu menu= new Menu();
		Check check=new Check();
		if(name.equals("이전")) {
			menu.menurun();
			dispose();
		}else {
			check.checkrun();
			dispose();
		}

	}
	


	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		Var var=new Var();
		
		String size=cho.getSelectedItem();
		var.setSize(size);
		
		String sidemenu=cho2.getSelectedItem();
		var.setSideMenu(sidemenu);
	}


}
