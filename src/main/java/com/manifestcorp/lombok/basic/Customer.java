package com.manifestcorp.lombok.basic;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Customer {
    Long id;
    String firstName;
    String lastName;
    String email;

}
