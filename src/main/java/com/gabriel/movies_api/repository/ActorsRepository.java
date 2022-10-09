package com.gabriel.movies_api.repository;

import com.gabriel.movies_api.entities.actors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorsRepository extends JpaRepository<actors, Long> {
}
