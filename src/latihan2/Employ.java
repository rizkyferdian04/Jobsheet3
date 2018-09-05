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
class Employ extends person 
{
    private String nokaryawan;
    //konstruktor 
    public Employ (String nokaryawan , String nama ,int usia )
    {
        super(nama, usia );
        this.nokaryawan = nokaryawan;
        
    }
    //metode
    public void info()
    {
        System.out.println("No. Karyawan : " + this.nokaryawan);
        super.info();
    }
    //akhir kelas employ 
    
    
 }

