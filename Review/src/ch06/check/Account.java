package ch06.check;

public class Account {
//	19번 답
//	static int balance;
//	public static final int MIN_BALANCE = 0;
//	public static final int MAX_BALANCE = 1000000;
//
//	public static int getBalance() {
//		return balance;
//	}
//	public void setBalance(int balance) {
//		if (balance<MIN_BALANCE || balance>MAX_BALANCE) {
//			return;
//		} 
//		this.balance = balance;
//		
//	}
	
	//20번 답
	private String accountNo;
	private String owner;
	private int balance;
	
	public Account (String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
