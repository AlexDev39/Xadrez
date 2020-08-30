package bordgame;

public class Piece {
	
	protected Position position;
	private Boad board;
	public Piece(Boad board) {
		this.board = board;
		position = null;
	}
	protected Boad getBoard() {
		return board;
	}
	
}
