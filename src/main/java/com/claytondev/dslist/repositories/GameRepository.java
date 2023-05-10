package com.claytondev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytondev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
