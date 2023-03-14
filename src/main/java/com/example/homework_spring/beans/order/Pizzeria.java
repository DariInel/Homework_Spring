package com.example.homework_spring.beans.order;

import com.example.homework_spring.beans.pizza.Pizza;
import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pizzeria {

    @Autowired
    List<Pizza> receivedOrders;

    @PostConstruct
    public void postConstruct() {
        receivedOrders.forEach(
                i -> System.out.printf("New order in the hall № %s %n", i.hashCode())
        );
    }
}
