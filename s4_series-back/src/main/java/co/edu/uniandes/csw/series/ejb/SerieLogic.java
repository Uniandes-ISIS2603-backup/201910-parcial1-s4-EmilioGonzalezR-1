/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.series.ejb;

import co.edu.uniandes.csw.series.entities.PersonajeEntity;
import co.edu.uniandes.csw.series.entities.SerieEntity;
import co.edu.uniandes.csw.series.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.series.persistence.SeriePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Jose Bocanegra
 */
@Stateless
public class SerieLogic {
    @Inject
    private SeriePersistence persistence; // Variable para acceder a la persistencia de la aplicación. Es una inyección de dependencias.
   
    public SerieEntity getSerie(Long id) {
        return persistence.find(id);
    }
    
    //TODO modificar el método createHeroe
  
    public SerieEntity createSerie(SerieEntity entity) throws BusinessLogicException{
        SerieEntity refEntity = persistence.findByName(entity.getName());
        if(refEntity != null){
            throw new BusinessLogicException("La serie con nombre " + entity.getName() + " ya existe.");
        }
        if(entity.getDescription().length() <= 30){
            throw new BusinessLogicException("La serie " + entity.getName() 
                    + "tiene una descipciòn de menos de 30 caracteres");
        }
        return persistence.create(entity);
    }
    
    public void deleteSerie(SerieEntity entity) throws BusinessLogicException{
        List<PersonajeEntity> personajes = entity.getPersonajes();
        if(personajes.isEmpty()){
            throw new BusinessLogicException("La serie " + entity.getName() + " debe tener personajes para ser eliminada.");
        }
        persistence.delete(entity.getId());
    }
    
    
    
}
