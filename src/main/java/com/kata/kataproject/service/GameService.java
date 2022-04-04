package com.kata.kataproject.service;

import java.util.List;

import com.kata.kataproject.DTO.GameDTO;

public interface GameService {
	public GameDTO createGame(GameDTO gameDto);
	public List<GameDTO> getGames();
	public GameDTO updateGame(Integer id,GameDTO gameDto);
}
