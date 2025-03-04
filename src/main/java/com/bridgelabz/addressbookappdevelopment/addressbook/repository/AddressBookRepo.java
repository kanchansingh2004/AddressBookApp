package com.bridgelabz.addressbookappdevelopment.addressbook.repository;

import com.bridgelabz.addressbookappdevelopment.addressbook.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository for using SQL Queries
public interface AddressBookRepo extends JpaRepository<AddressBook,Long> {
}
