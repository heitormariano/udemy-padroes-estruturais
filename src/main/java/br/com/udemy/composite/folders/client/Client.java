package br.com.udemy.composite.folders.client;

import java.util.Arrays;

import br.com.udemy.composite.folders.FileItem;
import br.com.udemy.composite.folders.FolderItem;

public class Client {

	public static void main(String[] args) {
		FileItem file01 = new FileItem("file01.txt");
		FileItem file02 = new FileItem("file02.txt");
		FileItem file03 = new FileItem("file03.txt");
		FileItem file04 = new FileItem("file04.txt");

		FolderItem subFolder01 = new FolderItem("subFolder01", Arrays.asList(file01));
		FolderItem subFolder02 = new FolderItem("subFolder02", Arrays.asList(file02, subFolder01));
		FolderItem folder = new FolderItem("folder", Arrays.asList(subFolder02, file03, file04));

		folder.print("");
	}
}
