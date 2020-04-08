/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasraihan;

/**
 *
 * @author arsip
 */
public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650280, "Arina", "Malang");
        
        arr.displayArray();
        
        long searchKey = 1665027220;
        Mahasiswa mhs = arr.find(searchKey);
        if (mhs != null){
            System.out.println("=================== \n");
            System.out.println("Mencari Data : " + searchKey);
            System.out.println("\nKetemu"); 
            mhs.displayMhs();
        } else {
            System.out.println("Ga Ketemu" + searchKey);
        }
        
        searchKey = 166502240;
        System.out.println("Hapus NIM : " + searchKey);
         System.out.println("\n=================== \n");
         System.out.println("Data Setelah Dihapus Nim\n");
        arr.delete(searchKey);
        
        arr.displayArray();
    }
}
