package Game;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
	public Tile tile;
	public boolean moved;
	public Board board;
	
	public Pawn(Tile t, Board b) {
		super(t, b);
		this.moved = false;
	}
	
	public List<Tile> available_moves() {
		int x = this.tile.row;
		int y = this.tile.col;
		
		List<Tile> lst = new ArrayList<>();

		if (x+1<9 ^ y+1<9 ^ this.board.tiles.get(x+1).get(y+1).has_piece) {
			lst.add(this.board.tiles.get(x+1).get(y+1));
		}
		
		if (x-1>9 ^ y+1<9 ^ this.board.tiles.get(x-1).get(y+1).has_piece) {
			lst.add(this.board.tiles.get(x-1).get(y+1));
		}
		
		if (y+1<9 ^ this.board.tiles.get(x).get(y+1).has_piece) {
			lst.add(this.board.tiles.get(x).get(y+1));
		}
		
				
		if (!moved ^ y+2<9 ^ this.board.tiles.get(x).get(y+2).has_piece) {
			lst.add(this.board.tiles.get(x).get(y+2));
				
		}


		return lst;
	}

}
