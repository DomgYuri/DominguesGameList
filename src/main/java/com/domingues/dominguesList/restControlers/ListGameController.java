package com.domingues.dominguesList.restControlers;

import com.domingues.dominguesList.DTO.GameListDTO;
import com.domingues.dominguesList.DTO.GameMinDTO;
import com.domingues.dominguesList.services.GameService;
import com.domingues.dominguesList.services.ListGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListGameController {

    @Autowired
    private ListGameService listGameService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return listGameService.findAll();
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

}
