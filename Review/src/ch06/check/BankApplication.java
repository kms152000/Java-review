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
		String accountNo = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = new Account(accountNo, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}	
		System.out.println();
	}

	//계좌 목록
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.printf("%1$s	  %2$s   %3$d", account.getAccountNo(), account.getOwner(), account.getBalance());
				System.out.println();
			}
		}
		System.out.println();
		
	}

	//예금하기
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String accountNo = scanner.nextLine();
		Account account = findAccount(accountNo);
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
			
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		account.setBalance(account.getBalance() + money);
		System.out.println("예금이 성공되었습니다.");
		System.out.println();
	}

	//출금하기
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String accountNo = scanner.nextLine();
		Account account = findAccount(accountNo);
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
			
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		account.setBalance(account.getBalance() - money);
		System.out.println("출금이 성공되었습니다.");
		System.out.println();
	}
	
	
	//Account 배열에서 해당 계좌 번호 조회
	private static Account findAccount(String accountNo) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAccountNo();
				if(dbAno.equals(accountNo)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
