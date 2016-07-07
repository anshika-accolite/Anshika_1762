package com.accolite.chessgame;

public abstract class Piece 
{
	private boolean available;
	private int x;
	private int y;
	private Color color;
	
	public Piece(boolean available, int x, int y, Color color) {
		super();
		this.available = available;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	

	public abstract boolean valid(ChessBoard board , int fromX , int toX , int fromY , int toY)
	{
		//Write code for valid position of piece
		return true;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
