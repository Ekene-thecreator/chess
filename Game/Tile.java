package Game;

public class Tile {
	
	
	public int row;
	public int col;
	public Piece p;
	public boolean has_piece;
	
	public Tile(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	public void add_piece(Piece p) {
		this.p = p;
		this.has_piece = true;
	}
	
	public void remove_piece() {
		this.has_piece = false;
	}
	

}
