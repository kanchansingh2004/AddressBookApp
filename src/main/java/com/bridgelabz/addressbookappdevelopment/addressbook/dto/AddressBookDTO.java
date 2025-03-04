package com.bridgelabz.addressbookappdevelopment.addressbook.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AddressBookDTO {
    //Instance variables
    private String name;
    private String email;
    private String contact;
}
