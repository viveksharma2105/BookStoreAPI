package com.divert.database.mappers.impl;

import com.divert.database.domain.dto.AuthorDto;
import com.divert.database.domain.entities.AuthorEntity;
import com.divert.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements Mapper<AuthorEntity,AuthorDto> {

    private ModelMapper modelMapper;

    AuthorMapperImpl(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        return modelMapper.map(authorDto, AuthorEntity.class);
    }
}
