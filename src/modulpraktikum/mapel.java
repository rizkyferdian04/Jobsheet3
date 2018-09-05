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
public class mapel 
{
 public String namamapel;
 public int kodemapel;
 
    public mapel(String Namamapel,int Kodemapel)
    {
        this.namamapel = Namamapel;
        this.kodemapel = Kodemapel;
    }
    
    public void info()
    {
        System.out.println("nama mapel : " + this.namamapel);
        System.out.println("kode mapel : " + this.kodemapel);
        
    }
}
