package myowncode;

import java.util.List;

import lombok.NonNull;

public interface IBoundary {
	boolean contains(@NonNull LocationCoordinate loc);
	List<LocationCoordinate> getAllCoordinates();
}
