/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Dao.CustomerDao;
import Entity.Customer;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class customerController {
    private CustomerDao dao = new CustomerDao();

    public void addCustomer(Customer c) {
        dao.themSinhVien(c);
    }

   

    public void deleteCustomer(String id) {
        dao.xoaKhoaHoc(id);
    }

    public List<Customer> getAllCustomers() {
        return dao.allGet();
    }

    
}

