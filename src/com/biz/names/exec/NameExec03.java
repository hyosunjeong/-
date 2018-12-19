package com.biz.names.exec;

import com.biz.names.service.NameService;

public class NameExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fstFile = "src/com/biz/names/한국인성씨.txt";
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String saveFile = "src/com/biz/names/fullName.txt";
		NameService ns = new NameService(fstFile, sndFile);
		
		ns.readFirstFile();
		ns.readSndFile();
		ns.menu();
		
		
	}

}
