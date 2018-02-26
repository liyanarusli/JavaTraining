
interface Modem {
  public boolean open();                               	//abstract public method
  public boolean close();			//abstract public method
  public int read ();				//abstract public method
  public int write();				//abstract public method

}
 
//--------------------------------------------------------------------------------------------------

class MindStickModem implements Modem {

                     public boolean open() {

                             // implementation
	System.out.println("Started a MindStickModem");
	return true;

                     }

                     public boolean close() {

                             // implementation
	System.out.println("Closed a MindStickModem");
	return false;
                     }

                     public int read() {

                             // implementation
	System.out.println("Reading a MindStickModem");
	return 100;

                     }

                     public int write() {

                             // implementation
	System.out.println("Writing a MindStickModem");
	return 100;

                     }



//----------------------------------------------------------------------------------------

class HuaweiModem implements Modem {
                     public boolean open() {

                             // implementation
	System.out.println("Started a HuaweiModem");
	return true;

                     }

                     public boolean close() {

                             // implementation
	System.out.println("Closed a HuaweiModem");
	return false;

                     }

                     public int read() {

                             // implementation

	System.out.println("Reading a HuaweiModem");
	return 200;

                     }

                     public int write() {

                             // implementation

	System.out.println("Writing a HuaweiModem");
	return 200;

                     }

}
}

/* From this lies our main class and main method */

public class ModemTesting{
public static void main (String x [] ){

	Modem modem = new MindStickModem();
	modem.open();
	modem.write();
	modem.read();
	modem.close();


	Modem modem2 = new HuaweiModem();
	modem2.open();
	modem2.write();
	modem2.read();
	modem2.close();

}
}

