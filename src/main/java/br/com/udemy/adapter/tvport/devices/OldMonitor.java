package br.com.udemy.adapter.tvport.devices;

import br.com.udemy.adapter.tvport.interfaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

}
