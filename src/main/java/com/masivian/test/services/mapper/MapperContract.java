package com.masivian.test.services.mapper;

import java.util.List;

public interface MapperContract <E, D> {

	D toDto(E entity);
	
	E toEntity(D dto);
	
	List <E> toEntity(List<D> dtoList);

	List <D> toDto(List<E> entityList);
}
