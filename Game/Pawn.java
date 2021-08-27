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
		if (moved) {
			List<Tile> lst = new ArrayList<>();
			if ()
		}
	}

}
