package chess.pieces;

import bordgame.Boad;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Boad board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "K";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
