/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Customer;
import java.util.List;

public interface CustomerDAO {
    List<Customer> getAll();
    boolean insert(Customer c);
    boolean update(Customer c);
    boolean delete(int customerId);
}

