package com.claytondev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.claytondev.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long>{
}
