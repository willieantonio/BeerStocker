package com.was.BeerStocker.mapper;

import com.was.BeerStocker.dto.BeerDTO;
import com.was.BeerStocker.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

	BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

	Beer toModel(BeerDTO beerDTO);

	BeerDTO toDTO(Beer beer);
}
