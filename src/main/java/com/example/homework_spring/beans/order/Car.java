package com.example.homework_spring.beans.order;

import com.example.homework_spring.beans.pizza.Pizza;
import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    List<Pizza> receivedOrders;

    public Car(List<Pizza> receivedOrders) {
        this.receivedOrders = receivedOrders;
    }

    @PostConstruct
    public void postConstruct() {
        receivedOrders.forEach(
                i -> System.out.printf("New auto order № %s %n", i.hashCode())
        );
    }
}
