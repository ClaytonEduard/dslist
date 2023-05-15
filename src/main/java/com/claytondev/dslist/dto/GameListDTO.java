package com.claytondev.dslist.dto;

import com.claytondev.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

  private Long id;

  private String name;

  public GameListDTO() {}

  public GameListDTO(GameList entity) {
    // classe para nao precisar informar atributo por atributo
    // copiando dos dados da entidade GameList para o DTO(this)
    BeanUtils.copyProperties(entity, this); // e necessario haver na classe os gets e sets
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
