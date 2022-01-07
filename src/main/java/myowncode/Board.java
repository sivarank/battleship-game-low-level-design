package myowncode;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Board {
	private IBoundary boundary;
	private List<Ship> ships;
	private List<LocationCoordinate> bombLocations;
	
	public void takeHit(@NonNull LocationCoordinate loc) {		
		if(!boundary.contains(loc)) {
			throw new CoordinateOutOfBoundaryException();
		}
		bombLocations.add(loc);
		for(Ship ship : ships) {
			if(ship.contains(loc)) {
				System.out.println("Hit");
			}
		}
		System.out.println("Miss");
	}
	
	public boolean isAllShipsDestroyed() {
		for(Ship ship : ships) {
			if(! ship.isDestroyed(bombLocations)) {
				return false;
			}
		}
		return true;
	}

}
