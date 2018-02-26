
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

                     public int write(byte[] buffer) {

                             // implementation

	System.out.println("Writing a MindStickModem");
	return 100;

                     }

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

class ModemTesting{
public static voin Modem (){

	Modem modem = new MindStickModem();
	modem.open();
	modem.write(buffer);
	modem.read();
	modem.close();


	Modem modem = new HuaweiModem();
	modem.open();
	modem.write(buffer);
	modem.read();
	modem.close();

}
}
}
}
