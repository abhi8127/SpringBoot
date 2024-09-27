package com.codingshuttle.springwebtutorial.springbootwebtutorial.controller;

import com.codingshuttle.springwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
//    @GetMapping(path="/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "secret message: asdagh@QWSR";
//    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId,"Abhisgek","abhishek@gmail.com",24, LocalDate.of(2024,1,2),true);

    }

    @GetMapping
    public String getAllEmployee(@RequestParam(required = false) Integer Age,
                                 @RequestParam(required = false) String SortBy){
        return "Hi My age is "+Age+" "+SortBy;

    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputemp){
        inputemp.setId(1000l);
        return inputemp;
    }

}
