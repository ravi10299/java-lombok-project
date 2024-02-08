package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan
public class ConfigFile {
@Bean
    public Student1 student1(){

     return new Student1("ravi",123,"kit");

    }





}
