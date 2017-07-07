/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import dao.IPatientDAO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import model.Patient;
import webmodel.PatientWebModel;

/**
 *
 * @author rwilk
 */
@WebService(serviceName = "Patient")
public class PatientWebService {
    
    private final IPatientDAO patientDAO;
    
    @Inject
    public PatientWebService(IPatientDAO patientDao) {
        this.patientDAO = patientDao;
    }
    
    @WebMethod(operationName = "findById")
    public PatientWebModel findById(@WebParam(name = "id") long id){
        Patient patient = patientDAO.getPatientById(id);
        PatientWebModel patientWebModel = new PatientWebModel(patient);
        return patientWebModel;        
    }
    
    @WebMethod(operationName = "addPatient")
    public String addPatient(@WebParam(name = "patient") PatientWebModel patient) {        
        patientDAO.savePatient(new Patient(patient));        
        return "Dodano pacjenta.";               
    }     
    
    @WebMethod(operationName = "deletePatient")
    public String deletePatient(@WebParam(name = "id") long id){        
        if (patientDAO.deletePatient(id)==false)return "Błąd podczas usuwania";
        else return "Usinięto pacjenta.";
    }
    
    @WebMethod(operationName = "showPatientList")
    public List<PatientWebModel> showPatientList(){        
        List<PatientWebModel> patientWebModels = new ArrayList<>();
        List<Patient> patients = patientDAO.getPatientList();
        
        for (Patient patient : patients){
            patientWebModels.add(new PatientWebModel(patient));
        }
        return patientWebModels;
    } 
    
}
