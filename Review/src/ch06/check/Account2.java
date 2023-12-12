package ch06.check;

public class Account2 {
	
	private static int ba;
	public static final int MIN_BA = 0;

	public static int getBalance() {
		return ba;
	}
	public int getBa() {
		return ba;
	}
	public void setBa(int ba) {
		if (ba<MIN_BA) {
			System.out.println("보유하신 계좌의 금액이 출금액보다 적습니다.");
			return;
		} 
		System.out.println("출금이 성공되었습니다.");
		this.ba = ba;
		
	}
	
	
	private String an;
	private String on;

	
	public Account2 (String an, String on, int ba) {
		this.an = an;
		this.on = on;
		this.ba = ba;
	}
	
	public String getAn() {
		return an;
	}
	public void setAn(String an) {
		this.an = an;
	}
	public String getOn() {
		return on;
	}
	public void setOn(String on) {
		this.on = on;
	}
	


}
