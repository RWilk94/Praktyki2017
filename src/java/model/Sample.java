/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//zrobione
package model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "SAMPLE")
public class Sample implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "IS_COLLECTED")
    private String isCollected;
    @Column(name = "COL_DATE")
    private Calendar colDate;
    @Column(name = "IS_SHORT_TERM")
    private String isShortTerm;
    @Column(name = "IS_TOXIC")
    private String isToxic; 
    
    //many to one    
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTAINER")
    private Container container;
    //many to one  
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TEST")
    private Test test;

   
    public Sample(){
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsCollected() {
        return isCollected;
    }

    public void setIsCollected(String isCollected) {
        this.isCollected = isCollected;
    }

    public Calendar getColDate() {
        return colDate;
    }

    public void setColDate(Calendar colDate) {
        this.colDate = colDate;
    }

    public String getIsShortTerm() {
        return isShortTerm;
    }

    public void setIsShortTerm(String isShortTerm) {
        this.isShortTerm = isShortTerm;
    }

    public String getIsToxic() {
        return isToxic;
    }

    public void setIsToxic(String isToxic) {
        this.isToxic = isToxic;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }


}
