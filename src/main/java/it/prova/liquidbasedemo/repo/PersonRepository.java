package it.prova.liquidbasedemo.repo;

import it.prova.liquidbasedemo.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long>{

    @Query("select p from Person p where p.name = :name")
    Person findByName( String name);

}
