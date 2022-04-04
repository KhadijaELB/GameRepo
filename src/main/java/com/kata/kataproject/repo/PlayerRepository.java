package com.kata.kataproject.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kata.kataproject.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	public Player findById(int idPlayer);
}
