package com.proj.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//comment
@Getter
@Setter
@NoArgsConstructor      //Non para Constructor
@AllArgsConstructor     //Para Constructor
@Entity                 //Maps Entities in table
@Table(name = "employee")   //Create table with name
public class Employee {
    @Id     //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //Auto increment PK id
    private long id;
    @Column(name="fname")       //GIves column name place holder.
    private String firstname;   //will use firstname if @column not used
    @Column(name="lname")
    private String lastname;
    @Column(name="email", nullable = false, unique = true)  //unique, not null
    private String email;


}
