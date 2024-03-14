package mzaenalmustopa.javaunittest.repository;

import mzaenalmustopa.javaunittest.Person;

public interface PersonRepository {

    Person selectById(String id);
    void insert (Person person);
}
