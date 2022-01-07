package myowncode;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class Player {
	private Integer id;
	private Board board;
	private Player opponent; 
	
	public void takeHit(@NonNull LocationCoordinate loc) {
		board.takeHit(loc);
	}
}
