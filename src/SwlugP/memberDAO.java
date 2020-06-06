package SwlugP;

import java.sql.*;
import java.util.Vector;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class memberDAO {
	
	public String DRIVER="org.git.mm.mysql.Driver";
	public static String URL="jdbc:mysql://localhost:3306/swlugplogin?useUnicode=true&characterEncoding=utf8";
	public static String USER="root";
	public static String PASS="1111";
	
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;
	Var var;
	//DB 연결 메소드
		
	public int add() {
		try {
			Class.forName("org.git.mm.mysql.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int i=0;
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
			String sql="insert into login(id,passwd,phone)"+
			"values(?,?,?)";
			
			String id=var.getId();
			String pw=var.getPassWd();
			String phone=var.getPhoneNumber();
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, phone);
			
			i=pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			
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
			return i;
	}
	
	public static boolean login(String id, String password) {
		
		boolean flag=false;
		String pass;
		try {
			Class.forName("org.git.mm.mysql.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
			String sql="Select * from login where id=?";
			
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				pass=rs.getString("passwd");

				if(pass.equals(password)) {
					flag=true;
				}
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
		return flag;
	}
	
public static boolean checkid(String id) {
		
		boolean flag=false;
		String Id;
		try {
			Class.forName("org.git.mm.mysql.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
			String sql="Select * from login where id='"+id+"'";
			
			
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				flag=true;
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
		return flag;
	}
	
	public int menuadd() {
		try {
			Class.forName("org.git.mm.mysql.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int i=0;
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
			String sql="insert into menu(mainmenu,size,sidemenu,price)"+
			"values(?,?,?,?)";
			
			String mainmenu=var.getMainMenu();
			String size=var.getSize();
			String sidemenu=var.getSideMenu();
			String price=var.getPrice();
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mainmenu);
			pstmt.setString(2, size);
			pstmt.setString(3, sidemenu);
			pstmt.setString(4, price);
			
			i=pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			
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
			return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
