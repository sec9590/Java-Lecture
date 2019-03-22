package section04.default_method;

import section02.ex01_remotecontrol.RemoteControl;
import section03.implement.*;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);
		rc.turnOff();
		
		//정적메소드 사용
		RemoteControl.changeBattery();
		
	}

}
