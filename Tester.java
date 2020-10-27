public class Tester{

	public static void main(String[] args){
	
		BankAccount test1 = new BankAccount(3141592, "pipassword");
		BankAccount test2 = new BankAccount(-27182818, "epassword");
		BankAccount test3 = new BankAccount(14142, "sqrt2password");
		BankAccount test4 = new BankAccount(112358, "fibpassword");

		BankAccount test = test1;
		for(int i = 1; i <= 4; i++){
			if(i == 1)
				test = test1;
			if(i == 2)
				test = test2;
			if(i == 3)
				test = test3;
			else
				test = test4;
			System.out.println();
			System.out.println();
			System.out.println("Starting Balance: " + test.getBalance());
			System.out.println("AccountID: " + test.getAccountID());
			System.out.println("Password" + test.getPassword());
			test.setPassword("newpassword");
			System.out.println("New Password: " + test.getPassword());
			System.out.println(test.deposit(1500 * i) + "New Balance: " + test.getBalance());
			System.out.println(test.withdraw(3001) + "New Balance(post withdraw): " + test.getBalance());
			System.out.println(test.toString());
		}
	}
}
			
			

