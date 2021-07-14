package com.manifestcorp.lombok.builder;

import lombok.*;

@Data
@Builder
public class Customer {
    Long id;
    String firstName;
    String lastName;
    String email;

}
