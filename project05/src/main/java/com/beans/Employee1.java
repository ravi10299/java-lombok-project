package com.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Employee1 {
    private String name;
    private int id ;
    private double salary;


}
