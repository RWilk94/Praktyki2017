/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "MNAME")
    private String mname;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "DOB")
    private Calendar dob;
    @Column(name = "ACTIVE")
    private String active;
    @Column(name = "STARTED_WORK")
    private Calendar startedWork;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;    
    
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "ID_CLINIC")
    private Clinic clinic;
    
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<_Order> orderList = new ArrayList<_Order>();

    public Employee(){}
    
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Calendar getStartedWork() {
        return startedWork;
    }

    public void setStartedWork(Calendar startedWork) {
        this.startedWork = startedWork;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public List<_Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<_Order> orderList) {
        this.orderList = orderList;
    }
    
    
}
