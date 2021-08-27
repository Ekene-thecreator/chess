package Game;

public abstract class Piece {
	public Tile tile;
	public Board board;
	
	
	public Piece(Tile t, Board b) {
		this.tile = t;
		this.board = b;
	}
	
	public Tile position() {
		return this.tile;
	}

}
