package com.claytondev.dslist.services;

import com.claytondev.dslist.dto.GameListDTO;
import com.claytondev.dslist.entities.GameList;
import com.claytondev.dslist.repositories.GameListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  // nao bloqueia o banco de dados para escrita
  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
    return dto;
  }
}
