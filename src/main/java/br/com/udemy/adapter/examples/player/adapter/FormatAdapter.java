package br.com.udemy.adapter.examples.player.adapter;

import br.com.udemy.adapter.examples.player.interfaces.MediaPackage;
import br.com.udemy.adapter.examples.player.interfaces.MediaPlayer;

public class FormatAdapter implements MediaPlayer {

	private MediaPackage media;

	public FormatAdapter(MediaPackage m) {
		media = m;
	}

	@Override
	public void play(String fileName) {
		System.out.println("Using format adapter");
		media.playFile(fileName);
	}

}
