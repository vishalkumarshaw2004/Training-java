package Server;

public class Atm {
   private int pin = 6969;
   private int balance = 20000;
   
   public int getpin() {
	return pin;
	   
   }
   public int getbalance() {
		return balance;
		   
	   }
   public void setbalance(int ba) {
	   BankServer b= new BankServer();
	balance =	balance+ba;
		   
	   }
   public void setbalanceWithdraw(int w) {
	   BankServer b= new BankServer();
	balance =	balance-w;
		   
	   }
}
