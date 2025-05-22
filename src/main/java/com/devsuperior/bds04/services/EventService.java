package com.devsuperior.bds04.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.CityRepository;
import com.devsuperior.bds04.repositories.EventRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	@Autowired
	private CityRepository cityRepository;
	
    @Transactional(readOnly = true)
    public Page<EventDTO> findAll(Pageable pageable) {
        Page<Event> result = repository.findAll(pageable);
        return result.map(x -> new EventDTO(x));
    }
		
	public EventDTO insert(EventDTO dto) {
		Event entity = new Event();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new EventDTO(entity);
	}

	private void copyDtoToEntity(EventDTO dto, Event entity) { 		
		entity.setName(dto.getName());
		entity.setDate(dto.getDate());
		entity.setUrl(dto.getUrl());
		if(dto.getCityId() != null) {
			City city = cityRepository.getReferenceById(dto.getCityId());
			entity.setCity(city);			
		}
	}
}
