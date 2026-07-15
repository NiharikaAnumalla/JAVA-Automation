package OOPS;

public class EnAccountDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationAccountDetails account = new EncapsulationAccountDetails();
		account.setAccno(101);
		System.out.println(account.getAccno());
		account.setName("Niharika");
		System.out.println(account.getName());
account.setAmount(10000.0);
System.out.println(account.getAmount());
	}

}
