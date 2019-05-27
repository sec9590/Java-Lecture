package GUI.ch09;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();		
		
		c.setLayout(new BorderLayout());
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("calc"), BorderLayout.CENTER);
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
