package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass {
    private static List<String> aerocraftLsit=List.of("Passenger","Cargo");

    public ServiceClass() {
    }

    public String executeOperation(String aircraft,String operation){
        for(String s:aerocraftLsit){
            if(aircraft.equalsIgnoreCase("Passenger")){
                return new PassengerAircraft().performOperation(operation);
            }
            else if(aircraft.equalsIgnoreCase("Cargo")){
                return new CargoAircraft().performOperation(operation);
            }
        }
        return "No AeroCraft found..enter valid one.";
    }



}
