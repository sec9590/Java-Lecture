package section03.implement;

import section02.ex01_remotecontrol.RemoteControl;

public class Audio implements RemoteControl {
	private int volume;

	public void turnOn() {
		System.out.println("Audio 를 켭니다.");
	}

	public void turnOff() {
		System.out.println("Audio 를 끕니다.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio volume : " + volume);
	}

}
