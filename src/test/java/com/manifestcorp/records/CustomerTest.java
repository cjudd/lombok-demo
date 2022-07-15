package com.manifestcorp.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerTest {

    @Test
    void constructor() {
        Customer c = new Customer(1L, "Chris", "Judd", "javajudd@gmail.com");
        assertEquals("Judd", c.lastName());
        assertEquals(-95933143, c.hashCode());
        assertEquals("Customer[id=1, firstName=Chris, lastName=Judd, email=javajudd@gmail.com]", c.toString());
    }
}