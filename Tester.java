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
			System.out.println("Starting Balance: " + test.getBalance());
			System.out.println("AccountID: " + ((int) test.getAccountID()));
			System.out.println("Password: " + test.getPassword());
			test.setPassword("newpassword");
			System.out.println("New Password: " + test.getPassword());
			if(Math.random() > 0.2)
			deposit = 1500 * i;
			else
			deposit = -1500 * i;
			System.out.println("Attempted deposit: " + (deposit) + "  " + test.deposit(deposit));
			System.out.println("New Balance: " + test.getBalance());
			if(Math.random() > 0.3)
			withdrawal = 3001;
			else
			withdrawal = -3001;
			System.out.println("Attempted withdrawal: " + (withdrawal) + " " + test.withdraw(withdrawal));
			System.out.println("New Balance(post withdraw): " + test.getBalance());
			System.out.println(test.toString());
		}
	}
}
			
			

