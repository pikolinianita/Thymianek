/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.luccasso.thymianek.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.luccasso.thymianek.model.City;

/**
 *
 * @author piko
 */
@Repository
public interface CityRepo extends CrudRepository<City, Long>{
    
}
