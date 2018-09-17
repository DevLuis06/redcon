package com.vitrocar.model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1



/**
 * DetSiniestro generated by hbm2java
 */
public class DetSiniestro  implements java.io.Serializable {


     private DetSiniestroId id;
     private Siniestro siniestro;
     private String comoOcurrio;
     private String calle;
     private String colonia;

    public DetSiniestro() {
    }

	
    public DetSiniestro(DetSiniestroId id, Siniestro siniestro) {
        this.id = id;
        this.siniestro = siniestro;
    }
    public DetSiniestro(DetSiniestroId id, Siniestro siniestro, String comoOcurrio, String calle, String colonia) {
       this.id = id;
       this.siniestro = siniestro;
       this.comoOcurrio = comoOcurrio;
       this.calle = calle;
       this.colonia = colonia;
    }
   
    public DetSiniestroId getId() {
        return this.id;
    }
    
    public void setId(DetSiniestroId id) {
        this.id = id;
    }
    public Siniestro getSiniestro() {
        return this.siniestro;
    }
    
    public void setSiniestro(Siniestro siniestro) {
        this.siniestro = siniestro;
    }
    public String getComoOcurrio() {
        return this.comoOcurrio;
    }
    
    public void setComoOcurrio(String comoOcurrio) {
        this.comoOcurrio = comoOcurrio;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }




}

