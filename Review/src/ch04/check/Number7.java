package ch04.check;

import java.util.Scanner;

public class Number7 {
	public static void main(String[] args) {
		boolean run = true;
        int money = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            String num = scanner.nextLine();
            
            if(num.equals("1")) {
                System.out.print("예금액>");
                String save = scanner.nextLine();
				money += Integer.parseInt(save);
                System.out.println();
            } else if (num.equals("2")) {
                System.out.print("출금액>");
                String give = scanner.nextLine();
				money -= Integer.parseInt(give) ;
                System.out.println();
            } else if (num.equals("3")) {
                System.out.print("잔고>" + money + "\n");
                System.out.println();
            } else if (num.equals("4")) {
            	System.out.println();
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}
