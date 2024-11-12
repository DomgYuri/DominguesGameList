package com.domingues.dominguesList.services;

import com.domingues.dominguesList.DTO.GameDTO;
import com.domingues.dominguesList.Repositories.GameRepository;
import com.domingues.dominguesList.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }

}
