package com.movies.api.repository;

import com.movies.api.entities.ImdbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImdbRepository extends JpaRepository<ImdbEntity, Long> {
}
