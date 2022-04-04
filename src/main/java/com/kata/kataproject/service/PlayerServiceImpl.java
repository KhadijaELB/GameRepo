package com.kata.kataproject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kata.kataproject.DTO.PlayerDTO;
import com.kata.kataproject.model.Player;
import com.kata.kataproject.repo.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Resource
    private PlayerRepository playerRepository;
	
	@Override
	@Transactional
	public PlayerDTO addPlayer(PlayerDTO playerDto) {
		Player player = new Player();
        mapDtoToEntity(playerDto, player);
        Player savedPlayer = playerRepository.save(player);
        return mapEntityToDto(savedPlayer);
	}
	
	private void mapDtoToEntity(PlayerDTO playerDto, Player player) {
		player.setPlayerName(playerDto.getPlayerName());
    	}
	    
	    private PlayerDTO mapEntityToDto( Player player) {
	    	PlayerDTO responseDto = new PlayerDTO();
	    	responseDto.setPlayerName(player.getPlayerName());
	    	responseDto.setId(player.getId());
	        return responseDto;
	    }

		@Override
		@Transactional
		public PlayerDTO getPlayerById(Integer id) {
			Player player = playerRepository.getOne(id);
			return mapEntityToDto(player);
		}
}
