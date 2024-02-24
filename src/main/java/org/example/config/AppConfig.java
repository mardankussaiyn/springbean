package org.example.config;

import org.example.DeliveryPerson;
import org.example.NarxozFood;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    int id = 1;
    @Bean
    public NarxozFood narxozFood() {
        NarxozFood narxozFood = new NarxozFood();
        narxozFood.addDeliveryPerson(deliveryPersonWithCar());
        return narxozFood;
    }
    @Bean
    public DeliveryPerson deliveryPersonWithCar() {
        return new DeliveryPerson(id++, "Алихан", "77777777777", "Camry");
    }
}

