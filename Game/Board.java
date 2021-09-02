package Game;
import java.util.ArrayList;
import java.util.List;

public class Board {
	
	public List<List<Tile>> tiles;
	
	public Board() {
		for (int i = 1; i < 9; i++) {
			List<Tile> lst = new ArrayList<>();
			for (int j = 1; j < 9; j++) {
				Tile t  = new Tile(i, j);
				lst.add(t);
			}
			this.tiles.add(lst);
		}
	}
	

}

