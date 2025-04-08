package com.divert.database.mappers.impl;

import com.divert.database.domain.dto.BookDto;
import com.divert.database.domain.entities.BookEntity;
import com.divert.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mapper<BookEntity, BookDto> {

    private ModelMapper modelMapper;

    public  BookMapperImpl(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    @Override

    public BookDto mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BookDto.class);
    }


    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
