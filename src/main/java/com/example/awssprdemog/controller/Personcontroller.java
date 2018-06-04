package com.example.awssprdemog.controller;

import com.example.awssprdemog.model.Person;
import com.example.awssprdemog.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author mchidambaranathan 6/3/2018
 */
@RestController
public class Personcontroller {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody final String name) {
        personService.save(new Person(name));
        return "ok";
    }

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();

    }
}
