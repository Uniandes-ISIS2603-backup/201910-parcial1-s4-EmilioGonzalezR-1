/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.series.dtos;

import co.edu.uniandes.csw.series.entities.PersonajeEntity;
import co.edu.uniandes.csw.series.entities.SerieEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Bocanegra
 */
public class SerieDetailDTO extends SerieDTO {
    
    private List<PersonajeDTO> personajes;
    
    public SerieDetailDTO(){
    
    }
    
    public SerieDetailDTO(SerieEntity entity){
        super(entity);
        for(PersonajeEntity pEntity : entity.getPersonajes()){
            personajes.add(new PersonajeDTO(pEntity));
        }
    }

    /**
     * @return the personajes
     */
    public List<PersonajeDTO> getPersonajes() {
        return personajes;
    }

    /**
     * @param personajes the personajes to set
     */
    public void setPersonajes(List<PersonajeDTO> personajes) {
        this.personajes = personajes;
    }
    
    public SerieEntity toEntity(){
        SerieEntity entity = super.toEntity();
        List<PersonajeEntity> pEntities = new ArrayList<PersonajeEntity>();
        for(PersonajeDTO pDTO : this.personajes){
            pEntities.add(pDTO.toEntity());
        }
        entity.setPersonajes(pEntities);
        return entity;
    } 
    
}
