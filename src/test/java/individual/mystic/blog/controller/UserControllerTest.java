package individual.mystic.blog.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

class UserControllerTest {

    private WebClient client;

    @BeforeEach
    void setUp() {
        client = WebClient.create("http://localhost:8080/");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        client.get();
    }

    @Test
    void remove() {
    }
}