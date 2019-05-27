package GUI.ch09;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
	
	FlowLayoutEx(){
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container contentPane = getContentPane();
		
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculator"));
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
