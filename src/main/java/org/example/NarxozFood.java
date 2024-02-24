package org.example;

import java.util.ArrayList;
import java.util.List;
public class NarxozFood {
    String university = "Narxoz";
    List<DeliveryPerson> deliveryPersons = new ArrayList<>();
    public NarxozFood() {
    }
    public NarxozFood(DeliveryPerson deliveryPerson) {
        deliveryPersons.add(deliveryPerson);
    }
    public String getUniversity() {
        return university;
    }
    public List<DeliveryPerson> getDeliveryPersons() {
        return deliveryPersons;
    }
    public void addDeliveryPerson(DeliveryPerson person) {
        deliveryPersons.add(person);
    }
    @Override
    public String toString() {
        return "NarxozFood{" +
                "university='" + university + '\'' +
                ", deliveryPersons=" + deliveryPersons +
                '}';
    }
}
