/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpraktikum;

/**
 *
 * @author Rizky17
 */


public class pengajar extends mapel{
    private String nis;
    
    public pengajar(String nis, String Namamapel, int Kodemapel)
    {
        super(Namamapel, Kodemapel);
        this.nis = nis;
        
    }
    
    public void info()
    {
        System.out.println("NIS : " +this.nis);
        super.info();
        
    }
}
