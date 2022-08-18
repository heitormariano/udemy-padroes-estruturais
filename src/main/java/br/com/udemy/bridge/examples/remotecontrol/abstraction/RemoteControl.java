package br.com.udemy.bridge.examples.remotecontrol.abstraction;

import br.com.udemy.bridge.examples.remotecontrol.implementation.DeviceImplementation;

public class RemoteControl {

	protected DeviceImplementation device;

	public RemoteControl(DeviceImplementation device) {
		this.device = device;
	}

	public void togglePower() {
		this.device.setPower(!this.device.getPower());
		System.out.println("-------------------togglePower------------------");
		System.out.println("Devine name: " + this.device.getName());
		System.out.println("Power status: " + this.device.getPower());
		System.out.println("------------------------------------------------");
	}
}
