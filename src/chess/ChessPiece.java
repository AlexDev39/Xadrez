package chess;

import bordgame.Boad;
import bordgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Boad board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
