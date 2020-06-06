package SwlugP;

import javax.swing.table.DefaultTableModel;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.*;

public class Management extends myFrame implements ActionListener{
	
	
	public String DRIVER="org.git.mm.mysql.Driver";
	public static String URL="jdbc:mysql://localhost:3306/swlugplogin?useUnicode=true&characterEncoding=utf8";
	public static String USER="root";
	public static String PASS="1111";
	
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;
	
	JButton btn1;
	
	public void managementrun() {
		try {
			Class.forName("org.git.mm.mysql.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		  String title[]= {"메인메뉴","사이즈","토핑","가격"};
		  JFrame frame = new JFrame();
		  DefaultTableModel model = new DefaultTableModel(title, 0); 
		  JTable table = new JTable(model);
		  String arr[]={"메인메뉴","사이즈","토핑","가격"};
		  model.addRow(arr); //테이블에 행 추가
		  String str=null;
		  String a;
		int i;
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
			String sql="select * from menu";
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				str=rs.getString(1);
				
				arr[0]=str;
				for(i=2;i<5;i++) {
					a=rs.getString(i);
					arr[i-1]=a+"";
				}
				
				model.addRow(arr);
			}
			
			
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)
						pstmt.close();
					if(conn!=null)
						conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		  
		  btn1= new JButton("로그아웃");
		  
		  table.setBackground(new Color(234,248,209));
		  btn1.setBackground(new Color(170,225,79));
		  
		  this.setLayout(new BorderLayout(5,5));
		  this.add(table, BorderLayout.CENTER);
		  this.add(btn1, BorderLayout.SOUTH);
		  setBounds(0,0,400,400);
		  setLocation(screenSize.width/2-200, screenSize.height/2-200);
		  setVisible(true);
		  
		  btn1.addActionListener(this);

	}
     public static void main(String[] ar){
  //생성된 프레임창에 데이터가 삽입된 테이블을 출력
  
 }
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String name;
		name=ae.getActionCommand();
		
		Login login = new Login();
		
		if(name.equals("로그아웃")) {
			login.run();
			dispose();
		}
	}
}