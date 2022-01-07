package myowncode;

import java.util.List;

import lombok.NonNull;

public class Ship {
	private IBoundary boundary; 
	public boolean isDestroyed(@NonNull List<LocationCoordinate> bombsList) {
		return bombsList.containsAll(boundary.getAllCoordinates());
	}
	public boolean contains(@NonNull LocationCoordinate loc) {
		return boundary.contains(loc);
	}
}
