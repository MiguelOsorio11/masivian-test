package com.masivian.test.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.test.model.Geolocation;
import com.masivian.test.repository.GeolocationRepository;
import com.masivian.test.services.GeolocationService;
import com.masivian.test.services.dto.GeoDTO;
import com.masivian.test.services.mapper.GeolocationMapper;

/**
 * 
 * @author Miguel Osorio
 *
 */
@Service
public class GeolocationServiceImpl implements GeolocationService{
	
	private final Logger log = LoggerFactory.getLogger(GeolocationServiceImpl.class);

	@Autowired
	private GeolocationRepository geoRepository;
	
	@Autowired
	private GeolocationMapper geoMapper;
	
	@Override
	public GeoDTO save(GeoDTO geolocationDTO) {
		log.info("saving geolocation details");
		Geolocation geolocation = geoMapper.toEntity(geolocationDTO);
		geolocation = geoRepository.save(geolocation);
		return geoMapper.toDto(geolocation);
	}

}
