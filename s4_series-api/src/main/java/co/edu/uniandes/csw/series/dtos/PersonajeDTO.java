/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.series.dtos;

import co.edu.uniandes.csw.series.entities.PersonajeEntity;

/**
 *
 * @author estudiante
 */
public class PersonajeDTO {
    
    private Long id;
    
    private String name;
    
    private String portrayedBy;
    
    public PersonajeDTO(){
        
    }
    
    public PersonajeDTO(PersonajeEntity personaje){
        this.id = personaje.getId();
        this.name = personaje.getName();
        this.portrayedBy = personaje.getPortrayedBy();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
    
    public PersonajeEntity toEntity() {
        PersonajeEntity entity = new PersonajeEntity();
        entity.setId(this.id);
        entity.setName(this.name);
        entity.setPortrayedBy(this.portrayedBy);
        return entity;
    }
    
}
