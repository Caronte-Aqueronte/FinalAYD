package com.ayd.refact;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String zip;
}
