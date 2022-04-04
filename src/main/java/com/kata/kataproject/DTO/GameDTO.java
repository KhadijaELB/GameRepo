package com.kata.kataproject.DTO;
import com.kata.kataproject.enums.GameStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter

public class GameDTO {
	private int id;
	private String gameName;
	private int secondPlayer;
	private int firstPlayer;
    private GameStatus gameStatus;
    private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getSecondPlayer() {
		return secondPlayer;
	}
	public void setSecondPlayer(int secondPlayer) {
		this.secondPlayer = secondPlayer;
	}
	public int getFirstPlayer() {
		return firstPlayer;
	}
	public void setFirstPlayer(int firstPlayer) {
		this.firstPlayer = firstPlayer;
	}
	public GameStatus getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
    

}
