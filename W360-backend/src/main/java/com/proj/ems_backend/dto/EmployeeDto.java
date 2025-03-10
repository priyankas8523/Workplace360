package com.proj.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto { //DTO class is used to transfer data between client and server.
                            //Used as response for REST APIs
                            //to map EmpEntity to EmpDTO and vise versa - Emp Mapper
    private Long id;
    private String firstname;
    private String Lastname;
    private String email;
}
