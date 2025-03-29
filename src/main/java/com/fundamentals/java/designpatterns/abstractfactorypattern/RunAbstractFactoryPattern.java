package com.fundamentals.java.designpatterns.abstractfactorypattern;

import com.fundamentals.java.designpatterns.abstractfactorypattern.factories.AbstractFactory;
import com.fundamentals.java.designpatterns.abstractfactorypattern.factories.LuxuryFactory;
import com.fundamentals.java.designpatterns.abstractfactorypattern.luxurycars.Audi;

// This is factory of factory pattern (two layers of factories)
// Can be used when object cab be grouped under multiple factories
// example Interface Vehicle that method mileage();
// now Luxury car 1 (Mercedes), Luxury car 2(BMW) ,Luxury Car 3(Rolls Royce) implements this interface
// also ordinary car 1 Alto, ordinary car 2 swift also implements this interface
// SUV car 1 Scorpio, SUV car Fortuner also implements this interface
// We can make three factories Luxury, ordinary and SUV and these will give instances of Luxury car1, luxury car 2, ordinary car 1.........
//these factories will implement another factory interface (method getVehicle)
// And these three factories implementing this factory interface will return vehicles of their types
// Now we will have a final factory which will return objects of vehicleFactory of type(Luxury or Ordinary......)
public class RunAbstractFactoryPattern {

    public static void main(String args[]) {

        System.out.println(AbstractFactory.getLuxuryFactory());
        System.out.println(AbstractFactory.getOrdinaryFactory());
        System.out.println(AbstractFactory.getSuvFactory());

        VehicleType vehicleType = new LuxuryFactory();
        System.out.println(vehicleType.vehicleType());

        Vehicle vehicle = new Audi();
        System.out.println(vehicle.vehicleName());

    }
}
