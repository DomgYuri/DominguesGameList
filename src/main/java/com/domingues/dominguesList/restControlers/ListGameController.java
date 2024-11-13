package com.domingues.dominguesList.restControlers;

import com.domingues.dominguesList.DTO.GameListDTO;
import com.domingues.dominguesList.entities.GameList;
import com.domingues.dominguesList.services.GameServices;
import com.domingues.dominguesList.services.ListGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListGameController {

    @Autowired
    private ListGameService listGameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return listGameService.findAll();
    }

}
