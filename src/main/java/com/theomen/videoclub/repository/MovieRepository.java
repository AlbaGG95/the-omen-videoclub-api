package com.theomen.videoclub.repository;

import com.theomen.videoclub.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
