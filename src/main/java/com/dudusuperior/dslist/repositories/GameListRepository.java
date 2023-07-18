package com.dudusuperior.dslist.repositories;

import com.dudusuperior.dslist.entities.Game;
import com.dudusuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
