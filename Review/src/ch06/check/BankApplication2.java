package ch06.check;

import java.util.Scanner;

public class BankApplication2 {
	
	private static Account2[] array = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
				case 1 : createAccount();
						 break;
				case 2 : accountList();
						 break;
				case 3 : deposit();
						 break;
				case 4 : withdraw();
						 break;
				case 5 : System.out.println("프로그램 종료");
						 run = false; 
				default : System.out.println("지정된 숫자가 아닙니다.");
						 break; 
			}
		}
	}

	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String on = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int ba = Integer.parseInt(scanner.nextLine());
		
		Account2 ac2 = new Account2(an, on, ba);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = ac2;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		System.out.println();
	}

	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for (int i = 0; i < array.length; i++) {
			Account2 ac2 = array[i];
			if(array[i] != null) {
				System.out.printf("%1$s  %2$s  %3$d", ac2.getAn(), ac2.getOn(), ac2.getBa());
				System.out.println();
			}
		}
		System.out.println();
	}

	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		Account2 ac2 = findAccount(an);
		if(ac2 == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		ac2.setBa(ac2.getBa() + money);
		System.out.println("예금이 성공되었습니다.");
		System.out.println();
	}

	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String an = scanner.nextLine();
		Account2 ac2 = findAccount(an);
		if(ac2 == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		ac2.setBa(ac2.getBa() - money);
		System.out.println();
	}
	
	private static Account2 findAccount(String an) {
		Account2 ac2 = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				String dbAno = array[i].getAn();
				if(dbAno.equals(an)) {
					ac2 = array[i];
					break;
				}
			}
		}
		return ac2;
	}

}
