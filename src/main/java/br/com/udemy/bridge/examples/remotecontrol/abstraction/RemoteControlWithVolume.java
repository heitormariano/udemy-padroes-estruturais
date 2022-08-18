package br.com.udemy.bridge.examples.remotecontrol.abstraction;

import br.com.udemy.bridge.examples.remotecontrol.implementation.DeviceImplementation;

public class RemoteControlWithVolume extends RemoteControl {

	public RemoteControlWithVolume(DeviceImplementation device) {
		super(device);
	}

	public void volumeUp() {
		int oldVolume = this.device.getVolume();
		int newVolume = oldVolume + 10;
		this.device.setVolume(newVolume);

		System.out.println("--------------------volumeUp--------------------");
		System.out.println("Device name: " + this.device.getName());
		System.out.println("Old volume: " + oldVolume);
		System.out.println("new volume: " + this.device.getVolume());
		System.out.println("------------------------------------------------");
	}

	public void volumeDown() {
		int oldVolume = this.device.getVolume();
		int newVolume = oldVolume - 10;
		this.device.setVolume(newVolume);

		System.out.println("--------------------volumeDown------------------");
		System.out.println("Device name: " + this.device.getName());
		System.out.println("Old volume: " + oldVolume);
		System.out.println("new volume: " + this.device.getVolume());
		System.out.println("------------------------------------------------");
	}

}
