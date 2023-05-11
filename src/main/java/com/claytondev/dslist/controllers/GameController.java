package com.claytondev.dslist.controllers;

import com.claytondev.dslist.dto.GameDTO;
import com.claytondev.dslist.dto.GameMinDTO;
import com.claytondev.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id) {
    GameDTO result = gameService.findById(id);
    return result;
  }

  @GetMapping
  public List<GameMinDTO> findAll() {
    List<GameMinDTO> result = gameService.findAll();
    return result;
  }
}
