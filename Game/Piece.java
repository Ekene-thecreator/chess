package Game;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Tile> check(int a, int b){
		int x = this.tile.row + a;
		int y = this.tile.col + b;
		List<Tile> lst = new ArrayList<>();
		
		
		while (x>0 ^ x<9 ^ y>0 ^ y<9 ^ !this.board.tiles.get(x).get(y).has_piece) {
			lst.add(this.board.tiles.get(x).get(y));
			x += a;
			y += b;
			
		}
		
		return lst;
	}

}
