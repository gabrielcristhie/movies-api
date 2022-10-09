package com.gabriel.movies_api.repository;

import com.gabriel.movies_api.entities.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<movie, Long> {
}
