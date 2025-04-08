package com.divert.database.services;

import com.divert.database.domain.entities.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();

    Optional<AuthorEntity> findOne(long id);

    boolean isExist(long id);

    AuthorEntity partialUpdate(Long id, AuthorEntity authorEntity);

    void delete(Long id);

}

