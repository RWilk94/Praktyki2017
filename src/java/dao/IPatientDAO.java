/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Patient;

/**
 *
 * @author rwilk
 */
public interface IPatientDAO {
    
    public Patient getPatientById(long id);
    
    public List<Patient> getPatientList();
    
    public boolean savePatient(Patient patient);
    
    public boolean deletePatient(long id);    
}
