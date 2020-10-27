public class BankAccount { 

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int ID, String p){

		accountID = ID;
		password = p;
		balance = 0;
	}

	public double getBalance(){
		return balance;
	}

	public double getAccountID(){
		return accountID;
	}

	public void setPassword(String newPass){
		password = newPass;
	}

	public boolean deposit(double amount){

		if(amount >= 0){
			balance += amount;
			return true;
		}else
			return false;
	}

	public boolean withdraw(double amount){

		if(balance - amount >= 0 && amount >= 0){
			balance -= amount;
			return true;
		}else
			return false;
	}

	public String toString(){

		String output = "" + accountID + "	" + balance;
		return output;
	}
}
	
	

