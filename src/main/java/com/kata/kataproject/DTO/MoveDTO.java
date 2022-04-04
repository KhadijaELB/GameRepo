package com.kata.kataproject.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MoveDTO {
	private int id;
	private int boardColumn;
    private int boardRow;
    private Date created;
    private int player; 
    private int game;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardColumn() {
		return boardColumn;
	}
	public void setBoardColumn(int boardColumn) {
		this.boardColumn = boardColumn;
	}
	public int getBoardRow() {
		return boardRow;
	}
	public void setBoardRow(int boardRow) {
		this.boardRow = boardRow;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
    
}
