package com.codingshuttle.springwebtutorial.springbootwebtutorial.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long Id;
    private String Name;

    private String Email;
    private Integer Age;
    private LocalDate DateOfJoining;
    private Boolean IsActive;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        Id = id;
        Name = name;
        Email = email;
        Age = age;
        DateOfJoining = dateOfJoining;
        IsActive = isActive;
    }
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public LocalDate getDateOfJoining() {
        return DateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }
}
