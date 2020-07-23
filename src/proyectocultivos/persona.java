/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectocultivos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class persona {
    
    // creamos atributos 
      String LonZona;
     String zonanombre;
     String LatitudT;

    public persona() {
        this.LonZona = "";
        this.zonanombre = "";
        this.LatitudT = "";
    }
     
     

    public String getLonZona() {
        return LonZona;
    }

    public void setLonZona(String LonZona) {
        this.LonZona = LonZona;
    }

    public String getZonanombre() {
        return zonanombre;
    }

    public void setZonanombre(String zonanombre) {
        this.zonanombre = zonanombre;
    }

    public String getLatitudT() {
        return LatitudT;
    }

    public void setLatitudT(String LatitudT) {
        this.LatitudT = LatitudT;
    }
     
     
     

}
     
