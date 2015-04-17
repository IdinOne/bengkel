/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

/**
 *
 * @author admin
 */
public class Pelayanan {
    private String perbaikan ; 
    private String perawatan ;

    /**
     * @return the pelayanan1
     */
    
    /**
     * @return the perbaikan
     */
    public String getPerbaikan() {
        return perbaikan;
    }

    /**
     * @param perbaikan the perbaikan to set
     */
    public void setPerbaikan(String perbaikan) {
        this.perbaikan = perbaikan;
    }

    /**
     * @return the perawatan
     */
    public String getPerawatan() {
        return perawatan;
    }

    /**
     * @param perawatan the perawatan to set
     */
    public void setPerawatan(String perawatan) {
        this.perawatan = perawatan;
    }

    void setPerbaikan() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
