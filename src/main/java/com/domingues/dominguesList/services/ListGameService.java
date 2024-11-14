package com.domingues.dominguesList.services;

import com.domingues.dominguesList.DTO.GameListDTO;
import com.domingues.dominguesList.repositories.ListGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListGameService {

    @Autowired
    private ListGameRepository listGameRepository;

    public List<GameListDTO> findAll() {
        var gameLists = listGameRepository.findAll();
        return gameLists.stream().map(x -> new GameListDTO(x)).toList();
    }

}
