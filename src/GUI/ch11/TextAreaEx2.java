package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextAreaEx2 extends JFrame {
	Container contentPane;

	TextAreaEx2() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel());
		setSize(300, 500);
		setVisible(true);
	}

	class MyCenterPanel extends JPanel {
		JButton btn;
		String[] text = { "오만원", "만원", "천원", "오백원", "백원", "오십원", "십원", "일원" };
		JTextField source;
		JTextField[] tf = new JTextField[8];

		MyCenterPanel() {
			setBackground(Color.pink);
			setLayout(null);
			JLabel la = new JLabel("금액");
			la.setSize(50, 20);
			la.setLocation(10, 20);
			add(la);

			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(50, 20);
			add(source);

			btn = new JButton("계산");
			btn.setSize(50, 20);
			btn.setLocation(170, 20);
			add(btn);	
			
			for (int i = 0; i < tf.length; i++) {		
				tf[i] = new JTextField(30);
				tf[i].setSize(100, 20);
				tf[i].setLocation(50, 50 + i * 20);
				add(tf[i]);
			}

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int s = 0;
					int money = Integer.parseInt(source.getText());
					tf[0].setText(Integer.toString(money / 50000));
					s = money - ((money / 50000) * 50000);
					tf[1].setText(Integer.toString(s / 10000));
					s -= (s / 10000) * 10000;
					tf[2].setText(Integer.toString(s / 1000));
					s -= (s / 1000) * 1000;
					tf[3].setText(Integer.toString(s / 500));
					s -= (s / 500) * 500;
					tf[4].setText(Integer.toString(s / 100));
					s -= (s / 100) * 100;
					tf[5].setText(Integer.toString(s / 50));
					s -= (s / 50) * 50;
					tf[6].setText(Integer.toString(s / 10));
					s -= (s / 10) * 10;
					tf[7].setText(Integer.toString(s / 1));
				}
			});

		}
	}

	public static void main(String[] args) {
		new TextAreaEx2();
	}
}
