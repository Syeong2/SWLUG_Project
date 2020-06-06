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
		
		lb1=new Label("주문하신 내역을 확인해주세요.", Label.CENTER);
		lb1.setSize(200,50);
		lb1.setLocation(100,60);
		lb1.setBackground(Color.pink);
		add(lb1);
		
		lb7=new Label("맛", Label.CENTER);
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
		
		btn1=new Button("이전");
		btn1.setSize(50,30);
		btn1.setLocation(100,330);
		btn1.setBackground(new Color(202,202,255));
		add(btn1);
		
		btn2=new Button("확인");
		btn2.setSize(50,30);
		btn2.setLocation(250,330);
		btn2.setBackground(new Color(202,202,255));
		add(btn2);
		
		setVisible(true);
		
		size=var.getSize();
		if(size.equals("레귤러")) {
			price1=+1700;
		}else if(size.equals("빅츄")) {
			price1=+2200;
		}else price1=+3200;
		
		sidemenu=var.getSideMenu();
		if(sidemenu.equals("참치마요")) {
			price2=+600;
		}else if(sidemenu.equals("체다치즈")) {
			price2=+600;
		}else if(sidemenu.equals("피자치즈")) {
			price2=+1200;
		}else if(sidemenu.equals("계란후라이")) {
			price2=+600;
		}else if(sidemenu.equals("볶음김치")) {
			price2=+600;
		}else price2=+0;
		
		lb4=new Label(Integer.toString(price1)+"원", Label.CENTER);
		lb4.setSize(100,50);
		lb4.setLocation(180,180);
		add(lb4);
		
		lb5=new Label(Integer.toString(price2)+"원", Label.CENTER);
		lb5.setSize(100,50);
		lb5.setLocation(180,230);
		add(lb5);
		
		lb6=new Label("총액 : "+Integer.toString(price1+price2)+"원", Label.CENTER);
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
		
		if(name.equals("이전")) {
			if(var.getMainMenu().equals("치삼")) {
				order.chi();
				dispose();
			}else if(var.getMainMenu().equals("곱창")) {
				order.Gob();
				dispose();
			}else if(var.getMainMenu().equals("제육볶음")) {
				order.Je();
				dispose();
			}else if(var.getMainMenu().equals("새우햄김치")) {
				order.Sae();
				dispose();
			}else if(var.getMainMenu().equals("참치마요")) {
				order.Cham();
				dispose();
			}else {order.Yang();
				dispose();
			}
		}else {
			JOptionPane.showMessageDialog(null,"주문되었습니다.");
			mem.menuadd();
			menu.menurun();
			dispose();
		}
		
	}

}
