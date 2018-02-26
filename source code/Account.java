/* Account.java will have 2 properties: withdraw and deposit */

public class Account {

public static Account account;
private static int balance = 10000;
private static Person person;

private Account() {
}

public static Account getAccount(Person p) {	// it will return an object of the person
    if (account == null) {
        account = new Account();
    }
    Account.person = p;
    return account;
}

public static int getBal() {		// it will return the balace of tht account
    return balance;
}

public synchronized void withdraw(int bal) {	// one process wait until withdraw process end
    try {

        if (balance >= bal) {		
            System.out.println(person.getName() + " " + "is try to withdraw");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance - bal;
            System.out.println(person.getName() + " " + "is complete the withdraw");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for withdraw ");
        }
        System.out.println(person.getName() + " " + " withdraw RM " + balance);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public synchronized void deposit(int bal) {	// one process wait until deposit process end
    try {
        if (bal > 0) {
            System.out.println(person.getName() + " " + " is try to deposit");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance + bal;
            System.out.println(person.getName() + " " + "is complete the deposit");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
        }
        System.out.println(person.getName() + " " + " deposit RM " + balance);
    } catch (Exception e) {
        e.printStackTrace();
    }
}}