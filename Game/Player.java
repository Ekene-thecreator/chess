package Game;
import java.util.ArrayList;
import java.util.List;


public class Player {
	
	public List<Piece> killed;
	public Board board;
	public int player_num;
	
	public Player(Board board, int num) {
		
		this.board = board;
		this.killed = new ArrayList<>();
		this.player_num = num;
		
	}
	
	public void move(Tile x, Tile y) {
		
		if (x.p.color!=this.player_num) {
			return;
		}
		if (!y.has_piece) {
			x.p.tile = y;
			y.add_piece(x.p);
			x.has_piece = false;
			return;
		}
		x.p.tile = y;
		killed.add(y.p);
		y.add_piece(x.p);
		x.has_piece = false;	
		
	}
}
