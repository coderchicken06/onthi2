/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;
import Entity.Customer;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public interface CustomerDao {
    List<Customer> getAll();
    boolean insert(Customer c);
    boolean update(Customer c);
    boolean delete(int customerId);
}
