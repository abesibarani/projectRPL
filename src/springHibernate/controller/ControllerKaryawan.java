package springHibernate.controller;
import springHibernate.model.karyawanbaru;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

class ControllerKaryawan {
    ArrayList<karyawanbaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerKaryawan(){
        ArrayData = new ArrayList<karyawanbaru>();
    }
    
    public void InsertData (String nama, String nik, String jkelamin, String jabatan, int umur){
        karyawanbaru kyr = new karyawanbaru(nama, nik, jkelamin, jabatan, umur);
        ArrayData.add(kyr);
    }
    
    public boolean UpdateData(int index, String nama, String nik, String jkelamin, String jabatan, int umur ){
        if (index >= 0 && index < ArrayData.size()){
            karyawanbaru kyr = ArrayData.get(index);
            kyr.setNama(nama);
            kyr.setNik(nik);
            kyr.setJKelamin(jkelamin);
            kyr.setJabatan(jabatan);
            kyr.setUmur(umur);
            return true;
        }
        return false;
    }
    
    public boolean DeleteData(int index){
        if(index >= 0 && index < ArrayData.size()){
            ArrayData.remove(index);
            return true;
        }
        return false;
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Nama", "NIK", "Jenis Kelamin", "Jabatan", "Umur"};
        Object[][] objData = new Object [ArrayData.size()][5];
        int x = 0;
        
        for (karyawanbaru kyr : ArrayData){
            String[] arrData = {kyr.getNama(), kyr.getNik(), kyr.getJKelamin(), kyr.getJabatan(), String.valueOf(kyr.getUmur())};
            objData[x] = arrData;
            x++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }
}
