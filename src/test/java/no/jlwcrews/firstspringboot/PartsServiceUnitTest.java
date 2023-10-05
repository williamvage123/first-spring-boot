package no.jlwcrews.firstspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PartsServiceUnitTest {

    @MockBean
    private PartsRepository repository;

    @Autowired
    private PartsService service;

    @Test
    void shouldReturnValueFromMockRepository(){
        ArrayList<Part> partsList = new ArrayList<>(List.of(new Part("pineapple")));

        when(repository.getParts()).thenReturn(partsList);

        assertThat(service.getParts().get(0).name()).isEqualTo("pineapple");
    }
}
