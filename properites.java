package savingAccount;


public class properites {
	
	String UserName;
	int pin;
	double balance; 
	
public properites(String UserName2, int pin2, double balance2) {
	UserName=UserName2;
	pin = pin2;
	balance = balance2;
}


public double withdraw (double amount) {
return balance - amount; 
}

public double deposit (double amount) {
	return balance + amount;
}


}
