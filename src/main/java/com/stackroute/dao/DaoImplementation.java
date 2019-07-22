package com.stackroute.dao;

import com.stackroute.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DaoImplementation {

    private JdbcTemplate jdbcTemplate;


    public List<Customer> getCustomers()    //Retrieval Operation
    {
      return jdbcTemplate.query("select * from customers",new RowMapperImplementation());
    }
    public void createTable()               // Creating a table
    {

        String query="create table workers(id int,name varchar(20))";
        jdbcTemplate.execute(query);
        System.out.println("Table student created");
    }
    public void deleteRow()                  //Delete operation
    {
      String query="delete from customers where Id=4";
      jdbcTemplate.update(query);
        System.out.println("Row deleted");
    }
    public  void updateTable()               //Update Operation
    {
        String query="update customers set name='John', age=2,gender='male' where id =1";
        jdbcTemplate.update(query);
        System.out.println("table updated");
    }



    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
   static final class RowMapperImplementation implements RowMapper<Customer>    //Implements RowMapper
    {

        @Override
        public Customer mapRow(ResultSet resultSet, int i) throws SQLException {  //overrides mapRow()
            Customer customer=new Customer();
           customer.setId(resultSet.getInt("id"));
           customer.setName(resultSet.getString("name"));
           customer.setAge(resultSet.getInt("age"));
           customer.setGender(resultSet.getString("gender"));
             return  customer;
        }
    }



}
