package no.jlwcrews.firstspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PartsControllerAdvice {

    private Logger logger = LoggerFactory.getLogger(PartsControllerAdvice.class);

    @ExceptionHandler(value = AddPartsException.class)
    public ResponseEntity<String> handleAddPartsException(AddPartsException e) {
        logger.error("PartsException because fish: " + e.getMessage());
        return ResponseEntity.badRequest().body("Sorry, fish are not parts");
    }

}
