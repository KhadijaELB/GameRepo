package com.kata.kataproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kata.kataproject.model.Move;

public interface MoveRepository extends JpaRepository<Move, Integer> {

	public List<Move> findByGameId(Integer idGame);

}
