/**
 * 
 */
package com.masivian.test.services.mapper;

import org.mapstruct.Mapper;

import com.masivian.test.model.Client;
import com.masivian.test.services.dto.AddressDTO;
import com.masivian.test.services.dto.ClientDTO;
import com.masivian.test.services.dto.CompanyDTO;

/**
 * @author mosorio
 *
 */
@Mapper(componentModel = "spring",uses= {AddressDTO.class,CompanyDTO.class})
public interface ClientMapper extends MapperContract<Client, ClientDTO> {

}
