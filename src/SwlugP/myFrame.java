package SwlugP;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.*;

public class myFrame extends Frame{

	ImageIcon icon;
	public myFrame() {
		setSize(400,400);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		setLocation(screenSize.width/2-200, screenSize.height/2-200);
		setLayout(null);
	    this.setBackground(Color.white);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
