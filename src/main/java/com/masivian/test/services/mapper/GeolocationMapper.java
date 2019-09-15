/**
 * 
 */
package com.masivian.test.services.mapper;

import org.mapstruct.Mapper;

import com.masivian.test.model.Geolocation;
import com.masivian.test.services.dto.GeoDTO;

/**
 * @author mosorio
 *
 */
@Mapper(componentModel = "spring")
public interface GeolocationMapper extends MapperContract<Geolocation, GeoDTO>{
    
}
