package no.jlwcrews.firstspringboot;

import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository() {
        parts.add(new Part("gear"));
        parts.add(new Part("cog"));
    }


    public ArrayList<Part> getParts() {
        return parts;
    }

    public void addPart(Part part) {
        parts.add(part);
    }
}
