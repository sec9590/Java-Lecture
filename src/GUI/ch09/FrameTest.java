package GUI.ch09;
import javax.swing.*;

public class FrameTest extends JFrame{ //객체 상속
	
	public FrameTest() { //생성자로 객체 초기화
		setTitle("SEUN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫으면 컴파일도 종료
		setSize(300, 500); //크기
		setLocation(200, 300); //위치
		setResizable(false); //크기고정
		
		setVisible(true); //화면 띄우기
	}
	
	public static void main(String[] args) {
		new FrameTest();
		
	}
}
