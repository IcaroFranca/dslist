package com.firstproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
