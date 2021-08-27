package Game;

public class Tile {
	
	
	public int row;
	public int col;
	public Piece p;
	
	public Tile(int row, int col, Piece p){
		this.row = row;
		this.col = col;
		this.p = p;
	}
	
	public Piece show_piece() {
		return this.p;
	}
s
}
