package com.codingshuttle.springwebtutorial.springbootwebtutorial.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="employees")
public class EmployeeEntity {
    private Long Id;
    private String Name;

    private String Email;
    private Integer Age;
    private LocalDate DateOfJoining;
    private Boolean IsActive;

}
