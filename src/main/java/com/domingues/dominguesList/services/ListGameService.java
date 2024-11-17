package com.domingues.dominguesList.services;

import com.domingues.dominguesList.DTO.GameListDTO;
import com.domingues.dominguesList.repositories.GameRepository;
import com.domingues.dominguesList.repositories.ListGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListGameService {

    @Autowired
    private ListGameRepository listGameRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        var gameLists = listGameRepository.findAll();
        return gameLists.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        var list = gameRepository.searchByList(listId);
        var obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            listGameRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }



}
