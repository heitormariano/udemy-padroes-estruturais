package br.com.udemy.adapter.examples.player.formats;

import br.com.udemy.adapter.examples.player.interfaces.MediaPackage;

public class MP4 implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("Playing MP4 file: " + fileName);
	}

}
