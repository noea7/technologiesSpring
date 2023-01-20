package lt.techin.kristina.blogging.api.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class BlogEntryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testIfGetInfoReturnsCorrectly() throws Exception {

        String appVersion = "0.0.1-SNAPSHOT";
        Assertions.assertEquals(appVersion, mockMvc.perform(MockMvcRequestBuilders.
                get("/api/v1/blogEntries/info")).andReturn().getResponse().getContentAsString());
    }
}