package Game;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
	
	public Tile tile;
	public Board board;
	
	public Queen(Tile t, Board b) {
		super (t, b);
	}
	
	public List<Tile> available_moves(){
		List<Tile> lst = new ArrayList<>();
		
		lst.addAll(this.check(1, 1));
		lst.addAll(this.check(-1, -1));
		lst.addAll(this.check(1, -1));
		lst.addAll(this.check(-1, 1));
		lst.addAll(this.check(0, 1));
		lst.addAll(this.check(0, -1));
		lst.addAll(this.check(1, -0));
		lst.addAll(this.check(-1, 0));
		
		return lst;
		
		
	}
	
}
