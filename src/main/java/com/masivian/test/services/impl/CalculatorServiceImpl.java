package com.masivian.test.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.test.model.Calculator;
import com.masivian.test.repository.CalculatorRepository;
import com.masivian.test.services.CalculatorService;
import com.masivian.test.services.dto.CalculatorDTO;
import com.masivian.test.services.mapper.CalculatorMapper;

@Service
public class CalculatorServiceImpl implements CalculatorService{
	
	private Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private CalculatorRepository calculatorRepository;
	
	@Autowired
	private CalculatorMapper calculatorMapper;

	@Override
	public CalculatorDTO save(CalculatorDTO calculatorDTO) {
		log.info("saving calculator details");
		Calculator result = calculatorMapper.toEntity(calculatorDTO);
		result = calculatorRepository.save(result);
		return calculatorMapper.toDto(result);
	}
	
}
