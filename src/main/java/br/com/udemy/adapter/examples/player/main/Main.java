package br.com.udemy.adapter.examples.player.main;

import br.com.udemy.adapter.examples.player.adapter.FormatAdapter;
import br.com.udemy.adapter.examples.player.formats.MP3;
import br.com.udemy.adapter.examples.player.formats.MP4;
import br.com.udemy.adapter.examples.player.formats.VLC;
import br.com.udemy.adapter.examples.player.interfaces.MediaPlayer;

public class Main {
	public static void main(String[] args) {
		MediaPlayer player = new MP3();
		player.play("file.mp3");

		player = new FormatAdapter(new MP4());
		player.play("file.mp4");

		player = new FormatAdapter(new VLC());
		player.play("file.avi");
	}
}
