package br.com.udemy.bridge.examples.remotecontrol.client;

import br.com.udemy.bridge.examples.remotecontrol.abstraction.RemoteControl;
import br.com.udemy.bridge.examples.remotecontrol.abstraction.RemoteControlWithVolume;
import br.com.udemy.bridge.examples.remotecontrol.implementation.DeviceImplementation;
import br.com.udemy.bridge.examples.remotecontrol.implementation.Radio;
import br.com.udemy.bridge.examples.remotecontrol.implementation.TV;

public class Client {

	public static void main(String[] args) {

		DeviceImplementation radio = new Radio();
		RemoteControl radioRemoteControl = new RemoteControl(radio);

		DeviceImplementation tv = new TV();
		RemoteControl tvRemoteControl = new RemoteControlWithVolume(tv);
		
		executeTestOperations(radioRemoteControl);
		executeTestOperations(tvRemoteControl);
	}

	public static void executeTestOperations(RemoteControl remoteControl) {
		remoteControl.togglePower();

		if (!(remoteControl instanceof RemoteControlWithVolume))
			return;

		RemoteControlWithVolume obj = (RemoteControlWithVolume) remoteControl;
		obj.volumeUp();
		obj.volumeUp();
		obj.volumeDown();
	}
}
