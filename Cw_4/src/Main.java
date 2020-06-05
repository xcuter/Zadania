public class Main {

    public static void main(String[] args) {
	// write your code here
        Truck T1 = new Truck("EL1111","VIN12345","Red",7000.25,12.0,500.0,0,0,15000.0   );
        Motorcycle M1 = new Motorcycle("EL12","VO123","Blue",1500.0,6.0,20.0,1,0.0,200.0);
        Car C1 = new Car("EL13","VAN123","Green",5000.0,7.6,65.0,0,0,1500);

        T1.Drive(T1);
        T1.Accelerate(T1,50.0);
        T1.DriveKilometers(32,T1);
        T1.Break(T1,25);
        M1.Drive(M1);
        M1.Accelerate(M1,250.0);
        M1.DriveKilometers(2,M1);
        M1.Break(M1,300);
        C1.Drive(C1);
        C1.Accelerate(C1,130.0);
    }
}
