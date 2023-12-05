/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate.service;

import java.util.List;
import springHibernate.model.karyawanbaru;

/**
 *
 * @author abesi
 */
public class KaryawanService {
    public void save(Karyawan karyawan);
    public void update(Karyawan karyawan);
    public void delete(Karyawan karyawan);
    public Karyawan getKaryawan(String nama);
    public List<karyawanbaru> getKaryawan();
    
}
