/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

/**
 *
 * @author admin
 */
import java.util.Date;
public class Kendaraan {
    private String Jenis  ;
    private Pelayanan pelayanan ; 
    private String Pemilik ;
    private Date waktumasuk ; 
    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    /**
     * @return the pelayanan
     */
    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    /**
     * @param pelayanan the pelayanan to set
     */
    public void setPelayanan(Pelayanan pelayanan) {
        this.pelayanan = pelayanan;
    }

    /**
     * @return the Pemilik
     */
    public String getPemilik() {
        return Pemilik;
    }

    /**
     * @param Pemilik the Pemilik to set
     */
    public void setPemilik(String Pemilik) {
        this.Pemilik = Pemilik;
    }

    /**
     * @return the waktumasuk
     */
    public Date getWaktumasuk() {
        return waktumasuk;
    }

    /**
     * @param waktumasuk the waktumasuk to set
     */
    public void setWaktumasuk(Date waktumasuk) {
        this.waktumasuk = waktumasuk;
    }
}
