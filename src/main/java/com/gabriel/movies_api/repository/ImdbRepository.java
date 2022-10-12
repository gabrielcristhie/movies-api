package com.gabriel.movies_api.repository;

import com.gabriel.movies_api.entities.imdb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ImdbRepository extends JpaRepository<imdb, Long> {}
