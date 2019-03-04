/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.series.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity
public class PersonajeEntity extends BaseEntity implements Serializable {
    
    private String name;
    
    private String portrayedBy;

    
    public PersonajeEntity(){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the portrayedBy
     */
    public String getPortrayedBy() {
        return portrayedBy;
    }

    /**
     * @param portrayedBy the portrayedBy to set
     */
    public void setPortrayedBy(String portrayedBy) {
        this.portrayedBy = portrayedBy;
    }
}
