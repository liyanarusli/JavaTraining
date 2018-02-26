class Lamp2 {
	boolean isOn;

	void turnOn () {
		isOn = true;
	}
	void turnOff () {
		isOn = false;
	}

void displayLightStatus () {
	System.out.println (" Light is on ? \n" + isOn );
}


public static void main (String[] args){
	Lamp2 l1 = new Lamp2();
	Lamp2 l2 = new Lamp2();

l1.turnOn();
l2.turnOff();

l1.displayLightStatus ();
l2.displayLightStatus ();
}
}