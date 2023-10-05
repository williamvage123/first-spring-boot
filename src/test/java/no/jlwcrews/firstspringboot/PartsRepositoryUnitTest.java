package no.jlwcrews.firstspringboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PartsRepositoryUnitTest {

    @Test
    void shouldReturnResultsFromRepository(){
        PartsRepository repository = new PartsRepository();
        assertThat(repository.getParts().get(0).name()).isEqualTo("gear");
    }
}
