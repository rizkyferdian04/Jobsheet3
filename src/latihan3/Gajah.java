/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Rizky17
 */
public class Gajah extends Hewan
{
    public static void testClassMethod()
    {
        System.out.println("The class method in hewan..");
        
    }
//meng-overwrite method pada class animal 
    @Override
    public void testInstanceMethod()
    {
        System.out.println("The instance method in gajah...");
        
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        
         Hewan.testClassMethod();
         myHewan.testInstanceMethod();
         Gajah hewan = new Gajah();
         hewan.testInstanceMethod();
         Hewan ikihewan = new Hewan();
         hewan.testClassMethod();
         
         
    }
}
