package no.jlwcrews.firstspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
@Slf4j
public class PartsController {

    private final PartsService partsService;

    @Autowired
    public PartsController(PartsService partsService) {
        this.partsService = partsService;
    }

    @GetMapping()
    public ResponseEntity<List<Part>> getParts() {
        System.out.println("Hello");
        return ResponseEntity.ok(partsService.getParts());


    }

    @PostMapping()
    public void addPart(@RequestBody Part part) {
        partsService.addPart(part);
    }

    @DeleteMapping()
    public void deletePart(@RequestBody Part part) {
        partsService.deletePart(part);
    }
}
