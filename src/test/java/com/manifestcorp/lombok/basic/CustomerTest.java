package com.manifestcorp.lombok.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerTest {

    @Test
    void noParameterConstuctors() {
        Customer c = new Customer();
        assertNotNull(c);
    }

    @Test
    void allParameterConstructor() {
        Customer c = new Customer(1L, "Chris", "Judd", "javajudd@gmail.com");
        assertNotNull(c);
        assertEquals(792046746, c.hashCode());
        assertEquals("Customer(id=1, firstName=Chris, lastName=Judd, email=javajudd@gmail.com)", c.toString());
    }
}