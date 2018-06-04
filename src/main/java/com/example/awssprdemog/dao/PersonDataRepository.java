package com.example.awssprdemog.dao;

import com.example.awssprdemog.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mchidambaranathan 6/3/2018
 */
@Repository
public interface PersonDataRepository extends JpaRepository<Person, Integer> {
}
