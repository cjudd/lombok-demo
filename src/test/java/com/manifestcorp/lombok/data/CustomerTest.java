package com.manifestcorp.lombok.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerTest {

    @Test
    void noParameterConstructor() {
        Customer c = new Customer();
        c.setId(1L);
        c.setFirstName("Chris");
        c.setLastName("Judd");
        c.setEmail("javajudd@gmail.com");
        assertNotNull(c);
        assertEquals(792046746, c.hashCode());
        assertEquals("Customer(id=1, firstName=Chris, lastName=Judd, email=javajudd@gmail.com)", c.toString());
    }
}