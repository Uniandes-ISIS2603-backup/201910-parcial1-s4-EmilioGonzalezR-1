/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.series.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author Jose Bocanegra
 */
@Entity
public class SerieEntity extends BaseEntity implements Serializable{
    private String name;
    private String description;
    
    @PodamExclude
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<PersonajeEntity> personajes;
    
    public SerieEntity(){
    
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the personajes
     */
    public List<PersonajeEntity> getPersonajes() {
        return personajes;
    }

    /**
     * @param personajes the personajes to set
     */
    public void setPersonajes(List<PersonajeEntity> personajes) {
        this.personajes = personajes;
    }
    
    
}
