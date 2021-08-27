package Game;
import java.util.List;

public class Board {
	
	private List<Tile> tiles;
	
	public Board() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Tile t  = new Tile(i, j);
				this.tiles.add(t);
			}
		}
	}

}

