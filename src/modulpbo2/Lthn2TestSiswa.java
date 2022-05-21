/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpbo2;

/**
 *
 * @author WINDOWS 10
 */
public class Lthn2TestSiswa {
    public static void main(String[] args) {
        // TODO code application logic here
    Lthn2EncapSiswa siswa = new Lthn2EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }
    
}


