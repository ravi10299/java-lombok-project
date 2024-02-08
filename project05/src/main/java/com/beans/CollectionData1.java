package com.beans;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
@Data

public class CollectionData1 {

       public void Display1(){
              Set<Client1> ch = new HashSet<>();
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
              ch.add(new Client1("ravi",123));
//              for (Client1 temp:ch){
//                     System.out.println(temp);
//              }
              ch.forEach(emp -> System.out.println(emp)
              );
       }


}
