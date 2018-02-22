package savingAccount;
import java.util.Scanner;

public class Test {
	public static void main(String []args ) {
		properites people = new properites ("Jay",100134,100);
		properites people2 = new properites("Aileen",100190,1000);
		properites people3 = new properites("John", 100153, 3213);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is UserName? What is pin ? What is balance ?");
		 String UserName  = scan.nextLine();
		 int pin = scan.nextInt();
		 double balance  = scan.nextDouble();
		 
		 properites CurrentAccount = new properites (UserName,pin,balance);
		 properites OverDraft = new properites (UserName,pin,balance);
		 
		 System.out.println(people.UserName + people.withdraw(55.55));
		 System.out.println(people.withdraw(55.55));
		 System.out.println(people.deposit(99.55));
		 
		 
	}
	

}
