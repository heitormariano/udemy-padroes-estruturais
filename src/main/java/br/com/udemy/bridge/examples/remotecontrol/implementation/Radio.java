package br.com.udemy.bridge.examples.remotecontrol.implementation;

public class Radio implements DeviceImplementation {

	private String name;
	private boolean powerStatus;
	private int volume;

	public Radio() {
		this.name = "Radio";
		this.powerStatus = false;
		this.volume = 10;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setPower(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}

	@Override
	public boolean getPower() {
		return this.powerStatus;
	}

	@Override
	public void setVolume(int volume) {
		if (volume < 0 || volume > 100)
			return;

		this.volume = volume;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

}
