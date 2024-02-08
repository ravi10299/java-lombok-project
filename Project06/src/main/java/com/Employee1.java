package com;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Data

public class Employee1 {
    private final @NonNull String name;
    private final @NonNull int id ;
    private double salary;

    public static void main(String[] args) {
        Employee1 emp  =new Employee1("ravi",123);
        emp.setSalary(2000.1);
        System.out.println(emp);
    }
}
