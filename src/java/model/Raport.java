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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rwilk
 */
@Entity
@Table(name = "RAPORT")
public class Raport implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "TIME")
    private Calendar time;
    @Column(name = "CONTENT")
    private String content;
    //private byte[] content;
    @Column(name = "COMMENTS")
    private String comments;    
    
    @NotNull    
    @OneToOne(fetch = FetchType.LAZY) //w jednym mapped by a w drugim join column
    @JoinColumn(name = "ID_ORDER")
    private _Order order;

    public Raport(){}
    
   
    
    public _Order getOrder() {
        return order;
    }

    public void setOrder(_Order order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    

  
    
    

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

   /* public Blob getContent() {
        return content;
    }

    public void setContent(Blob content) {
        this.content = content;
    }*/

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    
}
