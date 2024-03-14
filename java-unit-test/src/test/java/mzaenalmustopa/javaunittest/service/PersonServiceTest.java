package mzaenalmustopa.javaunittest.service;

import mzaenalmustopa.javaunittest.Person;
import mzaenalmustopa.javaunittest.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    // mocking adalah object tiruan

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void getPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void getPersonSuccess() {
        // menambah behaviour ke mock object
        Mockito.when(personRepository.selectById("topa"))
                .thenReturn(new Person("topa", "Topa"));

        var person = personService.get("topa");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("topa", person.getId());
        Assertions.assertEquals("Topa", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Topa");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Topa", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Topa"));
    }
}
