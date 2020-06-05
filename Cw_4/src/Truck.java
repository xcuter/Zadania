public class Truck extends Vechicle implements VechicleMethods {
    Truck(){
        //default Truck
        super();
    }
    Truck(
            String RegistrationNumber,
            String VinNumber,
            String Color,
            double Price,
            double FuelConsumption,
            double TankCapacity,
            int FuelType,
            double KilometersDriven,
            double Weight
    ){
        super(RegistrationNumber,VinNumber,Color,Price,FuelConsumption,TankCapacity,FuelType,KilometersDriven,Weight);
        this.MaxWeight = 30000.0;
        this.MaxSpeed=120.0;
        this.CurrentSpeed=0;
    };


}
