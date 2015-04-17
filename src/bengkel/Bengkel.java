/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

/**
 *
 * @author admin
 */
public class Bengkel {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Montir montir1 = new Montir () ;
        montir1.setId("1234") ; 
        try {
        montir1.setNama(" Idin ") ; } 
        catch (Exception e){
       System.out.println (" Terjadi Error" + e.getMessage()) ;
        }
     
     Montir montir2 = new Montir () ;
        montir2.setId("12345") ; 
        montir2.setNama(" Idhien ") ;
     
   
     

     Kendaraan kendaraan1 = new Kendaraan () ; 
     
     try {
     kendaraan1.setJenis("Mobil") ; 
     
     kendaraan1.setJenis ("Becak") ; //
     } catch (Exception e ) { 
         System.out.println (" Terjadi Error" + e.getMessage()) ;
     }
     
      SukuCadang SukuCadang1 = new SukuCadang () ;
        SukuCadang1.setSukucadang1("B") ;
        SukuCadang1.setSukucadang2 ("XYZ") ;
        
        Pelayanan Pelayanan1 = new Pelayanan () ;
        Pelayanan1.setPerbaikan ( "bbb") ;
     
       Biaya biaya1 = new Biaya () ;
        biaya1.setSukucadang1 () ; 
        biaya1.setPerbaikan () ;
      
       static void cetakKarcis(Biaya biaya1) {
    System.out.println (biaya1.getKendaraan());
       }
        
       
     
    
  
    
        // TODO code application logic here
    }

