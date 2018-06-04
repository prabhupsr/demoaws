package com.example.awssprdemog.service;

import com.example.awssprdemog.dao.PersonDataRepository;
import com.example.awssprdemog.model.Person;
import org.hibernate.annotations.SortComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author mchidambaranathan 6/3/2018
 */
@Component
public class PersonService {

    @Autowired
    private PersonDataRepository personDataRepository;

    public List<Person> findAll(){
        return personDataRepository.findAll();
    }

    public void save(final Person person){
        personDataRepository.save(person);
    }



}
