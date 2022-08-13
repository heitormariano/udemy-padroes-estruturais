package br.com.udemy.adapter.examples.player.formats;

import br.com.udemy.adapter.examples.player.interfaces.MediaPlayer;

public class MP3 implements MediaPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("Playing MP3 file: " + fileName);
	}

}
