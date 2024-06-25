import java.util.Scanner;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	Bank_Account(int accountNo,String userName,String email,String accountType,double accountBalance){

		this.accountNo=accountNo;
		this.userName=userName;
		this.email=email;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
		
	}

	String getAccountDetails(){
		return "" +  "\nAccount Number : " + accountNo +
               "\nUser Name : " + userName +
               "\nEmail : " + email +
               "\nAccount Type : " + accountType +
               "\nAccount Balance : " + accountBalance;
	}

	public void displayAccountDetails(){
        System.out.println("Account Details:");
        System.out.println(getAccountDetails());
    }
}

public class BankAccountDemo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		Bank_Account ac=new Bank_Account(0,null,null,null,0);

		System.out.println("Enter Bank Account number : ");
		ac.accountNo=sc.nextInt();

		System.out.println("Enter user name : ");
		ac.userName=sc.next();

		System.out.println("Enter email ID : ");
		ac.email=sc.next();

		System.out.println("Enter Bank Account type : ");
		ac.accountType=sc.next();

		System.out.println("Enter Bank Account balance : ");
		ac.accountBalance=sc.nextDouble();

		ac.displayAccountDetails();
	}
}