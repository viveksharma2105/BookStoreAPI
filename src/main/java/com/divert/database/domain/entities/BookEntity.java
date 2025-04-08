package com.divert.database.domain.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;
}
//cascade means if we change in book/author it will change in book/author
// private Long authorId;   we  do not use this,  we use  author object bec here we use the author id