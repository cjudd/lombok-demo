package com.manifestcorp.lombok.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerTest {

    @Test
    void noParameterConstructor() {
        Customer c = Customer.builder()
                .id(1L)
                .firstName("Chris")
                .lastName("Judd")
                .email("javajudd@gmail.com").build();
        assertNotNull(c);
        assertEquals(792046746, c.hashCode());
        assertEquals("Customer(id=1, firstName=Chris, lastName=Judd, email=javajudd@gmail.com)", c.toString());
    }
}