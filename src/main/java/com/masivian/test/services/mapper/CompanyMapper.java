/**
 * 
 */
package com.masivian.test.services.mapper;

import org.mapstruct.Mapper;

import com.masivian.test.model.Company;
import com.masivian.test.services.dto.CompanyDTO;

/**
 * @author mosorio
 *
 */
@Mapper(componentModel = "spring")
public interface CompanyMapper extends MapperContract<Company, CompanyDTO> {

}
