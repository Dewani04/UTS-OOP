/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skincare;

/**
 *
 * @author ITB INDONESIA
 */
public class Skincare {
String merek;
String creamDnN;
String facialWash;
String serum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Skincare skincareku=new Skincare();
        skincareku.merek ="      : Scarlett";
        skincareku.creamDnN ="   : Acne";
        skincareku.facialWash =" : Wajah Kusam";
        skincareku.serum ="      : Glow Serum";
        
        System.out.println("merek"+skincareku.merek);
        System.out.println("creamDnN"+skincareku.creamDnN);
        System.out.println("facialWash"+skincareku.facialWash);
        System.out.println("serum"+skincareku.serum);
    }
    
}
