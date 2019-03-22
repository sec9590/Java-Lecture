package section02.ex01_remotecontrol;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	//정적메소드
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
