package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        NarxozFood narxozFood = context.getBean(NarxozFood.class);
        System.out.println("Университет: " + narxozFood.getUniversity());
        System.out.println("Курьеры:");
        for (DeliveryPerson deliveryPerson : narxozFood.getDeliveryPersons()) {
            System.out.println(deliveryPerson);
        }
        context.close();
    }
}
