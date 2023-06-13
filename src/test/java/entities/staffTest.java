package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class staffTest {

    @Test
    void getName() {
        staff staff = new staff();
            staff.setName("Gabriel");
            assertEquals("Gabriel", staff.getName);

    }

    @Test
    void getAddress() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void getDepartment() {
    }

    @Test
    void getEmploymentStatus() {
    }

    @Test
    void getPhoneNumber() {
    }

    @Test
    void testToString() {
    }
}