package com.micro.rewards.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class FakerService {

    private Faker faker = new Faker();

    public String getAName() {
        return faker.funnyName().name();
    }

    public String getAnAnimal() {
        return faker.animal().name();
    }

    public String getAddress() {
        return faker.address().fullAddress();
    }

    public String getWeird() {
        return faker.chuckNorris().fact();
    }

}
