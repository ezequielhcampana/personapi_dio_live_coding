package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(Long id) {
        super("Person not found with ID: " + id);
    }
}
