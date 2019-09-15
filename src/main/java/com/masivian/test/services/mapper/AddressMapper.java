/**
 * 
 */
package com.masivian.test.services.mapper;

import org.mapstruct.Mapper;
import com.masivian.test.model.Address;
import com.masivian.test.services.dto.AddressDTO;
import com.masivian.test.services.dto.GeoDTO;

/**
 * @author mosorio
 *
 */
@Mapper(componentModel = "spring", uses = GeoDTO.class)
public interface AddressMapper extends MapperContract<Address, AddressDTO> {
    
}
