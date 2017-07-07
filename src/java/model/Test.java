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

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "TEST")
public class Test implements Serializable{    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "TIME")
    private Calendar time;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IS_POSITIVE")
    private String isPositive;
    @Column(name = "CODE")
    private String code;
    
    //many to one    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ORDER")
    private _Order order;
    
    //one to many
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
    private List<Sample> sampleList = new ArrayList<Sample>();
     
    public Test(){}       
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(String isPositive) {
        this.isPositive = isPositive;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public _Order getOrder() {
        return order;
    }

    public void setOrder(_Order order) {
        this.order = order;
    }

    public List<Sample> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<Sample> sampleList) {
        this.sampleList = sampleList;
    }

}
