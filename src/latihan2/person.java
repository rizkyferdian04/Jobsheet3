/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Rizky17
 */
class person 
{
 private String nama;
 private int usia ;
 
 //kontruktor
 public person (String nama, int usia)
 {
     this.nama = nama;
     this.usia = usia;
 }
 
 //Method 
        public void info ()
        {
            System.out.println("Nama : "+this.nama );
            System.out.println("Usia : "+this.usia);
            
            person aku = new person("rizky",17);
            aku.info();
        }
    
 
}
