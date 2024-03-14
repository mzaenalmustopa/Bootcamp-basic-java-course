package mzaenalmustopa.javaunittest.service;

import mzaenalmustopa.javaunittest.Person;
import mzaenalmustopa.javaunittest.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectById(id);
        if (person != null){
            return person;
        } else {
            throw new IllegalArgumentException("Person Not Found");
        }
    }

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        // wajib di panggil method insert agar tidak menyimpan data kosong
        personRepository.insert(person);
        return person;
    }
}
