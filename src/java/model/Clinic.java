/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "CLINIC")
public class Clinic implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private long id;    
    
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    
    @Size(max = 255)
    @Column(name = "ADDRESS", length = 255)
    private String address;
    
    @Size(max = 255)
    @Column(name = "PHONE", length = 255)
    private String phone;
    
    @Size(max = 255)
    @Column(name = "COUNTRY", length = 255)
    private String country;
    
    @Size(max = 255)
    @Column(name = "WEBSITE", length = 255)
    private String website;
    
    @Size(max = 255)
    @Column(name = "EMAIL", length = 255)
    private String email;
    
    @OneToMany(mappedBy = "clinic", fetch = FetchType.LAZY)
    private List<_Order>orderList = new ArrayList<_Order>();
    
    @OneToMany(mappedBy = "clinic", fetch = FetchType.LAZY)//wpisujemy pole z javy
    private List<Employee> employeeList = new ArrayList<Employee>();  

    public Clinic(){}    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<_Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<_Order> orderList) {
        this.orderList = orderList;
    }

    @XmlTransient
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
