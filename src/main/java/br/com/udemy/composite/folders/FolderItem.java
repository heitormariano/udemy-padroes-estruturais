package br.com.udemy.composite.folders;

import java.util.List;

public class FolderItem implements FileSystemItem {

	private String name;
	private List<FileSystemItem> childs;

	public FolderItem(String name, List<FileSystemItem> childs) {
		this.name = name;
		this.childs = childs;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + name);
		for (FileSystemItem child : childs) {
			child.print(structure + "| ");
		}
	}

}
