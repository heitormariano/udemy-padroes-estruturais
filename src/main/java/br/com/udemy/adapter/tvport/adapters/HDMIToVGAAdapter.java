package br.com.udemy.adapter.tvport.adapters;

import br.com.udemy.adapter.tvport.interfaces.HDMI;
import br.com.udemy.adapter.tvport.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
	private VGA vga;

	public HDMIToVGAAdapter(VGA vga) {
		this.vga = vga;
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA");
		vga.setImage(image);

	}

	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, We don't work with sound");
	}

}
