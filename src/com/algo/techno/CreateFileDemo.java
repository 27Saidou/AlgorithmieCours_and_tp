package com.algo.techno;

import java.io.File;

public class CreateFileDemo {

	public static void main(String[] args) {
		try {
			File file=new File("D:\\newfile.txt");
			boolean fva=file.createNewFile();
			if(fva) {
				System.out.println("Fichier creer avec success");
			}else {
				System.out.println("Fichier existe dans le path suivant");
			}
		} catch (Exception e) {
			System.out.println("Exc"+e.getMessage());
			e.printStackTrace();
		}

	}

}
