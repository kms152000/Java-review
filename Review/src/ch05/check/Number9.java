package ch05.check;

import java.util.Scanner;

public class Number9 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
				case 1:
						System.out.print("학생수> ");
						int i = Integer.parseInt(scanner.nextLine());
						
				case 2: 
					for ( i = 0; i < args.length; i++) {
						System.out.print("scores[" + i + "]");
						scanner.nextLine();
					}
					
					
				case 3:
					
					
				case 4:
					
					
				default:
			}
			
		}
	}
}
