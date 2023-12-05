/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate.service;

import springHibernate.dao.KaryawanDAO;
import springHibernate.model.karyawanbaru;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("KaryawanService")
@Transactional(readOnly = true)

/**
 *
 * @author abesi
 */
public class KaryawanServiceImpl {
    @Autowired
    private KaryawanDAO karyawanDao;
    
    @Transactional
    @Override
    public void save(Karyawan karyawan) {
	karyawanDao.save(karyawan);
    }
    
    @Transactional
    @Override
    public void update(Karyawan karyawan) {
	karyawanDao.update(karyawan);
    }
    
    @Transactional
    @Override
    public void delete(Karyawan karyawan) {
	karyawanDao.delete(karyawan);
    }
    
    @Override
    public Karyawan getKaryawan(String nama) {
	return karyawanDao.getKaryawan(nama);
    }
    
    @Override
    public List<karyawanbaru> getKaryawan() {
	return karyawanDao.getKaryawan();
    }
}
