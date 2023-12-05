/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate.dao;

import springHibernate.model.karyawanbaru;
import java.util.List;

/**
 *
 * @author abesi
 */
public class KaryawanDAO {
    public void save(Karyawan karyawan);
    public void update(Karyawan karyawan);
    public void delete(Karyawan karyawan);
    public Karyawan getKaryawan(String nama);
    public List<Karyawan> getKaryawan();
}

