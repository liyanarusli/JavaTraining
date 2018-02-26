//import org.apache.log4j.Logger;

public class ThreadExercise extends Thread implements Runnable {

private Person person;

public ThreadExercise(Person p) {
    this.person = p;
}

public static void main(String[] args) {

    ThreadExercise ts1 = new ThreadExercise(new Person("person 1"));
    ts1.start();
    ThreadExercise ts2 = new ThreadExercise(new Person("person 2"));
    ts2.start();
    ThreadExercise ts3 = new ThreadExercise(new Person("person 3"));
    ts3.start();

}

@Override
public void run() {
    for (int i = 0; i < 3; i++) {		//3 times loop
        try {
            Account acc = Account.getAccount(person);
            acc.withdraw(100);		// want to withdraw 100
            try {
                Thread.sleep(200);		// thread will sleep for 200 millisec
            } catch (InterruptedException ex) {
                //Logger.getLogger(ThreadExercise.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            acc.deposit(200);		//want to deposit 200

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    System.out.println("Final Acc balance is RM " + Account.getBal());
}}
