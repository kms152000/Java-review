package ch05.check;

import java.util.Scanner;

public class Number9 {
	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int[] scores = null;
		int maxScore = 0;
		int sum = 0;
		double average = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
				case 1:
						System.out.print("학생수> ");
						int studentNum = Integer.parseInt(scanner.nextLine());
						scores = new int[studentNum]; 
						System.out.println();
						break;
				case 2: 
						for (int i = 0; i < scores.length; i++) {
							System.out.print("scores[" + i + "]> ");
							scores[i] = Integer.parseInt(scanner.nextLine());
						}
						System.out.println();
						break;
				case 3:
						for (int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "]: " + scores[i]);
						}
						System.out.println();
						break;
				case 4:
						for (int i = 0; i < scores.length; i++) {
							if (maxScore < scores[i]) {
								maxScore = scores[i];
							}
							sum += scores[i];
						}
						average = (double) sum / scores.length;
						System.out.println("최고 점수: " + maxScore);
						System.out.println("평균 점수: " + average);
				case 5:
						System.out.println("프로그램 종료");
						run = false;
			}
			
		}
	}
}
