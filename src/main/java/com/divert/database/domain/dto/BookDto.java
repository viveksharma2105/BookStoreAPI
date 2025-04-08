package com.divert.database.domain.dto;

import com.divert.database.domain.entities.AuthorEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
@Builder
public class BookDto {


    private String isbn;

    private String title;


    private AuthorDto authorEntity;


}



