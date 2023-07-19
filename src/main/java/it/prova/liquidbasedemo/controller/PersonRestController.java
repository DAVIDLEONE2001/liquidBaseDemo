package it.prova.liquidbasedemo.controller;

import it.prova.liquidbasedemo.model.Person;
import it.prova.liquidbasedemo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/person")
public class PersonRestController {

    @Autowired
    private PersonRepository repository;



    @PostMapping
    public String addPerson(@RequestParam String name) {

        repository.save(Person.builder().name(name).build());

        return name+" aggiunto correttamente";
    }

    @GetMapping
    public List<Person> listAll(){
        System.out.println("ciao");
        return (List<Person>) repository.findAll();
    }

}
