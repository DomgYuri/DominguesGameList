package com.domingues.dominguesList.Repositories;

import com.domingues.dominguesList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
