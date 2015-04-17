/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

/**
 *
 * @author admin
 */
public class Montir {
   private String id;
    private String nama ;
    Montir () {
    
    }
    
    public Montir (String id, String nama) throws Exception {
     
    this.id = id;  
    this.nama = nama;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */ 
    public void setNama(String nama) {
        for ( char c : nama.toCharArray()){
        if (Character.isDigit(c)) {
            return ;
        }
        }
        this.nama = nama;
    }
     
}
