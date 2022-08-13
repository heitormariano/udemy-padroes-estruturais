package br.com.udemy.adapter.examples.player.formats;

import br.com.udemy.adapter.examples.player.interfaces.MediaPackage;

public class VLC implements MediaPackage {

	@Override
	public void playFile(String fileName) {
		System.out.println("Playing VLC file: " + fileName);
	}

}
