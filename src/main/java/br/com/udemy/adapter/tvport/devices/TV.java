package br.com.udemy.adapter.tvport.devices;

import br.com.udemy.adapter.tvport.interfaces.HDMI;

public class TV implements HDMI {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}
}
