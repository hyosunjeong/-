package com.biz.names.exec;

import java.util.Scanner;

import com.biz.names.service.NameService;

public class NameExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fstFile = "src/com/biz/names/한국인성씨.txt";
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String saveFile = "src/com/biz/names/fullName.txt";
		
		NameService ns = new NameService(fstFile, sndFile);
		ns.readFirstFile();
		ns.readSndFile();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("================================");
			System.out.println("1.화면출력\t2.파일저장\t0.종료");
			System.out.println("================================");
			System.out.print("원하는 업무를 선택하세요>> ");
			
			String strM = scan.nextLine();
			
			int intM = Integer.valueOf(strM);
			if(intM == 0) break;
			
			ns.makeFullName(10); // 이름을 만드는 부분 매번 바꾸고 싶으면 while문 안으로 고정하고싶으면 While문 밖으로
			if(intM == 1) ns.viewFullName();
			if(intM == 2) ns.writeFullName(saveFile);
		}
		System.out.println("GOOD BYE!");
		
		
	}
	

}
