package section04.default_method;

import section02.ex01_remotecontrol.RemoteControl;

public class Audio implements RemoteControl{

	private boolean mute;
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
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음처리합니다.");
		} else {
			System.out.println("Audio 무음해제합니다.");
		}

	}
}
