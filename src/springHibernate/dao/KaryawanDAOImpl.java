/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate.dao;

import springHibernate.model.karyawanbaru;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author abesi
 */
    @Repository
public class KaryawanDAOImpl implements KaryawanDAO {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Karyawan karyawan) {
	sessionFactory.getCurrentSession().save(mahasiswa);
    }
    
    @Override
    public void update(Karyawan karyawan) {
	sessionFactory.getCurrentSession().update(mahasiswa);
    }
    
    @Override
    public void delete(Karyawan karyawan) {
	sessionFactory.getCurrentSession().delete(mahasiswa);
    }
    
    @Override
    public Karyawan getKaryawan(String nama) {
	return (Karyawan) sessionFactory.getCurrentSession().get(Karyawan.class, nama);
    }
    
    @Override
    public List<karyawanbaru> getKaryawan() {
	return sessionFactory.getCurrentSession().createCriteria(Karyawan.class).list();
    }
}
