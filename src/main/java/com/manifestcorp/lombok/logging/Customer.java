package com.manifestcorp.lombok.logging;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Customer {
    Long id;
    String firstName;
    String lastName;
    String email;

    public void method() {
        log.debug("This is a debug message.");
    }

}
