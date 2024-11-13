package com.domingues.dominguesList.services;

import com.domingues.dominguesList.DTO.GameDTO;
import com.domingues.dominguesList.DTO.GameMinDTO;
import com.domingues.dominguesList.Repositories.GameRepository;
import com.domingues.dominguesList.entities.Game;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
            Game result = gameRepository.findById(gameId).get();
            return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
