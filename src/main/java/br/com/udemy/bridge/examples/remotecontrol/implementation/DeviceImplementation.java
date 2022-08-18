package br.com.udemy.bridge.examples.remotecontrol.implementation;

public interface DeviceImplementation {
	String getName();

	void setPower(boolean powerStatus);

	boolean getPower();

	void setVolume(int volume);

	int getVolume();
}
