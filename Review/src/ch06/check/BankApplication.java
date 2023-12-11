package ch06.check;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100]; 
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
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
				default : break; 
				
			}
				
			
		}
	}

	private static void createAccount() {
		// TODO Auto-generated method stub
		
	}


	private static void accountList() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}


	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
