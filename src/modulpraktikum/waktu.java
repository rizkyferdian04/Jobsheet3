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
public class waktu extends pengajar{
    private String Waktu ;
    
    public waktu(String Waktu,String nis,String Namamapel, int Kodemapel)
    {
    super(nis,Namamapel,Kodemapel);
            this.Waktu = Waktu;
    }
    @Override
    public void info()
    {
        System.out.println("Waktu : "+ this.Waktu);
        super.info();
    }
}
