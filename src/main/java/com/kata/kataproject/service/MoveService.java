package com.kata.kataproject.service;


import java.util.List;

import com.kata.kataproject.DTO.MoveDTO;

public interface MoveService {
	public MoveDTO addMove(MoveDTO moveDto);
	public List<MoveDTO> getMoves(Integer idGame);
}
