/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateUtil;
import java.util.List;
import model.Patient;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rwilk
 */
public class PatientDAO implements IPatientDAO {

    private static Logger logger = Logger.getLogger(PatientDAO.class);
    
    @Override
    public Patient getPatientById(long id) {
        logger.info("Function getPatientById " + id);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Patient patient = new Patient();
        try {
            Query query = session.createQuery("from Patient c where c.id=:id");
            query.setLong("id", id);
            patient = (Patient) query.uniqueResult();
            if (patient == null){                
                logger.warn("getPationetById - NullPointerException");
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            logger.error("Can't find a Patient ", e);
        } finally {
            session.close();
        }
        return patient;
    }

    @Override
    public List<Patient> getPatientList() {
        logger.info("Function getPatientList");
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Patient> patientsList;
        try {
            Query query = session.createQuery("from Patient c");
            patientsList = query.list();            
        } catch (HibernateException h){  
            patientsList = null;
            logger.error("Can't find a list of Patient ",h);
        } finally{
            session.close();
        }        
        return patientsList;
    }

    @Override
    public boolean savePatient(Patient patient) {
        logger.info("Function savePatient");
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean result = true;
        try {
            session.beginTransaction();
            session.saveOrUpdate(patient);
            session.getTransaction().commit();
        } catch (HibernateException h) {
            result = false;
              logger.error("Can't save the Patient ",h);
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    public boolean deletePatient(long id) {
        logger.info("Function deletePatient " +id);
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean result = true;
        try {
            Patient patient = getPatientById(id);
            session.beginTransaction();
            session.delete(patient);
            session.getTransaction().commit();
        } catch (HibernateException h) {
            result = false;
            logger.error("Can't delete the Patient ",h);
        } finally {
            session.close();
        }
        return result;
    }
}
