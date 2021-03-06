package com.kata.kataproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kata.kataproject.DTO.GameDTO;
import com.kata.kataproject.DTO.PlayerDTO;
import com.kata.kataproject.service.PlayerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PlayerController {
	@Autowired
    private PlayerService playerService;
   
    @PostMapping("/addPlayer")
    public ResponseEntity<PlayerDTO> createPlayer(@RequestBody PlayerDTO playerDto) {
    	PlayerDTO player = playerService.addPlayer(playerDto);
        return new ResponseEntity<>(player, HttpStatus.CREATED);
        
    }
    @GetMapping("/getPlayer/{id}")
    public PlayerDTO getPlayerById(@PathVariable(name = "id") Integer id) {
    	PlayerDTO player = playerService.getPlayerById(id);
        return player;
    }

}
