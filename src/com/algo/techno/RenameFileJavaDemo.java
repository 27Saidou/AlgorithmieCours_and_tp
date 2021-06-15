package com.algo.techno;

import java.io.File;

public class RenameFileJavaDemo {
public static void main(String[] args) {
	File oldfile=new File("D:\\myfile.txt");
	File newFile=new File("D:\\mynewfile.txt");
	boolean flag=oldfile.renameTo(newFile);
	if(flag) {
		System.out.println("fichier renommer avec success");
	}else {
		System.out.println("echec pour renommer le fichier");
	}
}
}
