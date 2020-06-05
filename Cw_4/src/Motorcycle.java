public class Motorcycle extends Vechicle implements VechicleMethods{
    Motorcycle(){
        super();
    }

    Motorcycle( String RegistrationNumber,
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
        this.MaxWeight = 500.0;
        this.MaxSpeed = 300.0;
        this.CurrentSpeed = 0.0;
    }


}
