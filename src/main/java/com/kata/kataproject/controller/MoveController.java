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

import com.kata.kataproject.DTO.MoveDTO;
import com.kata.kataproject.service.MoveService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MoveController {

	@Autowired
	private MoveService moveService;
	   
    @PostMapping("/addMove")
    public ResponseEntity<MoveDTO> addMove(@RequestBody MoveDTO moveDto) {
    	MoveDTO move = moveService.addMove(moveDto);
        return new ResponseEntity<>(move, HttpStatus.CREATED);
        
    }
    @GetMapping("/getListMove/{idGame}")
    public List<MoveDTO> getGames(@PathVariable(name = "idGame") Integer idGame) {
    	List<MoveDTO> listMove = moveService.getMoves(idGame);
        return listMove;
    }
}
