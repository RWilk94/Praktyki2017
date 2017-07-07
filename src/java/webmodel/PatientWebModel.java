/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webmodel;

import java.util.Calendar;
import model.Patient;

/**
 *
 * @author rwilk
 */
public class PatientWebModel {

    private int id;
    private String fname;
    private String mname;
    private String lname;
    private Calendar dob;
    private String city;
    private String zip_code;
    private String phone;
    private String address;
    private String birth_city;
    private String mrn;
    private String sex;
    private String nationality;
    private String is_disabled;
    private String race;

    public PatientWebModel() {
    }

    public PatientWebModel(Patient patient) {

        this.id = patient.getId();
        //this.setId(patient.getId());
        this.fname = patient.getFname();
        this.mname = patient.getMname();
        this.lname = patient.getLname();
        //if (patient.getDob() != null) {
        this.dob = patient.getDob();
        //}
        this.city = patient.getCity();
        this.zip_code = patient.getZip_code();
        this.phone = patient.getPhone();
        this.address = patient.getAddress();
        this.birth_city = patient.getBirth_city();
        this.mrn = patient.getMrn();
        this.sex = patient.getSex();
        this.nationality = patient.getNationality();
        this.is_disabled = patient.getIs_disabled();
        this.race = patient.getRace();
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

}
