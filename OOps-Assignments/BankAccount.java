package day1;

public class BankAccount {
	int account_Number;
	String name;
	double balanace;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int account_Number, String name, double balanace) {
		super();
		this.account_Number = account_Number;
		this.name = name;
		this.balanace = balanace;
	}
	public int getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(int account_Number) {
		this.account_Number = account_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalanace() {
		return balanace;
	}
	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}
	@Override
	public String toString() {
		return "BankAccount [account_Number=" + account_Number + ", name=" + name + ", balanace=" + balanace + "]";
	}
	

}
