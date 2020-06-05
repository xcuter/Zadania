import org.jetbrains.annotations.NotNull;

public interface VechicleMethods {
    default void Drive(@NotNull Vechicle SomeVechicle){
        System.out.println("the"+SomeVechicle.getClass()+" does bruuuum . . .");
    };

    default void DriveKilometers(double Time, @NotNull Vechicle SomeVechicle){
        double Road = 0.0;
        Drive(SomeVechicle);
        if(Time < 0){
            System.out.println(Time+"must be greatar than 0!");
        }else if(Time <= 0.6){
            Road = (SomeVechicle.CurrentSpeed*Time)/60.0;
        }else{
            Road = SomeVechicle.CurrentSpeed*Time;
        }
        System.out.println("Car driven :"+ Road +" Kilometers");
        SomeVechicle.SetKilometersDriven(Road);
    }

    default void Accelerate(@NotNull Vechicle SomeVechicle,double Speed){
        if(SomeVechicle.AddSpeed(Speed)){
            System.out.println("The Vechicle : "+SomeVechicle.getClass()+" accelerated sucessfully to speed : "+SomeVechicle.GetSpeed());
        }else {
            System.out.println("The Vechicle : "+SomeVechicle.getClass()+" dont accelerated");
        }

    }

    default void Break(@NotNull Vechicle SomeVechicle,double ToSpeed){
        if(SomeVechicle.BreakToSpeed(ToSpeed)){
            System.out.println("The Vechicle : "+SomeVechicle.getClass()+" Brakes sucessfully to speed : "+SomeVechicle.GetSpeed());
        }else {
            System.out.println("The Vechicle : "+SomeVechicle.getClass()+" cannot brake.");
        }
    }


}
