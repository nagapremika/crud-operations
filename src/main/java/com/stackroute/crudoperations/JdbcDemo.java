package com.stackroute.crudoperations;

import com.stackroute.dao.DaoImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");   //Creating a context object
        DaoImplementation daoImplementation = context.getBean("daoImplementation", DaoImplementation.class);        //Creating DaoImplementation object
        daoImplementation.createTable();        //creates a table
        daoImplementation.updateTable();        //Updates table
        System.out.println(daoImplementation.getCustomers());   //Prints the table rows as lists
        daoImplementation.deleteRow();          //deletes a row in table
    }
}
