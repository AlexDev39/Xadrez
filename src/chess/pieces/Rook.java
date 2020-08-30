package chess.pieces;

import bordgame.Boad;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Boad board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "R";
	}
	

}
