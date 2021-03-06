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

	// For testing purposes, it was easier to add a getPassword() method.

	public String getPassword(){
		return password;
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

		String output = "#" + accountID + "\t$" + balance;
		return output;
	}

	private boolean authenticate(String password){
		
		return this.password.equals(password);
	}
	
	public boolean transferTo(BankAccount other, double amount, String password){
		
		if(authenticate(this.password) && withdraw(amount)){
			if(other.deposit(amount))
					return true;
		}
		return false;
	}
		
}
	
	

