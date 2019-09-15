package com.masivian.test.services.mapper;

import org.mapstruct.Mapper;

import com.masivian.test.model.Calculator;
import com.masivian.test.services.dto.CalculatorDTO;

@Mapper(componentModel = "spring")
public interface CalculatorMapper extends MapperContract<Calculator, CalculatorDTO>{

}
