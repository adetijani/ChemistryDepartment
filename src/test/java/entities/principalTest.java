package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class principalTest {

    @Test
    void getQualification() {
        principal principal = new principal();
        principal.setQualification("BSC");
        assertEquals("BSC", principal.getQualification());
    }

    @Test
    void getExperience() {
        principal principal = new principal();
        principal.setExperience("senior");
        assertEquals("senior", principal.getExperience());
    }


    @Test
    void getEmail() {
        principal principal = new principal();
        principal.setEmail("tijani@gmail.com");
        assertEquals("tijani@gmail.com", principal.getEmail());
    }

    @Test
    void setQualification() {
        principal principal = new principal();
        assertEquals();
    }

    @Test
    void setExperience() {
    }

    @Test
    void setEmail() {
    }

}