public class Tester{

	public static void main(String[] args){
	
		BankAccount test1 = new BankAccount(3141592, "pipassword");
		BankAccount test2 = new BankAccount(-27182818, "epassword");
		BankAccount test3 = new BankAccount(14142, "sqrt2password");
		BankAccount test4 = new BankAccount(112358, "fibpassword");

		int deposit = 0;
		int withdrawal = 0;

		BankAccount test = test1;
		for(int i = 1; i <= 4; i++){
			if(i == 1)
				test = test1;
			else if(i == 2)
				test = test2;
			else if(i == 3)
				test = test3;
			else
				test = test4;
			System.out.println();
			System.out.println();
			System.out.println("AccountID: " + ((int) test.getAccountID()));
			System.out.println("Password: " + test.getPassword());
			System.out.println("Starting Balance: " + test.getBalance());
			test.setPassword("newpassword");
			System.out.println("New Password: " + test.getPassword());
			if(Math.random() > 0.3)
			deposit = 1500 * i;
			else
			deposit = -1500 * i;
			System.out.println("Attempted Deposit: " + (deposit) + "  " + test.deposit(deposit));
			System.out.println("New Balance: " + test.getBalance());
			if(Math.random() > 0.3)
			withdrawal = 2099;
			else
			withdrawal = -2099;
			System.out.println("Attempted Withdrawal: " + (withdrawal) + " " + test.withdraw(withdrawal));
			System.out.println("New Balance(post withdrawal): " + test.getBalance());
			System.out.println(test.toString());
		}
	}
}
			
			

