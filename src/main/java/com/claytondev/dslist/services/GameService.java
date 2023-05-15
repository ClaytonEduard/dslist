package com.claytondev.dslist.services;

import com.claytondev.dslist.dto.GameDTO;
import com.claytondev.dslist.dto.GameMinDTO;
import com.claytondev.dslist.entities.Game;
import com.claytondev.dslist.projections.GameMinProjection;
import com.claytondev.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  // nao bloqueia o banco de dados para escrita
  @Transactional(readOnly = true)
  // metodo buscar por ID, retornando um GameDTO
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result); // retorna um DTO na pesquisa da funcao
  }

  // nao bloqueia o banco de dados para escrita
  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
