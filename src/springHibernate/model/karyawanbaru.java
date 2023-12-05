package springHibernate.model;

class karyawanbaru {
    private String nama;
    private String nik;
    private String jabatan;
    private String jkelamin;
    private int umur;
    
    public karyawanbaru(String nama, String nik, String jabatan, String jKelamin, int umur) {
        this.nama = nama;
        this.nik = nik;
        this.jabatan = jabatan;
        this.jkelamin = jKelamin;
        this.umur = umur;
    }
           
    public String getNama() {
        return nama;
    }
    
    public String getNik() {
        return nik;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public String getJKelamin() {
        return jkelamin;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void setJKelamin(String jkelamin) {
        this.jkelamin = jkelamin;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    @Override
    public String toString (){
        return "Nama Karyawan : " +nama+ ", NIK : " +nik+ ", Jabatan : " +jabatan+ ",Jenis Kelamin : " +jkelamin+ ",Umur : " +umur;
    }
}
