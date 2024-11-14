package com.domingues.dominguesList.restControlers;

import com.domingues.dominguesList.DTO.GameDTO;
import com.domingues.dominguesList.DTO.GameMinDTO;
import com.domingues.dominguesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/games")
public class GameControler {

    @Autowired
    private GameService gameServices;

    @GetMapping(value = "/{id}")
    public GameDTO findById (@PathVariable Long id){
        return gameServices.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameServices.findAll();
    }

}
