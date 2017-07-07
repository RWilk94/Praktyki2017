/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//zrobione
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import webmodel.PatientWebModel;

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "PATIENT")
public class Patient implements Serializable {
    @Id    
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "MNAME")
    private String mname;
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "DOB")
    private Calendar dob;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP_CODE")
    private String zip_code;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "BIRTH_CITY")
    private String birth_city;
    @Column(name = "MRN")
    private String mrn;    
    @Column(name = "SEX")
    private String sex;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "IS_DISABLED")
    private String is_disabled;
    @Column(name = "RACE")
    private String race;
    
    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)    
    private List<_Order> orderList = new ArrayList<_Order>();

    public Patient(){
    }

    public Patient(PatientWebModel patientWebModel){
       this.setFname(patientWebModel.getFname());
        this.setMname(patientWebModel.getMname());
        this.setLname(patientWebModel.getLname());
        this.setDob(patientWebModel.getDob());
        this.setCity(patientWebModel.getCity());
        this.setZip_code(patientWebModel.getZip_code());
        this.setPhone(patientWebModel.getPhone());
        this.setAddress(patientWebModel.getAddress());
        this.setBirth_city(patientWebModel.getBirth_city());
        this.setMrn(patientWebModel.getMrn());
        this.setId(patientWebModel.getId());
        this.setSex(patientWebModel.getSex());
        this.setNationality(patientWebModel.getNationality());
        this.setIs_disabled(patientWebModel.getIs_disabled());
        this.setRace(patientWebModel.getRace());   
        this.orderList = null;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth_city() {
        return birth_city;
    }

    public void setBirth_city(String birth_city) {
        this.birth_city = birth_city;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(String is_disabled) {
        this.is_disabled = is_disabled;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<_Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<_Order> orderList) {
        this.orderList = orderList;
    }
    
    
}
