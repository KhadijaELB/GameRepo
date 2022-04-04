package com.kata.kataproject.service;

import com.kata.kataproject.DTO.PlayerDTO;

public interface PlayerService {
	public PlayerDTO addPlayer(PlayerDTO playerDto);
	public PlayerDTO getPlayerById(Integer id);
}
