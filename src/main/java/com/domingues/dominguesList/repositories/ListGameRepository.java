package com.domingues.dominguesList.repositories;

import com.domingues.dominguesList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListGameRepository extends JpaRepository <GameList, Long> {
}
