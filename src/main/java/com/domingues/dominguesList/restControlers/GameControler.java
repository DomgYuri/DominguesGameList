package com.domingues.dominguesList.restControlers;

import com.domingues.dominguesList.DTO.GameDTO;
import com.domingues.dominguesList.entities.Game;
import com.domingues.dominguesList.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/games")
public class GameControler {

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameDTO> findAll() {
        return gameServices.findAll();
    }

}
