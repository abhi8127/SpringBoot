package com.codingshuttle.abhishek.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
public class Apple {
    void eatapple(){
        System.out.println("i am eating the apple");

    }
@PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before used");
    }
@PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying the apple bean");
    }
}
