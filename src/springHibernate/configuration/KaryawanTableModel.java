/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate.configuration;

import springHibernate.model.karyawanbaru;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author abesi
 */
public class KaryawanTableModel {
    private List<karyawanbaru> karyawan = new ArrayList<>();
    private final String HEADER[] = {"Nama", "NIK", "Jenis Kelamin", "Jabatan", "Usia"};
    
    public KaryawanTableModel(List<karyawanbaru> karyawan) {
	this.karyawan = karyawan;
    }
    
    @Override
    public int getRowCount() {
	return karyawan.size();
    }
    
    @Override
    public int getColumnCount() {
	return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	Karyawan karyawan = karyawan.get(rowIndex);
            switch (columnIndex) {
		case 0:
                    return karyawan.getNama();
		case 1:
                    return karyawan.getNik();
		case 2:
                    return karyawan.getJKelamin();
		case 3:
                    return karyawan.getJabatan();
                case 4:
                    return karyawan.getUsia();
		default:
                    return null;
		}
    }
}
