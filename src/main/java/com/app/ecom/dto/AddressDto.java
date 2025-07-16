package com.app.ecom.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String city;
    private String street;
    private String state;
    private String country;
    private String zipcode;
}
