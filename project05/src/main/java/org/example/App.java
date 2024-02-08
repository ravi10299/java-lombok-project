package org.example;

import com.beans.CollectionData1;
import com.beans.ConfigFile;
import com.beans.Employee1;
import com.beans.Student1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigFile.class);

        //EmployeeData.......
        System.out.println("*******************employee****************");

        Employee1 e = ac.getBean("employee1", Employee1.class);
        e.setName("ravi");
        e.setId(123);
        e.setSalary(20000.2);

        System.out.println(e.getName());
        System.out.println(e.getId( ));
        System.out.println(e.getSalary());

      //  Student........
        System.out.println("**************Student****************");

        Student1 std = ac.getBean("student1", Student1.class);
        System.out.println(std);

        //CollectionData.................
        System.out.println("************collection set**************");

        CollectionData1 data = ac.getBean("collectionData1", CollectionData1.class);
        data.Display1();


    }
}
